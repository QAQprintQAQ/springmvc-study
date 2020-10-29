package com.liwenli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

@Controller
public class ControllerTest2 {


    @RequestMapping("/hello1")//子级目录
    public String hello1(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello1 SpringMVC Annotation");
        //返回视图解析器处理:
        return "hello1";
    }


    @RequestMapping("hello2")
    public String redirect(Model model) {

        model.addAttribute("msg", "redirect");

        return "redirect:hello1";
    }

    @RequestMapping("hello3")
    public String forward(Model model) {

        model.addAttribute("msg", "forward");

        return "hello2";
    }

    @RequestMapping("hello4")
    public String forward2(Model model) {

        model.addAttribute("msg", "forward index");
        return "forward:/index2.jsp";
    }

    @RequestMapping("hello5")
    public String redirect2(Model model) {
        model.addAttribute("msg", "redirect index");
        return "redirect:/index3.jsp";
    }
}

