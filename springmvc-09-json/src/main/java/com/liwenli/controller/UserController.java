package com.liwenli.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liwenli.pojo.User;
import com.liwenli.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

//@Controller
//public class UserController {
//
//    @RequestMapping("/jsonpage")
//    @ResponseBody //不会走视图解析器，直接返回字符串
//    public String jsontest(Model model) {
//        User user = new User("李文利", 19, "man");
//
//        return user.toString();//前台接受不需要跳转页面
//    }
//
//    @RequestMapping("/jsonpage2")
//    @ResponseBody //配合@Controller不会走视图解析器，直接返回字符串
//    public String jsontest2(Model model) throws JsonProcessingException {
//
//        ObjectMapper objectMapper = new ObjectMapper();//这是jackson.databind提供的方法
//        User user = new User("李文利", 19, "man");
//        String str = objectMapper.writeValueAsString(user);//jackson.databind提供的方法,需要抛出异常
//        return str;//前台接受不需要跳转页面
//
//        /*
//            会出现乱码问题
//            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
//         */
//    }
//}
//
//
//
//


@RestController
public class UserController {

    @RequestMapping("/jsonpage3")
    public String jsontest2(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();//这是jackson.databind提供的方法
        User user = new User("李文利", 19, "man");
        String str = objectMapper.writeValueAsString(user);//jackson.databind提供的方法,需要抛出异常
        return str;//前台接受不需要跳转页面

        /*
            会出现乱码问题
            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
         */
    }

    @RequestMapping("/jsonpage4")
    public String jsontest3(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();//这是jackson.databind提供的方法
        List<User> userList=new ArrayList<User>() ;
        User user = new User("李文利", 19, "男");
        User user2 = new User("李文利2", 19, "男");
        User user3 = new User("李文利3", 19, "男");
        User user4 = new User("李文利4", 19, "男");
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String str = objectMapper.writeValueAsString(userList);//jackson.databind提供的方法,需要抛出异常
        return str;//前台接受不需要跳转页面

        /*
            会出现乱码问题
            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
         */
    }


    @RequestMapping("/jsonpage5")
    public String jsontest4(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();//这是jackson.databind提供的方法
        Date date = new Date();//将时间解析后的默认格式为:timestamp
        String str = objectMapper.writeValueAsString(date);//jackson.databind提供的方法,需要抛出异常
        return str;//前台接受不需要跳转页面

        /*
            会出现乱码问题
            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
         */
    }

    @RequestMapping("/jsonpage6")
    public String jsontest5(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();//这是jackson.databind提供的方法
        Date date = new Date();//将时间解析后的默认格式为:timestamp
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");//自定义时间格式
        String simpleDate = simpleDateFormat.format(date);
        String str = objectMapper.writeValueAsString(simpleDate);//jackson.databind提供的方法,需要抛出异常
        return str;//前台接受不需要跳转页面

        /*
            会出现乱码问题
            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
         */
    }

    @RequestMapping("/jsonpage7")
    public String jsontest6(Model model) throws JsonProcessingException {


        Date date = new Date();//将时间解析后的默认格式为:timestamp

        return JsonUtils.getJson(date, "yyyy-mm-dd hh:mm:ss");

        /*
            会出现乱码问题
            因为没有走前端的过滤器，所以过滤器是不管用的，需要我们在springmvc中进行配置
         */
    }

}
