package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 10:23
 */
@Data
public class ContentCategory {

    private Integer id;
    private Integer parent_id;
    private String name;
    private Short status;
    private Short sort_order;
    private Boolean is_parent;

    private String created;
    private String updated;
}
