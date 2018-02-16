package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 10:12
 */
@Data
public class Content {

    private Integer id;
    private Integer category_id;
    private String title;
    private String sub_title;
    private String title_desc;
    private String url;
    private String pic;
    private String pic2;
    private String content;

    private String created;
    private String updated;
}
