<%@ page import="net.sf.json.JSONObject" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/9/29
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  %>
<jsp:useBean id="news" class="com.bean.News" scope="page" />
<jsp:useBean id="load" class="com.servlet.Load" scope="page" />
<jsp:useBean id="conn" class="com.jdbc.DB" scope="page" />

<html>
<head>
    <title></title>
</head>
<body>


<%
    JSONObject images = load.loadImg();

    out.println(images);
    out.println(images.getClass());
/*    Connection con = conn.getConnection();
    out.print(con);*/
%>
<script>

</script>
</body>
</html>
