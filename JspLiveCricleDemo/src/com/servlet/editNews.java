package com.servlet;

import com.jdbc.DB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:com.servlet
 * user: youzipi
 * date: 2014/10/21
 */
public class editNews extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        String address = "";
        String title = "";
        String content = "";
        address = req.getParameter("address");
        title = req.getParameter("title");
        content = req.getParameter("content");
        new DB().update("update db_imagenews set imageAddress = \""+address+"\",newsTitle = \""+title+"\",newsContent=\""+content+"\"  WHERE id ="+id);
        String url = req.getHeader("Referer");
        //req.getRequestDispatcher(url).forward(null,null);
        //resp.sendRedirect(url);

    }
}
