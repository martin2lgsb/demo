package com.example.taotao.controller;

import com.example.taotao.domain.Item;
import com.example.taotao.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by m2lgsb on 16/02/2018 11:39
 */
@Controller
//@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @GetMapping("/by/{id}")
    public String googleId(@PathVariable("id") Integer id, Model model) {
        Item i = itemMapper.findItemById(id);
        model.addAttribute("info", i.getTitle());
        return "hello/hello";
    }

    @GetMapping("/group/{offset}/{limit}")
    public String groupCount(@PathVariable("offset") Integer offset, @PathVariable("limit") Integer limit, Model model) {
        List<Item> ii = itemMapper.findItemsByLimit(offset, limit);
        model.addAttribute("items", ii);
        model.addAttribute("findid", 691300);
        return "item/index";
//        return ii;
    }
}
