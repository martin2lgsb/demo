package com.example.taotao.mapper;

import com.example.taotao.domain.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:17
 */
@Mapper
public interface ContentMapper {

    @Select("SELECT * FROM TB_CONTENT WHERE ID = #{id}")
    Content findContentById(@Param("id") Integer id);
}
