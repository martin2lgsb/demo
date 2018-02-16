package com.example.taotao.controller;

import com.example.taotao.domain.User;
import com.example.taotao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m2lgsb on 16/02/2018 08:52
 */
//@RestController
@Controller
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findbyid/{id}")
    public String googleId(@PathVariable("id") Integer id, Model model) {
        User u = userMapper.findUserById(id);
        model.addAttribute("info", u);
        return "hello/hello";
    }

    @GetMapping("/findbyphone/{phone}")
    public String googlePhone(@PathVariable("phone") String phone, Model model) {
        User u = userMapper.findUserByPhone(phone);
        model.addAttribute("info", u.getUsername());
        return "hello/hello";
    }
}
