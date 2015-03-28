package servlet;

import bean.Book;
import dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * project_name:java_demo
 * package_name:servlet
 * user: youzipi
 * date: 2015/1/2 17:07
 */
public class UpdateBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String group = request.getParameter("group");
        String department = request.getParameter("department");
        System.out.println("id=" + id);
        System.out.println("name=" + name);
        System.out.println("group=" + group);
        System.out.println("department=" + department);
        Book book = new Book();
        int num = -1;
        if(id == null || "null".equals(id)){
            num = new BookDao().insert(book);
        }
        else{
            num = new BookDao().update(book);
        }
        if (num != -1){
            PrintWriter out = response.getWriter();
            out.println("<h1>success</h1>");
            out.println("<a href=\"user.jsp\">user</a>");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }


    public static void main(String[] args) {

    }
}
