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
   	<form action="${pageContext.servletContext.contextPath }/newStudent/up"
		method="post">
		<br>
		<br>
		<table width="300px" height="300px;" border="1px" >
			<tr>
				<td>id</td>
				<td><input type="text" name="id"
					value="${newStudent.id}"></td>
			</tr>
			<tr>
				<td>n_name</td>
				<td><input type="text" name="n_name" value="${newStudent.n_name}"></td>
			</tr>
			<tr>
				<td>snumber</td>
				<td><input type="text" name="snumber"
					value="${newStudent.snumber}"></td>
			</tr>
			<tr>
				<td>tdirection</td>
				<td><input type="text" name="tdirection"
					value="${newStudent.tdirection}"></td>
			</tr>
			<tr>
				<td>tel</td>
				<td><input type="text" name="tel"
					value="${newStudent.tel}"></td>
			</tr>
			<tr>
				<td>n_class</td>
				<td><input type="text" name="n_class"
					value="${newStudent.n_class}"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email"
					value="${newStudent.email}"></td>
			</tr>
			<tr>
				<td>qq</td>
				<td><input type="text" name="qq"
					value="${newStudent.qq}"></td>
			</tr>
			<tr>
				<td>hobby</td>
				<td><input type="text" name="hobby"
					value="${newStudent.hobby}"></td>
			</tr>
			<tr>
				<td>specalty</td>
				<td><input type="text" name="specalty"
					value="${newStudent.specalty}"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
  </body>
</html>
