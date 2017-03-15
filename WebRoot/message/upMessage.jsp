<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'message.jsp' starting page</title>
  </head>
  
  <body>
	<form action="${pageContext.servletContext.contextPath }/message/up"
		method="post">

		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>l_id</td>
				<td><input type="text" name="l_id"
					value="${message.l_id}"></td>
			</tr>
			<tr>
				<td>apf_id</td>
				<td><input type="text" name="assPerson.apf_id" value="${message.assPerson.apf_id}"></td>
			</tr>
			<tr>
				<td>l_content</td>
				<td><input type="text" name="l_content"
					value="${message.l_content}"></td>
			</tr>
			<tr>
				<td>l_time</td>
				<td><input type="text" name="l_time"
					value="${message.l_time}"></td>
			</tr>
			<tr>
				<td>n_name</td>
				<td><input type="text" name="n_name"
					value="${message.n_name}"></td>
			</tr>



		</table>
		<input type="submit">
	</form>
		
  </body>
</html>
