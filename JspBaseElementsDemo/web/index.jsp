<%--
  Created by IntelliJ IDEA.
  User: youzipi
  Date: 2014/8/27
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>Jsp 页面元素</h1>
  <hr/>
  <!-- HTML 注释 -->
  <%-- JSP注释 --%>
  <%
      out.println("测试用...");
  %>
  <%
      int num = 100;
      System.out.println("num:" + num);
      out.println("number:" + num);
  %>
  <br />
  num = <%=num  %>
  <br />
  </body>
</html>
