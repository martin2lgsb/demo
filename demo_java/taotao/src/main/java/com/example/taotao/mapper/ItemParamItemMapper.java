package com.example.taotao.mapper;

import com.example.taotao.domain.ItemParamItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:50
 */
@Mapper
public interface ItemParamItemMapper {

    @Select("SLECT * FROM TB_ITEM_PARAM_ITEM WHERE ID = #{id}")
    ItemParamItem findItemParamItemById(@Param("id") Integer id);
}
