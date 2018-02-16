package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 11:06
 */
@Data
public class OrderItem {

    private Integer id;
    private Integer item_id;
    private String order_id;
    private Integer num;
    private String title;
    private Long price;
    private Long total_fee;
    private String pic_path;
}
