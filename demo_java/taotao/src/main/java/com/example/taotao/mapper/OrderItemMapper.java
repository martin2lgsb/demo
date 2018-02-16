package com.example.taotao.mapper;

import com.example.taotao.domain.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 11:10
 */
@Mapper
public interface OrderItemMapper {

    @Select("SELECT * FROM TB_ORDER_ITEM WHERE ID = #{id}")
    OrderItem findOrderItemById(@Param("id") Integer id);
}

