<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/28
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Sign up</h1>
<hr/>
<form name="regForm" action="response.jsp" method="post">
      <table>
          <tr>
              <td>Username:</td>
              <td><input type="text" name="username"/></td>
          </tr>
          <tr>
              <td>hobby:</td>
              <td>
              <input type="checkbox" name="hobby" value="read"/>read
              <input type="checkbox" name="music"/>music
              <input type="checkbox" name="movie"/>movie
              <input type="checkbox" name="internet"/>internet
              </td>
          </tr>
          <tr>
              <td colspan="2"><input type="submit" value="提交"/></td>
          </tr>
      </table>
</form>
<br/>
<br/>
<a href="request.jsp?username=李四">URL传参</a>
<br/>
<i class="fa fa-qq"></i>
<br/>
<% out.println(getServletContext().getInitParameter("adminEmail")); %>
</body>
</html>
