package com.example.taotao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:34
 */
@Mapper
public interface Item {

    @Select("SELECT * FROM TB_ITEM WHERE ID = #{id}")
    Item findItemById(@Param("id") Integer id);
}
