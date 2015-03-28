<%--
  Created by IntelliJ IDEA.
  User: Youzipi
  Date: 2015/3/19
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:form action="struts" method="post">
    <s:textfield name="user.username" label="name"></s:textfield>
    <s:textfield name="user.password" label="password"></s:textfield>
    <s:submit value="submit"></s:submit>
</s:form>

<s:form action="upload.action" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="the file"></s:file>
    <s:submit value="UPLOAD"></s:submit>
</s:form>

<s:iterator value="{\"1\",\"2\"}" id="number">
    <s:property value="number"/>A
</s:iterator>

</body>
</html>
