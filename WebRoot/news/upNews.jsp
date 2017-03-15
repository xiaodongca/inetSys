<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'activity.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   	<form action="${pageContext.servletContext.contextPath }/news/up"
		method="post">
		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>id</td>
				<td><input type="text" name="id"
					value="${news.id}"></td>
			</tr>
			<tr>
				<td>n_title</td>
				<td><input type="text" name="n_title" 
				value="${news.n_title}"></td>
			</tr>
			<tr>
				<td>n_content</td>
				<td><input type="text" name="n_content"
					value="${news.n_content}"></td>
			</tr>
			<tr>
				<td>n_time</td>
				<td><input type="text" name="n_time"
					value="${news.n_time}"></td>
			</tr>
			<tr>
				<td>admin_name</td>
				<td><input type="text" name="admin_name"
					value="${news.admin_name}"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
  </body>
</html>
