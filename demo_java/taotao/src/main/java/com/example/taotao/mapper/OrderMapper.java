package com.example.taotao.mapper;

import com.example.taotao.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 11:04
 */
@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM TB_ORDER WHERE ORDER_ID = #{id}")
    Order findOrderById(@Param("id") Integer id);
}
