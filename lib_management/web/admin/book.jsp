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
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="../js/jQuery.js" type="text/javascript"></script>
    <style>

        .pagination li {
            cursor: pointer;
        }

        .table {
            margin-left: 20px;
            margin-right: 20px;
        }
    </style>
    <script>
    </script>
</head>

<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <ul class="nav navbar-nav">
            <li><a href="query.jsp">查询</a></li>
            <li><a href="#">修改</a></li>
            <li><a href="#">统计</a></li>
            <li><a href="user_add.jsp">新增/编辑用户</a></li>
            <li><a href="book_add.jsp">新增/编辑图书</a></li>
            <li class="active"><a href="./book.jsp">图书</a></li>
            <li><a href="user.jsp">用户</a></li>
        </ul>
    </div>
</nav>
<div class="col-lg-6" style="margin-left: 25%;">
    <form action="admin/searchbook" method="post" class="input-group">
        <label>
            <input type="text" class="form-control" name="keyword">
        </label>
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">搜索</button>
      </span>
    </form>
</div>
<table class="table  table-striped table-hover table-bordered">
    <%
        Collection list;
        list = (Collection)request.getAttribute("list");
        if(list == null){
            list = new BookDao().init();
        }
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
