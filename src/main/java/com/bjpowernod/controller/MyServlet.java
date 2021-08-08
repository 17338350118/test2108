package com.bjpowernod.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        
        if("/student/insert".equals(path)){

            insert(req,resp);

        }else if("/student/delete".equals(path)){

            delete(req,resp);

        }else if("/student/update".equals(path)){

            update(req,resp);

        }else if("/student/select".equals(path)){

            select(req,resp);

        }
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("查询");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("修改");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("删除");

    }

    private void insert(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("增加");
    }
}
