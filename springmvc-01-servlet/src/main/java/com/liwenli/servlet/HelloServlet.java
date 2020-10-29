package com.liwenli.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取前端参数
        String method = req.getParameter("method");
        if (method.equals("helloworld")) {

            req.getSession().setAttribute("msg","helloworld");//网页显示的helloworld消息会以msg被传递到helloworld.jsp页面,helloworld.jsp最后以${msg}取得helloworld这条消息！！！

        }

//        调用业务层 ，暂时没有业务

//        试图转发或重定向
        req.getRequestDispatcher("/WEB-INF/jsp/helloworld.jsp").forward(req, resp);//转向的jsp页面,不是地址栏
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req,resp);//实现doGet的复用

    }
}
