<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/28
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>request 内置对象</h1>
<%
    request.setCharacterEncoding("utf-8");//中文乱码
    request.setAttribute("password","12345");
%>
request的MIME类型 getContentType()：<%=request.getContentType()  %>
<br/>
getAuthType()：<%=request.getAuthType()  %>
<br/>
getContextPath()：<%=request.getContextPath()  %>
<br/>
协议类型及版本号 getProtocol()：<%=request.getProtocol()  %>
<br/>
服务器主机名：<%=request.getServerName()  %>
<br/>
服务器端口号：<%=request.getServerPort()  %>
<br/>
服务器主机名：<%=request.getServletPath()  %>
<br/>
请求文件的长度：<%=request.getContentLength()  %>
<br/>
IP:<%=request.getRemoteAddr()  %>
<br/>
物理路径：<%=request.getRealPath("request.jsp")  %>
<br/>
上下文路径: <%=request.getContextPath()  %>
<br/>
用户名：<%=request.getParameter("username")  %>
<br/>
密码：<%=request.getAttribute("password")  %>
<br/>
爱好：<%

    String[] hobby = request.getParameterValues("hobby");   //hobby没有，则返回null
    System.out.println(hobby);
    if (hobby == null){
        out.println("无");
    }
    else {
        for (String i : hobby) {
            out.println(i + "&nbsp;&nbsp;");
        }
    }
%>
<a href="reg.jsp">reg.jsp</a>
</body>
</html>
