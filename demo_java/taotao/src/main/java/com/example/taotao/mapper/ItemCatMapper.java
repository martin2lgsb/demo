package com.example.taotao.mapper;

import com.example.taotao.domain.ItemCat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:38
 */
@Mapper
public interface ItemCatMapper {

    @Select("SELECT * FROM TB_ITEM_CAT WHERE ID = #{id}")
    ItemCat findItemCatById(@Param("id") Integer id);
}
