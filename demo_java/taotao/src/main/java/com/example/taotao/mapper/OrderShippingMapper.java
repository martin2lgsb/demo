package com.example.taotao.mapper;

import com.example.taotao.domain.OrderShipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 11:15
 */
@Mapper
public interface OrderShippingMapper {

    @Select("SELECT * FROM TB_ORDER_SHIPPING WHERE ORDER_ID = #{id}")
    OrderShipping findOrderShippingById(@Param("id") Integer id);
}
