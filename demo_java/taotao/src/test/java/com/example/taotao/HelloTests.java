package com.example.taotao;

import com.example.taotao.domain.User;
import com.example.taotao.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by m2lgsb on 16/02/2018 09:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User u = userMapper.findUserById(9);
        Assert.assertEquals("zhangsan1", u.getUsername());
    }
}
