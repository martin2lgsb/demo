package com.demo.aigc.model;

import lombok.Data;

@Data
public class SDInpaintingPayload {
    private String key;
    private String prompt;
    private String negative_prompt;
    private String init_image;
    private String mask_image;
    private Integer width = 512;
    private Integer height = 512;
    private Integer samples = 1;
    private Integer num_inference_steps = 30;
    private Float guidance_scale = 7.5F;
    private Float strength = 0.7F;
    private Integer seed = null;
    private String webhook = null;
    private Integer track_id = null;
}
