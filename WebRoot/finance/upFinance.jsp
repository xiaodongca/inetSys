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
   	<form action="${pageContext.servletContext.contextPath }/finance/up"
		method="post">
		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>id</td>
				<td><input type="text" name="id"
					value="${finance.id}"></td>
			</tr>
			<tr>
				<td>type</td>
				<td><input type="text" name="type" 
				value="${finance.type}"></td>
			</tr>
			<tr>
				<td>money</td>
				<td><input type="text" name="money"
					value="${finance.money}"></td>
			</tr>
			<tr>
				<td>event</td>
				<td><input type="text" name="event"
					value="${finance.event}"></td>
			</tr>
			<tr>
				<td>e_time</td>
				<td><input type="text" name="e_time"
					value="${finance.e_time}"></td>
			</tr>
			<tr>
				<td>af_time</td>
				<td><input type="text" name="af_time"
					value="${finance.af_time}"></td>
			</tr>
			<tr>
				<td>admin_name</td>
				<td><input type="text" name="admin_name"
					value="${finance.admin_name}"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
  </body>
</html>
