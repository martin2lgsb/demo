package com.example.taotao.service;

import org.springframework.stereotype.Service;

/**
 * Created by m2lgsb on 16/02/2018 13:10
 */
@Service
public class ItemPriceUpService {

    private Integer up = 99;

    public Integer upNine(Integer oldPrice) {
        Integer newPrice = oldPrice + up;
        return newPrice;
    }

}
