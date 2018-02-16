package com.example.taotao.mapper;

import com.example.taotao.domain.ItemParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:45
 */
@Mapper
public interface ItemParamMapper {

    @Select("SELECT * FROM TB_ITEM_PARAM WHERE ID = #{id}")
    ItemParam findItemParamById(@Param("id") Integer id);
}
