<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/9/23
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import="Users"  %>--%>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="myUsers" class="com.Users" ></jsp:useBean>//Users放在src中会出错。？
<%
    //myUsers user = new myUsers();
    myUsers.setUsername("admin");
    myUsers.setPassword("123qwe");
%>
<h1>useBean</h1>
<hr>
<%=myUsers.getUsername()  %>
<%=myUsers.getPassword()  %>
</body>
</html>
