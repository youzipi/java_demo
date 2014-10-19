package com;

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
 * date: 2014/10/9
 */
public class Ajax extends HttpServlet{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
        throws ServletException, IOException{
        res.setContentType("text/xml;charset=UTF-8");
        try{
            PrintWriter out = res.getWriter();

            String old = req.getParameter("name");
            System.out.println("old:"+old+"end");
            if(old == null || old == ""){
                System.out.println("null");
                out.print("<p style='color:red;font-weight:bold;'>Error:not null。。</p>");
            }
            else{
                //String name = new String(old.getBytes("ISO8859-1"),"gb2312");
                System.out.println(old);
                String name = old;
                out.println(name);
                //同res.getWriter().write(name);
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
