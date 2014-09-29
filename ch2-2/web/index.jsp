<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/26
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>ch2-2/index</h1>
  <form method="post" action="hello.do">
      Your name:<input type="text" name="name">
      <br>
      Password:<input type="password" name="password">
      <input type="submit" value="POST">
  </form>
<form method="get" action="hello.do">
    Your name:<input type="text" name="name">
    <br>
    Password:<input type="password" name="password">
    <input type="submit" value="GET">
</form>
  </body>
</html>
