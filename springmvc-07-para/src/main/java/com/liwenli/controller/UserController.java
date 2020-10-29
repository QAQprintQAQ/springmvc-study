package com.liwenli.controller;

import com.liwenli.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

//    当接受到的参数和参数名一致的时候
    @GetMapping("/u")
    public String test(String name, Model model) {
        System.out.println("前端接收到的name=" + name);
        model.addAttribute("msg", name);
        return "nam";
    }

//    当前端接受的参数不一样时候记得加上@RequestParam("username")//前端名字
    @GetMapping("/u2")
    public String test2(@RequestParam("username") String name, Model model) {
        System.out.println("前端接收到的name=" + name);
        model.addAttribute("msg", name);
        return "nam2";
    }

//    当前端传递的是对象的时候,表单和实体类user对象的字段要保持一致
@GetMapping("/u3")
public String test3(User user) {
    System.out.println(user);
    return "nam3";
}

}
