<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/9/22
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.Users"  %>
<html>
<head>
    <title></title>
</head>
<body>
<% 
    Users user = new Users();
    user.setUsername("admin");
    user.setPassword("123qwe");
%>
<h1>javabean</h1>
<hr>
<%=user.getUsername()  %>
<%=user.getPassword()  %>
</body>
</html>
