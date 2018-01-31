package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * Created by m2lgsb on 31/01/2018
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index page";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Bitch!";
    }

    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

//    @RequestMapping(value = "/sayp", method = RequestMethod.GET)
    @GetMapping(value = "/sayp")
    public String sayp(@RequestParam(value = "id", required = false, defaultValue = "666") Integer myid) {
        return "sayp: " + myid;
    }

}
