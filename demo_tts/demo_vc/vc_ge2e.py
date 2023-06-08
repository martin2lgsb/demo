#!/usr/bin/env python3
# author: M2LGSB
# content: one-shot voice clone withing GE2E speaker encoder modified from paddlespeech withing ECAPA-TDNN

$env CUDA_VISIBLE_DEVICES=0

import logging
import sys

import os
from pathlib import Path

import numpy as np
import paddle
import soundfile as sf
import yaml
from yacs.config import CfgNode

from paddlespeech.cli.vector import VectorExecutor
from paddlespeech.t2s.exps.syn_utils import get_am_inference
from paddlespeech.t2s.exps.syn_utils import get_voc_inference
from paddlespeech.t2s.frontend.zh_frontend import Frontend
from paddlespeech.vector.exps.ge2e.audio_processor import SpeakerVerificationPreprocessor
from paddlespeech.vector.models.lstm_speaker_encoder import LSTMSpeakerEncoder


# init config
am ='fastspeech2_aishell3'
am_config = 'download/fastspeech2_nosil_aishell3_vc1_ckpt_0.5/default.yaml'
am_ckpt = 'download/fastspeech2_nosil_aishell3_vc1_ckpt_0.5/snapshot_iter_96400.pdz'
am_stat = 'download/fastspeech2_nosil_aishell3_vc1_ckpt_0.5/speech_stats.npy'
phones_dict = "download/fastspeech2_nosil_aishell3_vc1_ckpt_0.5/phone_id_map.txt"

voc = 'pwgan_aishell3'
voc_config = 'download/pwg_aishell3_ckpt_0.5/default.yaml'
voc_ckpt = 'download/pwg_aishell3_ckpt_0.5/snapshot_iter_1000000.pdz'
voc_stat = 'download/pwg_aishell3_ckpt_0.5/feats_stats.npy'

with open(am_config) as f:
    am_config = CfgNode(yaml.safe_load(f))
with open(voc_config) as f:
    voc_config = CfgNode(yaml.safe_load(f))

# spk pre-processor
p = SpeakerVerificationPreprocessor(
            sampling_rate=16000,
            audio_norm_target_dBFS=-30,
            vad_window_length=30,
            vad_moving_average_width=8,
            vad_max_silence_length=6,
            mel_window_length=25,
            mel_window_step=10,
            n_mels=40,
            partial_n_frames=160,
            min_pad_coverage=0.75,
            partial_overlap_ratio=0.5)


# load model
vec_executor = VectorExecutor()
frontend = Frontend(phone_vocab_path=phones_dict)

# AM
am_inference = get_am_inference(
    am=am,
    am_config=am_config,
    am_ckpt=am_ckpt,
    am_stat=am_stat,
    phones_dict=phones_dict)

# VOC
voc_inference = get_voc_inference(
    voc=voc,
    voc_config=voc_config,
    voc_ckpt=voc_ckpt,
    voc_stat=voc_stat)

# SPK encoder
speaker_encoder = LSTMSpeakerEncoder(n_mels=40, num_layers=3, hidden_size=256, output_size=256)
speaker_encoder.set_state_dict(paddle.load('download/ge2e_ckpt_0.3/step-3000000.pdparams'))
speaker_encoder.eval()


# voice clone
ref_audio_path = 'download/ref_audio/1.wav'
sentence = '每当你觉得，想要批评什么人的时候，你切要记着，这个世界上的人，并非都具备你禀有的条件。'

input_ids = frontend.get_input_ids(sentence, merge_sentences=True)
phone_ids = input_ids["phone_ids"][0]

mel_sequences = p.extract_mel_partials(p.preprocess_wav(ref_audio_path))
with paddle.no_grad():
    spk_emb = speaker_encoder.embed_utterance(paddle.to_tensor(mel_sequences))
with paddle.no_grad():
    wav = voc_inference(am_inference(phone_ids, spk_emb=spk_emb))

sf.write(
    "output.wav",
    wav.numpy(),
    samplerate=am_config.fs)
