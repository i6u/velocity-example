package com.witt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(urlPatterns = "/fs")
public class FirstServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("abc...");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println("cookie:" +
                    cookie.getName() + "\n" +
                    cookie.getComment() + "\n" +
                    cookie.getDomain() + "\n" +
                    cookie.getValue() + "\n" +
                    cookie.getMaxAge() + "\n" +
                    cookie.getSecure() + "\n" +
                    cookie.getVersion() + "\n" +
                    cookie.getPath() + "\n");
        }

        Cookie responseCookie = new Cookie("token",UUID.randomUUID().toString());
        response.addCookie(responseCookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
