<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/9/22
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%
    String path = request.getContextPath();
    String basePath = request.getScheme();
    String username = "";
    String password = "";
    request.setCharacterEncoding("utf-8");
    username = request.getParameter("username");
    password = request.getParameter("password");
    if("admin".equals(username) && "admin".equals(password)){

        session.setAttribute("username", username);
        System.out.println( "success");
        request.getRequestDispatcher("login_success.jsp").forward(request, response);
    }
    else{
        response.sendRedirect("login_fail.jsp");
    }
%>--%>
<html>
<body>
<jsp:useBean id="myUsers" class="com.Users" scope="page"></jsp:useBean>
<h1>setProperty</h1>
<hr/>
<jsp:setProperty name="myUsers" property="*"></jsp:setProperty>
username:<%=myUsers.getUsername()  %><br/>
password:<%=myUsers.getPassword()  %><br/>
</body>
</html>

