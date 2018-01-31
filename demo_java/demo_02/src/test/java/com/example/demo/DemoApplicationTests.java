package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {

		userMapper.insert("fuckbitch", "334455", "11122223333");
		User u = userMapper.findUserByPhone("11122223333");
		Assert.assertEquals("fuckbitch", u.getName());
	}

}
