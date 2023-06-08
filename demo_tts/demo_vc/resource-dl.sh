# pip install paddlespeech
!git clone https://github.com/PaddlePaddle/PaddleSpeech.git
$cd PaddleSpeech
!pip install .

# nltk
!wget https://paddlespeech.bj.bcebos.com/Parakeet/tools/nltk_data.tar.gz
!tar zxvf nltk_data.tar.gz

# model
!wget -P download https://paddlespeech.bj.bcebos.com/Parakeet/released_models/fastspeech2/fastspeech2_aishell3_ckpt_vc2_1.2.0.zip
!unzip -o -d download download/fastspeech2_aishell3_ckpt_vc2_1.2.0.zip
!wget -P download https://paddlespeech.bj.bcebos.com/Parakeet/released_models/pwgan/pwg_aishell3_ckpt_0.5.zip
!unzip -o -d download download/pwg_aishell3_ckpt_0.5.zip
!wget -P download https://paddlespeech.bj.bcebos.com/Parakeet/released_models/fastspeech2/fastspeech2_nosil_aishell3_vc1_ckpt_0.5.zip
!unzip -o -d download download/fastspeech2_nosil_aishell3_vc1_ckpt_0.5.zip

#ge2e
!wget -P download https://bj.bcebos.com/paddlespeech/Parakeet/released_models/ge2e/ge2e_ckpt_0.3.zip
!unzip -o -d download download/ge2e_ckpt_0.3.zip

# rel_audio
!wget -P download https://paddlespeech.bj.bcebos.com/Parakeet/docs/demos/ref_audio.zip
!unzip -o -d download download/ref_audio.zip
