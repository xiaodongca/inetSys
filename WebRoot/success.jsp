<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
    <br/>
    <br/>
    &nbsp;&nbsp;修改成功....
    <br/>
    <br/>
    &nbsp;&nbsp;下次登录请使用新密码登录！！！
  </body>
</html>
