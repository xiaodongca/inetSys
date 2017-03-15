<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>活动表</title>
     <style type="text/css">
    html{height:100%;}
    	body {  
    font: normal 11px auto "trebuchet ms", verdana, arial, helvetica, sans-serif;  
    color: #4f6b72;   
    height:100%;overflow:hidden; 
    
}  
a {  
    color: #c75f3e; 
   text-decoration:none;
}  
#mytable {  
    width: 100%;  
    padding: 0;  
    margin-left:10px;
	margin-right:10px; 
}  
caption {  
    padding: 0 0 5px 0;  
    width: 700px;  
    font: italic 11px "trebuchet ms", verdana, arial, helvetica, sans-serif;  
    text-align: right;  
}  
th {  
    font: bold 11px "trebuchet ms", verdana, arial, helvetica, sans-serif;  
    color: #4f6b72;  
    border-right: 1px solid #c1dad7;  
    border-bottom: 1px solid #c1dad7;  
    border-top: 1px solid #c1dad7;  
    letter-spacing: 2px;  
    text-transform: uppercase;  
    text-align: left;  
    padding: 6px 6px 6px 12px;  
    background: #cae8ea url(images/bg_header.jpg) no-repeat;  
}  
td {  
    border-right: 1px solid #c1dad7;  
    border-bottom: 1px solid #c1dad7;  
    background: #fff;  
    font-size:11px;  
    padding: 6px 6px 6px 12px;  
    color: #4f6b72;  
}  
td.alt {  
    background: #f5fafa;  
    color: #797268;  
}  
th.spec {  
    border-left: 1px solid #c1dad7;  
    border-top: 0;  
    background: #fff url(images/bullet1.gif) no-repeat;  
    font: bold 10px "trebuchet ms", verdana, arial, helvetica, sans-serif;  
}  
th.specalt {  
    border-left: 1px solid #c1dad7;  
    border-top: 0;  
    background: #f5fafa url(images/bullet2.gif) no-repeat;  
    font: bold 10px "trebuchet ms", verdana, arial, helvetica, sans-serif;  
    color: #797268;  
} /*-----for ie 5.x bug*/  
html>body td {  
    font-size:11px;  
}
.content{
	margin:0 auto;
	text-align:center;
}
    </style>
	

  </head>
  
  <body>
  	
  		<br/>
  		<br/>
  		<br/>
  		<br/>
  		<table id="mytable" cellspacing="0">
		<tr>
			<th scope="col">a_name</th>
			<th scope="col">a_content</th>
			<th scope="col">credit</th>
			<th scope="col">start_time</th>
			<th scope="col">end_time</th>
			<th scope="col">admin_name</th>
			<th scope="col">操作</th>
		</tr>
		
		<c:forEach items="${activityList}" var="activity">
			<tr>
				<td style="display:none"><input name="activity.a_id" value="${activity.a_id}"/></td>
				<td style="display:none"><input name="assPerson.apf_id" value="<%=session.getAttribute("id")%>"/></td>
				<td class="alt">${activity.a_name}</td>
				<td>${activity.a_content }</td>
				<td class="alt">${activity.credit }</td>
				<td>${activity.start_time }</td>
				<td class="alt">${activity.end_time }</td>
				<td>${activity.admin_name }</td>
			 	<td>
			 		<a href="${pageContext.servletContext.contextPath}/actPerson/addPerson?a_id=${activity.a_id}&apf_id=<%=session.getAttribute("id")%>">参加</a>
				</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
