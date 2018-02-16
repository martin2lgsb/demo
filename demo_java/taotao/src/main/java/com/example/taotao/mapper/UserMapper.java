package com.example.taotao.mapper;

import com.example.taotao.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by m2lgsb on 16/02/2018 08:43
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM TB_USER WHERE PHONE = #{phone}")
    User findUserByPhone(@Param("phone") String phone);

    @Select("SELECT * FROM TB_USER WHERE ID = #{id}")
    User findUserById(@Param("id") Integer id);

    @Insert("INSERT INTO TB_USER(USERNAME, PASSWORD, PHONE, EMAIL) VALUES(#{username}, #{password}, #{phone}, #{email})")
    int insert(@Param("username") String username, @Param("password") String password, @Param("phone") String phone, @Param("email") String email);
}
