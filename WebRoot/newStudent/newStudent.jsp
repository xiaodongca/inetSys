<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>纳新人员表</title>
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
	    &nbsp;&nbsp;<a href="${pageContext.servletContext.contextPath}/newStudent/toForm">增加数据</a>
	    <br/>
  		<br/>
  		
  		<table id="mytable" cellspacing="0">
		<tr>
			<th scope="col">id</th>
			<th scope="col">n_name</th>
			<th scope="col">snumber</th>
			<th scope="col">tdirection</th>
			<th scope="col">tel</th>
			<th scope="col">n_class</th>
			<th scope="col">email</th>
			<th scope="col">qq</th>
			<th scope="col">hobby</th>
			<th scope="col">specalty</th>
			<th scope="col">操作</th>
		</tr>
		
		<c:forEach items="${newStudentList}" var="newStudent">
			<tr>
				<td>${newStudent.id }</td>
				<td class="alt">${newStudent.n_name}</td>
				<td>${newStudent.snumber }</td>
				<td class="alt">${newStudent.tdirection }</td>
				<td>${newStudent.tel }</td>
				<td class="alt">${newStudent.n_class }</td>
				<td>${newStudent.email }</td>
				<td class="alt">${newStudent.qq }</td>
				<td>${newStudent.hobby }</td>
				<td class="alt">${newStudent.specalty }</td>
			 	<td><a href="${pageContext.servletContext.contextPath}/assPerson/addPerson?Id=${newStudent.id }">添加为社员</a>
					/
					<a href="${pageContext.servletContext.contextPath}/newStudent/delete?Id=${newStudent.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<div class="content">
	总页数:<c:out value="${pageCount}"/>&nbsp;
	当前页:<c:out value="${currentpage}"/>&nbsp;
	<a href="${pageContext.servletContext.contextPath}/newStudent/last?currentpage=${currentpage}">上一页</a>&nbsp;
	<c:forEach var="currentpage" begin="1" end="${pageCount}">
  		<a href="${pageContext.servletContext.contextPath}/newStudent/jump?currentpage=${currentpage}">${currentpage}</a>
  	</c:forEach>&nbsp;
	<a href="${pageContext.servletContext.contextPath}/newStudent/next?currentpage=${currentpage}&pageCount=${pageCount}">下一页</a>
	</div>
	
  	
  </body>
</html>
