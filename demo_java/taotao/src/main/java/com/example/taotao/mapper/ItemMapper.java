package com.example.taotao.mapper;

import com.example.taotao.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by m2lgsb on 16/02/2018 11:42
 */
@Mapper
public interface ItemMapper {

    @Select("SELECT * FROM TB_ITEM WHERE ID = #{id}")
    Item findItemById(@Param("id") Integer id);

    @Select("SELECT * FROM TB_ITEM LIMIT #{offset}, #{limit}")
    List<Item> findItemsByLimit(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
