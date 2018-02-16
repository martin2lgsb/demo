package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 10:29
 */
@Data
public class Item {

    private Integer id;
    private String title;
    private String sell_point;
    private Integer price;
    private Integer num;
    private String barcode;
    private String image;
    private Integer cid;
    private Short status;

    private String created;
    private String updated;
}
