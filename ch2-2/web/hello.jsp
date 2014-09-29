
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/26
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>${message}</h1>
<%
    String message = (String)request.getAttribute("message");
    if (message.equals("error"))
        out.print("<a href='http://localhost:8080/ch2-2/'>Return</a>");
%>
</body>
</html>
