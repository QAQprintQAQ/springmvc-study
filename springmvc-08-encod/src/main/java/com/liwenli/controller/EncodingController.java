package com.liwenli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {
    @PostMapping("/show")//这个页面是不需要写的！
    public String test(Model model ,String name) {
        model.addAttribute("msg", name);
        return "/encoding";//在前端浏览器展示的页面
    }
}
