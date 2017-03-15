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
    	
<form action="${pageContext.servletContext.contextPath}/newStudent/add" method="post">
		id<input type="text" name="id"><br>
		n_name<input type="text" name="n_name"><br>
		snumber<input type="text" name="snumber"><br>
		tdirection<input type="text" name="tdirection"><br> 
		tel<input type="text" name="tel"><br>
		n_class<input type="text" name="n_class"><br>
		email<input type="text" name="email"><br>
		qq<input type="text" name="qq"><br>
		hobby<input type="text" name="hobby"><br>
		specalty<input type="text" name="specalty"><br>
		
		<input type="submit">
	</form>
  </body>
</html>
