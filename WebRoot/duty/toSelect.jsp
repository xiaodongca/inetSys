<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toSelect.jsp' starting page</title>
	<style type="text/css">
		.con{width:200px; margin: 0 auto;}
	</style>
  </head>
  
  <body>
   	<br>
   	<br>
   		<table class="con">
   			<tr>
   				<td>值班时间：</td>
   				<td>${duty.d_time}</td>
   			</tr>
   			<tr>
   				<td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			</tr>
   			<tr>
   				<td>值班地点：</td>
   				<td>${duty.d_address}</td>
   			</tr>
   		</table>
   	
  </body>
</html>
