<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'upPassword.jsp' starting page</title>
    <style type="text/css">
		.con{width:300px; margin: 0 auto;}
		input{font-family:Arial, sans-serif;}
		label{ font-size:14px;}
		ul{list-style-type:none;}
		li{padding:10px 0;overflow:hidden;}
		.submit{width:100px;padding:6px 0;border:0 none;color:#fff;background-color:#4d90fe;cursor:pointer;}
	</style>
	<script type="text/javascript">
		function check(){
			var last = document.getElementById("last").value;
			var password1 = document.getElementById("password1").value;
			var password =  document.getElementById("password").value;
			var password2 =  document.getElementById("password2").value;
			if(last!=password1){
				alert("原密码不对！！！");
				return false;
			}else{
				if(password!= password2){
					alert("两次输入的密码不想同！！！");
					return false;
				}
			}
			return true;
		}
		
	</script>
  </head>
  <body>
  	<br>
  	<br>
  	<form onsubmit="return check()" action="${pageContext.servletContext.contextPath}/assPerson/upPassword" method="post"  >
    <div class="con">
    <ul>
    	<li style="display:none"><span><input name="apf_id" id="id" value="<%=session.getAttribute("id")%>"/></span></li>
    	<li style="display:none"><span><input name="apf_id" id="password1" value="<%=session.getAttribute("password")%>"/></span></li>
    	<li><span><label>原密码：&nbsp;</label><input type="password" name="last" id="last"></span></li>
    	<li><span><label>修改密码：</label><input type="password" name="password" id="password"></span></li>
    	<li><span><label>确认密码：</label><input type="password" name="password2" id="password2"></span></li>
    	<li><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
    </ul>
    </div>
    </form>
  </body>
</html>
