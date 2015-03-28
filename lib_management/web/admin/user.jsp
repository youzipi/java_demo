<%@ page import="bean.User" %>
<%@ page import="dao.UserDao" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: Youzipi
  Date: 2014/12/26
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <%--<meta charset="UTF-8">--%>
    <title></title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="../js/jQuery.js" type="text/javascript"></script>
    <style>
        .pagination{
            width: 293px;
            margin-left: auto;
            margin-right: auto;
        }
        .pagination li{
            cursor:pointer;
        }
        .table{
            margin-left: 20px;
            margin-right:20px;
        }
        thead .id{
            width: 60px;
        }
        .delete{
            float: right;
        }
    </style>
    <script>
    </script>
</head>

<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <ul class="nav navbar-nav">
            <li><a href="#">查询</a></li>
            <li><a href="#">修改</a></li>
            <li><a href="#">统计</a></li>
            <li><a href="./user_add.jsp">新增/编辑用户</a></li>
            <li><a href="book_add.jsp">新增/编辑图书</a></li>
            <li><a href="./book.jsp">图书</a></li>
            <li class="active"><a href="./user.jsp">用户</a></li>
        </ul>
        <%--<ul class="nav navbar-right">--%>
            <%--<button type="button" class="btn btn-default navbar-btn">Sign in</button>--%>
            <%--<button type="button" class="btn btn-default navbar-btn">Log out</button>--%>
        <%--</ul>--%>
    </div>
</nav>
<table class="table  table-striped table-hover table-bordered">
    <%
        Collection list=new UserDao().query();  //分页显示
        for (Object aList : list) {
            User user = (User) aList;
            out.println("<tr>");
            out.println("<td><input type=\"checkbox\" name=\"chose0\" /></td>");
            out.println("<td>" + user.getId() + "</td>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("<td>" + user.getGroup() + "</td>");
            out.println("<td>" + user.getDepartment() + "</td>");
            out.println(String.format("<td ><a href=\"/admin/user_edit.jsp?id=%s&name=%s&group=%s&department=%s\">编辑</a></td>", user.getId(),user.getName(),user.getGroup(),user.getDepartment()));
            out.println("<td ><a href=\"/newsdelete?id=" + user.getId() + "\">删除</a></td>");
            out.println("</tr>");
        }
    %>
</table>
<br/>


</ul>


</body>
</html>

