package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 11:12
 */
@Data
public class OrderShipping {

    private Integer order_id;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_mobile;
    private String receiver_state;
    private String receiver_city;
    private String receiver_district;
    private String receiver_address;
    private String receiver_zip;

    private String created;
    private String updated;
}
