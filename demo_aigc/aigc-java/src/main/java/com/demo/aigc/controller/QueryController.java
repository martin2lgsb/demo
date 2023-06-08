package com.demo.aigc.controller;

import com.demo.aigc.service.Txt2ImgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class QueryController {

    @Resource
    Txt2ImgService txt2ImgService;

    @GetMapping("/txt2img")
    public String getTxt2ImgRes(
            @RequestParam String prompt
    ) {
        String res = txt2ImgService.txt2Img(prompt);
        return res;
    }

    @GetMapping("/img2img")
    public String getImg2ImgRes() {
        String res = "res";
        return res;
    }
}
