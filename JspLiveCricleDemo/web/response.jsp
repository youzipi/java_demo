<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/28
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<% response.setContentType("text/html;chardet=utf-8"); %>
<h1>response 内置对象</h1>
<br />
<%
    out.println("out object");
    //out.flush();
    PrintWriter outer = response.getWriter();//response的输出流对象优先于内置的out对象
    outer.println("response生成的输出流对象");
    //response.sendRedirect("request.jsp");
    request.getRequestDispatcher("request.jsp").forward(request,response);
%>
<a href="reg.jsp">reg.jsp</a>
</body>
</html>
