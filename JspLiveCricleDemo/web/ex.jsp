<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/27
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>九九乘法表</h1>
    <hr />
  <%
      //脚本
      for(int i=1;i<=9;i++){
        for(int j = 1;j <=i;j++){
            out.println(i+"*"+j+"="+i*j+"  ");
        }
          out.println("<br>");
      }
  %>
  <%!

      //表达式
    String printMultiTable(JspWriter out)
      throws Exception{
        String s = "";

        for(int i=1;i<=9;i++){
            for(int j = 1;j <=i;j++){
                s += i+"*"+j+"="+i*j+"  ";
            }
        s += "<br>";
        }
      return s;
    }
  %>
<br/>
<br/>
  <%=printMultiTable(out) %>
  
  
  <%
    for(int i = 1;i <=10;i++){
        for(int w = 1;w <=(10-i)/2;w++){
            out.print("&nbsp;");
        }
        for(;i>0;i--){
        out.print("*");
        }

        for(int w = 1;w <=(10-i)/2;w++){
            out.print("&nbsp;");
        }
    }
  %>
  </body>
</html>
