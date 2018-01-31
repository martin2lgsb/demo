package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

/**
 * Created by m2lgsb on 31/01/2018
 */
//@RestController
@Controller
//@RequestMapping("/")
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("info", "FuckInfo, yeah!");
        return "index/index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Bitch!";
    }

    @GetMapping("/say/{id}")
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

//    @RequestMapping(value = "/sayp", method = RequestMethod.GET)
    @GetMapping(value = "/sayp")
    public String sayp(@RequestParam(value = "id", required = false, defaultValue = "666") Integer myid) {
        return "sayp: " + myid;
    }

}
