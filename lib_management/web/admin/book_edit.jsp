<%--
  Created by IntelliJ IDEA.
  User: Youzipi
  Date: 2014/12/27
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<html>
<head>
    <title>user_edit</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="../js/jQuery.js" type="text/javascript"></script>
</head>
<body>

<nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <ul class="nav navbar-nav">
            <li><a href="#">查询</a></li>
            <li><a href="#">修改</a></li>
            <li><a href="#">统计</a></li>
            <li><a href="./user_add.jsp">新增/编辑用户</a></li>
            <li class="active"><a href="./book_add.jsp">新增/编辑图书</a></li>
            <li><a href="book.jsp">图书</a></li>
            <li><a href="user.jsp">用户</a></li>
        </ul>
        <%--<ul class="nav navbar-right">--%>
            <%--<button type="button" class="btn btn-default navbar-btn">Sign in</button>--%>
            <%--<button type="button" class="btn btn-default navbar-btn">Log out</button>--%>
        <%--</ul>--%>
    </div>
</nav>
<form class="form-horizontal" role="form">
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Name</label>

        <div class="col-sm-4">
            <input class="form-control" id="name" placeholder="Name">
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Group</label>

        <div class="col-sm-4">
            <select class="form-control">
                <option>本科生</option>
                <option>研究生</option>
                <option>教师</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="department" class="col-sm-2 control-label">Department</label>

        <div class="col-sm-4">
            <input class="form-control" id="department" placeholder="Department">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form>
</body>
</html>
