package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 10:52
 */
@Data
public class Order {

    private Long order_id;
    private String payment;
    private Short payment_type;
    private String post_fee;
    private Short status;
    private String create_time;
    private String update_time;
    private String payment_time;
    private String consign_time;
    private String end_time;
    private String close_time;
    private String shipping_name;
    private String shipping_code;
    private Integer user_id;
    private String buyer_message;
    private String buyer_nick;
    private Short buyer_rate;


}
