package com.liwenli.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

//        业务代码
//        modelAndView.addObject("msg", "HelloSpringMVC");//替换为下面的
        String result = "HelloSpringMVC";
        modelAndView.addObject("msg", result);
//        视图跳转
        modelAndView.setViewName("hello");//WEB-INF/jsp/hello.jsp

        return modelAndView;
    }
}
