package com.liwenli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//注解相当于接口？
@RequestMapping("/hello")//父目录
public class HelloController {

    @RequestMapping("/hello1")//子级目录 //        http://localhost:8080/springmvc_04_annotation_war_exploded/hello/hello1

    public String hello1(Model model) {
        //封装数据
                model.addAttribute("msg", "hello1 springmvc");
        //返回视图解析器处理:
        return "hello1";
    }


      @RequestMapping("/hello2")//子级目录          //        http://localhost:8080/springmvc_04_annotation_war_exploded/hello/hello2

      public String hello2(Model model) {
        //封装数据
        model.addAttribute("msg", "hello2 springmvc");
        //返回视图解析器处理:
        return "hello2";

      }


      @RequestMapping("/hello3")//子级目录          //        http://localhost:8080/springmvc_04_annotation_war_exploded/hello/hello3

      public String hello3(Model model) {
        //封装数据
        model.addAttribute("msg", "hello3 springmvc");
        //返回视图解析器处理:
        return "hello3";

      }


}
