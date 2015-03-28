<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/10/19
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.bean.News" %>

<jsp:useBean id="news" class="com.dao.NewsUtil" scope="session" />
<jsp:useBean id="pagebean" class="com.dao.PageBean" scope="session" />

<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <title></title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/jQuery.js" type="text/javascript"></script>
    <style>
        .pagination{
            width: 293px;
            margin-left: auto;
            margin-right: auto;
        }
        .pagination li{
            cursor:pointer;
        }
        .table{
            margin-left: 20px;
            margin-right:20px;
        }
        thead .id{
            width: 60px;
        }
        .delete{
            float: right;
        }
    </style>
    <script>
    </script>
</head>

<body>
<ol class="breadcrumb">
    <li><a href="#">Home</a></li>
    <li><a href="#">imagenews</a></li>
    <li class="active">View</li>
</ol>
<table class="table  table-striped table-hover table-bordered">
    <p></p>
    <caption>db_imagenews</caption>
    <button class="btn btn-primary delete" type="button">Delete</button>
    <thead>
    <tr>
        <th>选择</th>
        <th class="id">id</th>
        <th>imageAddress</th>
        <th>newsTitle</th>
        <th>newsContent</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <%
        String temppage=request.getParameter("page");
        int pno=1;

        if (temppage!=null && !temppage.equals("")){
            try{
                pno=Integer.parseInt(temppage);  //获取提交的页面编号
            }
            catch (Exception e){
                pno=1;   //有异常 则直接跳转到首条
            }
        }
        //每次刷新页面时都应当重新获得表中的记录数,因为翻页过程中表的记录可能随时都会更新
        pagebean.setTotalCount(news.getAvailableCount());
        pagebean.setCurrentPage(pno);
    %>

    <%
        Collection list=news.getPageData(pagebean);  //分页显示
        Iterator it=list.iterator();
        while (it.hasNext())
        {
            News temp=(News)it.next();
            out.println("<tr>");
            out.println("<td><input type=\"checkbox\" name=\"chose0\" /></td>");
            out.println("<td>"+temp.getId()+"</td>");
            out.println("<td>"+temp.getImageAddress()+"</td>");
            out.println("<td>"+temp.getNewsTitle()+"</td>");
            out.println("<td>"+temp.getNewsContent()+"</td>");
            out.println("<td ><a href=\"/newsedit.html\">编辑</a></td>");
            out.println("<td ><a href=\"/newsdelete?id="+temp.getId()+"\">删除</a></td>");
            out.println("</tr>");
        }
    %>
    <!--<tr>
        <td><input type="checkbox" name="chose0" /></td>
        <td>Tanmay</td>
        <td>Bangalore</td>
        <td>Bangalore</td>
        <td>Bangalore</td>
        <td ><a href="#">编辑</a></td>
        <td ><a href="#">删除</a></td>
    </tr>-->
    </tbody>
</table>
<br/>
<p>共<%=pagebean.getPageCount()%>页</p>
<ul class="pagination">

<%--    <li><a href=/splittest.jsp?page="+i+">"+i+"</a></li>--%>
    <%
        //int currentpage=pagebean.getCurrentPage();
        if(pno > 1)
            out.println("<li><a href=/splittest.jsp?page="+(pno-1)+">Prev</a></li>");
        else
            out.println("<li class=disabled><a>Prev</a></li>");
        for (int i=1;i<=pagebean.getPageCount();i++)
            out.println("<li><a href=/splittest.jsp?page="+i+">"+i+"</a></li>");
        if(pno < pagebean.getPageCount())
            out.println("<li><a href=/splittest.jsp?page="+(pno+1)+">Next</a></li>");
        else
            out.println("<li class=disabled><a>Next</a></li>");
    %>
<%--    <li><a class="next">Next</a></li>--%>
</ul>


</body>
</html>

