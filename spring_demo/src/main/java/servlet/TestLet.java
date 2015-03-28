package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * project_name:java_demo
 * package_name:${PACKAGE_NAME}
 * user: youzipi
 * date: 2015/3/27 16:03
 */
@WebServlet(name = "TestLet",urlPatterns="/*")
public class TestLet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("test");
    }
}
