<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'assPersonPerson.jsp' starting page</title>
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
    	<br/>
		<br/>
	<ul>
		<li><span><label>姓&nbsp;&nbsp;名：</label><input type="text" name="apf_name" value="${assPerson.apf_name}" readonly="readonly"></span></li>
		<li><span><label>学&nbsp;&nbsp;号：</label><input type="text" name="apf_number" value="${assPerson.apf_number}" readonly="readonly"></span></li>
		<li><span><label>技术方向：</label><input type="text" name="tdirrectin"  value="${assPerson.tdirrectin}" readonly="readonly"></span></li>
		<li><span><label>学&nbsp;&nbsp;分：</label><input type="text" name="credit"  value="${assPerson.credit}" readonly="readonly"></span></li>
		<li><span><label>联系电话：</label><input type="text" name="tel"  value="${assPerson.tel}" readonly="readonly"></span></li>
		<li><span><label>邮箱地址：</label><input type="text" name="email"  value="${assPerson.email}" readonly="readonly"></span></li>
		<li><span><label>Q&nbsp;Q号码：</label><input type="text" name="qq"  value="${assPerson.qq}" readonly="readonly"></span></li>
	</ul>
    	
    </div>
  </body>
</html>
