<%--
  Created by IntelliJ IDEA.
  User: Youzipi
  Date: 2014/12/26
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="./css/bootstrap.min.css" rel="stylesheet">
<html>
  <head>
    <title></title>
  </head>
  <body>
  <div class="jumbotron" id="content">
      <div class="container">
          <h1>图书馆</h1>
      </div>
      <ul class="nav nav-pills" >
          <li role="presentation" class="active" style="float: right;"><a href="admin/book.jsp">Admin</a></li>
      </ul>
  </div>
  <div class="col-lg-6" style="margin-left: 25%;">
      <form action="booklist.jsp" method="post" class="input-group">
          <input type="text" class="form-control">
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">搜索</button>
      </span>
      </form>
  </div>
  </body>
</html>
