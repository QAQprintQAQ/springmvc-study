package com.liwenli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//注解相当于接口？
@RequestMapping("/hello")//父目录
public class ControllerTest2 {

    @RequestMapping("/hello1")//子级目录
    public String hello1(Model model) {
        //封装数据
                model.addAttribute("msg", "Hello1 SpringMVC Annotation");
        //返回视图解析器处理:
        return "hello1";
    }


      @RequestMapping("/hello2")//子级目录

      public String hello2(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello2 SpringMVC Annotation");
        //返回视图解析器处理:
        return "hello2";

      }


      @RequestMapping("/hello3")//子级目录

      public String hello3(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello3 SpringMVC Annotation");
        //返回视图解析器处理:
        return "hello3";

      }


}
