 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addAssPerson.jsp' starting page</title>

<style type="text/css">
		.con{width:300px; margin: 0 auto;}
		input{font-family:Arial, sans-serif;}
		label{ font-size:14px;}
		ul{list-style-type:none;}
		li{padding:10px 0;overflow:hidden;}
		.submit{width:100px;padding:6px 0;border:0 none;color:#fff;background-color:#4d90fe;cursor:pointer;}
	</style>

</head>

<body>
 	<div class="con">
	<form action="${pageContext.servletContext.contextPath}/assPerson/add" method="post">
		<br/>
		<br/>
	<ul>
		<li><span><label>权限编号：</label><input type="text" name="p_id"></span></li>
		<li><span><label>姓&nbsp;&nbsp;名：</label><input type="text" name="apf_name"></span></li>
		<li><span><label>学&nbsp;&nbsp;号：</label><input type="text" name="apf_number"></span></li>
		<li><span><label>技术方向：</label><input type="text" name="tdirrectin"></span></li>
		<li><span><label>密&nbsp;&nbsp;码：</label><input type="text" name="password"></span></li>
		<li><span><label>学&nbsp;&nbsp;分：</label><input type="text" name="credit"></span></li>
		<li><span><label>联系电话：</label><input type="text" name="tel"></span></li>
		<li><span><label>邮箱地址：</label><input type="text" name="email"></span></li>
		<li><span><label>Q&nbsp;Q号码：</label><input type="text" name="qq"></span></li>
		<li><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
	</ul>
	</form>
	</div>
</body>
</html>
