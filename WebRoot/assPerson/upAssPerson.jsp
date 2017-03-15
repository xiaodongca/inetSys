<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'upAssPerson.jsp' starting page</title>

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
	<form action="${pageContext.servletContext.contextPath }/assPerson/up"
		method="post">

		<table width="300px" height="300px;" border="1px">
			<tr>
				<td>社团人员id</td>
				<td><input type="text" name="apf_id"
					value="${assPerson.apf_id}"></td>
			</tr>
			<tr>
				<td>权限id</td>
				<td><input type="text" name="powers.p_id" value="${assPerson.powers.p_name}"></td>
			</tr>
			<tr>
				<td>名字</td>
				<td><input type="text" name="apf_name"
					value="${assPerson.apf_name}"></td>
			</tr>
			<tr>
				<td>学号</td>
				<td><input type="text" name="apf_number"
					value="${assPerson.apf_number}"></td>
			</tr>
			<tr>
				<td>职位</td>
				<td><input type="text" name="tdirrectin"
					value="${assPerson.tdirrectin}"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password"
					value="${assPerson.password}"></td>
			</tr>
			<tr>
				<td>credit</td>
				<td><input type="text" name="credit"
					value="${assPerson.credit}"></td>
			</tr>
			<tr>
				<td>tel</td>
				<td><input type="text" name="tel" value="${assPerson.tel}"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value="${assPerson.email}"></td>
			</tr>
			<tr>
				<td>qq</td>
				<td><input type="text" name="qq" value="${assPerson.qq}"></td>
			</tr>

		</table>
		<input type="submit">
	</form>
</body>
</html>
