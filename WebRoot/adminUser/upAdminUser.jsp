<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upAdminUser.jsp' starting page</title>

  </head>
  
  <body>
	<form action="${pageContext.servletContext.contextPath }/adminUser/up" method="post">
	
		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>员工id</td>
				<td><input type="text" name="id" value="${adminUser.id}"></td>
			</tr>
			<tr>
				<td>权限id</td>
				<td><input type="text" name="powers.p_id" value="${adminUser.powers.p_id}"></td>
			</tr>
			<tr>
				<td>管理员名字</td>
				<td><input type="text" name="admin_name" value="${adminUser.admin_name}"></td>
			</tr>
			<tr>
				<td>管理员账号</td>
				<td><input type="text" name="admin_acc" value="${adminUser.admin_acc}"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" value="${adminUser.password}"></td>
			</tr>

		</table>
		<input type="submit">
	</form>

  </body>
</html>
