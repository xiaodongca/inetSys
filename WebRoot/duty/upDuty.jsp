<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'duty.jsp' starting page</title>
    
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
	<form action="${pageContext.servletContext.contextPath }/duty/up"
		method="post">

		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>d_id</td>
				<td><input type="text" name="d_id"
					value="${duty.d_id}"></td>
			</tr>
			<tr>
				<td>apf_id</td>
				<td><input type="text" name="assPerson.apf_id" value="${duty.assPerson.apf_id}"></td>
			</tr>
			<tr>
				<td>d_time</td>
				<td><input type="text" name="d_time"
					value="${duty.d_time}"></td>
			</tr>
			<tr>
				<td>d_address</td>
				<td><input type="text" name="d_address"
					value="${duty.d_address}"></td>
			</tr>
			<tr>
				<td>andmin_name</td>
				<td><input type="text" name="andmin_name"
					value="${duty.andmin_name}"></td>
			</tr>



		</table>
		<input type="submit">
	</form>
  </body>
</html>
