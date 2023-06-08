package com.demo.aigc.model;

import lombok.Data;

@Data
public class SDSuperResolutionPayload {
    private String key;
    private String url;
    private Integer scale = 3;
    private String webhook = null;
    private Boolean face_enhance = false;
}
