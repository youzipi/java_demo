package view;

import model.Bookmark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * project_name:java_demo
 * package_name:view
 * user: youzipi
 * date: 2014/8/26
 */
public class ListBookMark extends HttpServlet {
    private List<Bookmark> bookmarkList;

    public ListBookMark(){
        bookmarkList = new LinkedList<Bookmark>();
        bookmarkList.add(
                new Bookmark(
                        "http://book.douban.com/subject/4735487/","Servlet&JSP 学习笔记","javaweb"));
        bookmarkList.add(
                new Bookmark(
                        "http://book.douban.com/subject/1942934/","Head First Servlets&JSP","javaweb"));
        bookmarkList.add(
                new Bookmark(
                        "http://book.douban.com/subject/3165398/","Servlet/JSP深入详解","javaweb"));
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=utf-8");


    }
}
