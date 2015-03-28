<%@ page import="bean.Book" %>
<%@ page import="dao.BookDao" %>
<%@ page import="java.util.Collection" %>
<%--
  Created by IntelliJ IDEA.
  User: Youzipi
  Date: 2014/12/27
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title></title>
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <script src="./js/jQuery.js" type="text/javascript"></script>
    <style>
    </style>
    <script>
    </script>
</head>

<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
<button></button>
    </div>
</nav>
<table class="table  table-striped table-hover table-bordered">
    <%
        Collection list = new BookDao().query("");
        for (Object i : list) {
            Book book = (Book) i;
            out.println("<tr>");
            out.println("<td><input type=\"checkbox\" name=\"chose0\" /></td>");
            out.println("<td>" + book.getId() + "</td>");
            out.println("<td>" + book.getName() + "</td>");
            out.println("<td>" + book.getType() + "</td>");
            out.println("<td>" + book.getAuthor() + "</td>");
            out.println("<td>" + book.getAmount() + "</td>");
            out.println("<td>" + book.getPublisher() + "</td>");
            out.println("<td>" + book.getPub_time() + "</td>");
            out.println("<td>" + book.getLocation() + "</td>");
            out.println("<td ><a href=\"/newsedit.html\">编辑</a></td>");
            out.println("<td ><a href=\"/newsdelete?id=" + book.getId() + "\">删除</a></td>");
            out.println("</tr>");
        }
    %>
</table>
<br/>
</body>
</html>
