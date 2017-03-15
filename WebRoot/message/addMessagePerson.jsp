<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'message.jsp' starting page</title>
    <style type="text/css">
		.con{width:320px; margin: 0 auto;}
		input{font-family:Arial, sans-serif;}
		label{ font-size:14px;}
		ul{list-style-type:none;}
		li{padding:10px 0;overflow:hidden;}
		.submit{width:100px;padding:6px 0;border:0 none;color:#fff;background-color:#4d90fe;cursor:pointer;}
	</style>
	<script type="text/javascript">
		function check(){
		var last = document.getElementById("l_content").value;
		if(last!=''){
			if (confirm("你确定提交吗？")) {  
				alert("提交成功,感谢你的留言！！！");
           	 		return true;
        		}  
        		else {  
           			return false;
        	} 
		}else{
			alert("请填入你要留言的内容！！！");
			return false;
			}
				
		}
	</script>
  </head>
  
  <body>
  <div class="con">
	<form action="${pageContext.servletContext.contextPath}/message/addPerson" method="post" onsubmit="return check()">
		<br>
		<br>
		<ul>
			<li  style="display:none"><span>人员编号：<label></label><input type="text" name="assPerson.apf_id" value="<%=session.getAttribute("id")%>"></span></li>
			<li><span>留言内容：<label></label><input type="text" name="l_content" id="l_content" style="width: 280px; height: 50px;"/></span></li>
			<li style="display:none"><span>留言时间：<label></label><input type="text" name="l_time" value="<%=session.getAttribute("date")%>"></span></li>
			<li style="display:none"><span>留言人：&nbsp;<label></label><input type="text" name="n_name" value="<%= session.getAttribute("ass_name")%>"></span></li>
			<li><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
		</ul>
	</form>
	</div>
		
  </body>
</html>
