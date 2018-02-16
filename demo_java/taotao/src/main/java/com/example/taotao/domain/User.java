package com.example.taotao.domain;

import lombok.Data;

/**
 * Created by m2lgsb on 16/02/2018 08:39
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;

    private String created;
    private String updated;
}
