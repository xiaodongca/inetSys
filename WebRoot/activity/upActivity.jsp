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
   	<form action="${pageContext.servletContext.contextPath }/activity/up"
		method="post">
		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>a_id</td>
				<td><input type="text" name="a_id"
					value="${activity.a_id}"></td>
			</tr>
			<tr>
				<td>a_name</td>
				<td><input type="text" name="a_name" value="${activity.a_name}"></td>
			</tr>
			<tr>
				<td>a_content</td>
				<td><input type="text" name="a_content"
					value="${activity.a_content}"></td>
			</tr>
			<tr>
				<td>credit</td>
				<td><input type="text" name="credit"
					value="${activity.credit}"></td>
			</tr>
			<tr>
				<td>start_time</td>
				<td><input type="text" name="start_time"
					value="${activity.start_time}"></td>
			</tr>
			<tr>
				<td>end_time</td>
				<td><input type="text" name="end_time"
					value="${activity.end_time}"></td>
			</tr>
			<tr>
				<td>admin_name</td>
				<td><input type="text" name="admin_name"
					value="${activity.admin_name}"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
  </body>
</html>
