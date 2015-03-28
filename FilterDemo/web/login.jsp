<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/11/8
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="<%=request.getContextPath()  %>/LoginServlet" method="POST">
    username:<input type="text" name="username">
    username:<input type="password" name="password">
    <input type="submit" value="submit">

</form>

</body>
</html>
