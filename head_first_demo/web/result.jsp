<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: youzipi
  Date: 2014/8/26
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p></p>
<%
    List styles = (List)request.getAttribute("styles");
    for(Object style: styles){
        out.println("<br>try: " + style);
    }
%>
</body>
</html>
