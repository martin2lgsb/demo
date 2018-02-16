package com.example.taotao.mapper;

import com.example.taotao.domain.ItemDesc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:41
 */
@Mapper
public interface ItemDescMapper {

    @Select("SELECT * FROM TB_ITEM_DESC WHERE ITEM_ID = #{id}")
    ItemDesc findItemDescById(@Param("id") Integer id);
}
