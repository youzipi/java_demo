<%@ page language="java" import="java.util.*" pageEncoding="gbk" %>
<%@ page import="java.io.*" %>
<%!
    class FileJSP implements FilenameFilter {
        String str = null;

        FileJSP(String s) {
            str = "." + s;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(str);
        }
    }
%>
<BODY bgcolor=cyan><span Size=1>
<P>�����г��˷������ϵ�һЩjsp �ļ�</P>
<% File dir = new File("F:\\zxing-master\\zxing-master\\include_demo\\web");
    FileJSP file_jsp = new FileJSP("jsp");
    String file_name[] = dir.list(file_jsp);
    for (int i = 0; i < file_name.length; i++) {
        out.print("<BR>" + file_name[i]);
    }
    request.removeAttribute("OK");
    request.setAttribute("OK",null);
    System.out.println(request.getParameter("OK"));
%>
<P> ������һ��jsp �ļ�������,�������jsp �ļ���</P>
<FORM action="index.jsp" method=post name=form>
    <INPUT type="text" name="OK">
    <BR>
    <INPUT TYPE="submit" value=" �ͳ�" name=submit>
</FORM>
<% String fileName;
    fileName = request.getParameter("OK");
    System.out.println("fileName="+fileName);
    System.out.println("\\" + fileName);
%>

<P>���ص�Ч����
    <jsp:include page="<%=fileName %>" flush="true"/>
</span>
</BODY>
