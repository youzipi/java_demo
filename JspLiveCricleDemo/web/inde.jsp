<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>jQCloud Example</title>
    <link rel="stylesheet" type="text/css" href="jqcloud.css" />
     <link rel="stylesheet" type="text/css" href="style.css" />
    <script type="text/javascript" src="js/jQuery.js"></script>
    <script type="text/javascript" src="jqcloud-1.0.4.js"></script>
    <script type="text/javascript">	
	$(function (){
      $.ajax({
       type:"POST", //请求方式
       url:"/TestServlet", //请求路径
       cache: false, 
       /* data:{name:'1'}, */   //传参 */
       dataType: 'json',   //返回值类型
        success:function(json){
            	  $("#example").jQCloud(json);
                }
       });
      })
	</script>
  </head>
  <body>
    <!-- You should explicitly specify the dimensions of the container element -->
    	<div id="container">
			<div class="blocks bbs"></div>
			<div class="blocks news"></div>
			<div class="blocks logger"></div>
			<div class="blocks resource"></div>
			<div  id="example" class="blocks blogs"></div>
			<div class="blocks right mytask"></div>
			<div class="blocks right codeShare"></div>
			<div class="blocks right rss"></div>
	</div>
	<div class="leftBarMenu"></div>
  </body>
</html>