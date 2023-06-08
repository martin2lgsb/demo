package com.demo.aigc.model;

import lombok.Data;

@Data
public class DBTxt2ImgPayload {
    private String key;
    private Integer model_id;
    private String prompt;
    private String negative_prompt;
    private Integer width = 512;
    private Integer height = 512;
    private Integer samples = 1;
    private Integer num_inference_steps = 20;
    private Integer seed = null;
    private Float guidance_scale = 7.5F;
    private String webhook = null;
    private Integer track_id = null;
}
