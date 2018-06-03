package com.witt.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author witt
 * @fileName ExampleServlet
 * @date 2018/6/2 19:15
 * <p>
 * @description Servelt 练习示例
 * </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print("开始很难</br>" +
                "坚持更难</br>" +
                "多数人能迈出第一步</br>" +
                "多少人能坚持一直走</br>" +
                "人生有阶段性的收获</br>" +
                "却没有你想要的结果</br>" +
                "停下来了</br>" +
                "就是生命的尽头</br>" +
                "</br>" +
                "一直爱你</br>" +
                "</br>" +
                "-- 我");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req,resp);
    }

}
