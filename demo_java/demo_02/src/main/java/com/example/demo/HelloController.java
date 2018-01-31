package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m2lgsb on 31/01/2018
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index page.";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello Bitch!";
    }

}
