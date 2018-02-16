package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 10:43
 */
@Data
public class ItemParam {

    private Integer id;
    private Integer item_cat_id;
    private String param_data;

    private String created;
    private String updated;
}
