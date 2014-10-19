<%@ page import="com.newsPage" %>
<%@ page import="net.sf.json.JSONArray" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/10/13
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    JSONArray newslist = newsPage.load();
    out.println(newslist);
    out.println(newslist.getClass());
%>

</body>
</html>
