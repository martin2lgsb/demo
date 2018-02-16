package com.example.taotao.mapper;

import com.example.taotao.domain.ContentCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 10:27
 */
@Mapper
public interface ContentCategoryMapper {

    @Select("SELECT * FROM TB_CONTENT_CATEGORY WHERE ID = #{id}")
    ContentCategory findContentCategoryById(@Param("id") Integer id);
}
