<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>welcome</title>
    
  </head>
  
  <body>
  <br>
  <br>
  	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎使用Inet社团后台管理系统
  </body>
</html>
