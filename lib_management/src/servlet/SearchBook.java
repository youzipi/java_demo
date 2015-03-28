package servlet;

import dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * project_name:java_demo
 * package_name:servlet
 * user: youzipi
 * date: 2014/12/30 19:53
 */
public class SearchBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String keyword = request.getParameter("keyword");
        System.out.println("keyword=" + keyword);
        List list = new BookDao().query(keyword);
        request.setAttribute("list",list);
        request.getRequestDispatcher("/admin/query.jsp").forward(request, response);


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


    public static void main(String[] args) {

    }
}
