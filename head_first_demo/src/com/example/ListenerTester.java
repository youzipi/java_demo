package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/9/1
 */
public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("test context attributes set by listenrrrrrrrrrr<br><br/>");
        Dog dog = (Dog)getServletContext().getAttribute("dog"); //Object
        out.println("Dog's type is: "+dog.getType());
    }
}
