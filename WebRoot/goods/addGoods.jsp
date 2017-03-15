<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goods.jsp' starting page</title>
    
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
<form action="${pageContext.servletContext.contextPath}/goods/add" method="post">
		<br>
		<br>
		<ul>
			<li><span><label>物品名称：</label><input type="text" name="g_name"></span></li>
			<li><span><label>数&nbsp;&nbsp;量：</label><input type="text" name="g_number"></span></li>
			<li><span><label>价&nbsp;&nbsp;值：</label><input type="text" name="g_worth"></span></li>
			<li><span><label>备&nbsp;&nbsp;注：</label><input type="text" name="remarks"></span></li>
			<li><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
		</ul>
	</form>
	</div>
    
  </body>
</html>
