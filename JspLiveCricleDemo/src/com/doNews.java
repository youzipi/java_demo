package com;

import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * project_name:java_demo
 * package_name:com
 * user: youzipi
 * date: 2014/10/14
 */
public class doNews extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/xml;charset=UTF-8");
        try{
            JSONArray newslist = (new newsPage()).load();
            PrintWriter out = res.getWriter();
            out.write(String.valueOf(newslist));
            System.out.println(newslist);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
