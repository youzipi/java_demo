<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/9/20
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>session Page</h1>
<hr />
<%
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date d = new Date();
%>
session创建时间：<%=session.getCreationTime()  %><br/>
<h1>page对象</h1>
page.toString():<%=page.toString()  %><br>
<h1>pageContext对象</h1>
<%=pageContext.getSession().getAttribute("username")  %><br/>
<%=pageContext.getSession()  %><br/>


</body>
</html>
