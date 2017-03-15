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
	<form action="${pageContext.servletContext.contextPath}/actPerson/add" method="post">
	<br/>
	<br/>
	<ul>
		<li><span><label>人员编号:</label>
		<select name="assPerson.apf_id">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="4">5</option>
		</select></span></li>
		<li><span><label>活动编号:</label>
		<select name="activity.a_id">
		<option value="1">1</option>
		<option value="2">2</option>
		</select></span></li>
		<li><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
	</ul>
	</form>
	</div>
  </body>
</html>
