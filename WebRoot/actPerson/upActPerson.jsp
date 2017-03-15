<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'actPerson.jsp' starting page</title>

</head>
  
  <body>
	<form action="${pageContext.servletContext.contextPath }/actPerson/up"
		method="post">

		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>id</td>
				<td><input type="text" name="id"
					value="${actPerson.id}"></td>
			</tr>
			<tr>
				<td>activity.a_id</td>
				<td><input type="text" name="activity.a_id"
					value="${actPerson.activity.a_id}"></td>
			</tr>
			<tr>
				<td>assPerson.apf_id</td>
				<td><input type="text" name="assPerson.apf_id" value="${actPerson.assPerson.apf_id}"></td>
			</tr>
			
		</table>
		<input type="submit">
	</form>
  </body>
</html>
