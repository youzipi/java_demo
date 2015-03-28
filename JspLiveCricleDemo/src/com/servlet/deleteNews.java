package com.servlet;

import com.jdbc.DB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * project_name:java_demo
 * package_name:com.servlet
 * user: youzipi
 * date: 2014/10/21
 */
public class deleteNews extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList idlist = new ArrayList();
        int id = Integer.parseInt(req.getParameter("id"));
        //idlist = req.getAttribute("idlist"));
        new DB().delete("delete from db_imagenews where id="+id);
        new DB().delete("delete from db_imagenews where id in"+idlist);
        String url = req.getHeader("Referer");
        //req.getRequestDispatcher(url).forward(null,null);
        resp.sendRedirect(url);

    }
}
