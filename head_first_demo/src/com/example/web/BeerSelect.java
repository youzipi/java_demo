package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * project_name:java_demo
 * package_name:com.example.web
 * user: youzipi
 * date: 2014/8/26
 */
public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException{

        String c = request.getParameter("color");

        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);


/*        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice");
        //out.println("<br>Got beer color " + c);
        Iterator it = result.iterator();
        while (it.hasNext()){
            out.print("<br>Try: " + it .next());
        }*/

        request.setAttribute("styles", result); //为请求对象增加styles属性
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");        //为JSP实例化一个请求分派器
        view.forward(request, response);
    }
}
