package com.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by peng.luwei on 2014/11/16.
 */
public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println("req = " + req.getAttribute("s"));

        System.out.println("==============================");
        resp.sendRedirect("http://localhost:9080/s/home.jsp");
//        req.getRequestDispatcher("/home.jsp").forward(req,resp);

    }
}
