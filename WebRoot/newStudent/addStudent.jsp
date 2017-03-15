<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>纳新</title>
<style type="text/css">
input{font-family:Arial, sans-serif;}
label{ font-size:14px;}
/* login */
.login{width:300px;margin:0 auto;background-color:#f7f7f7;}
.login ul{list-style-type:none;}
.login li{padding:10px 0;overflow:hidden;}
.login .li3, .login .li5{text-align:right;font-size:12px;}
.login .li3 input{width:13px;height:13px;margin:0 3px 0 10px;vertical-align:middle;}
.login .submit{width:100px;padding:6px 0;border:0 none;color:#fff;background-color:#4d90fe;cursor:pointer;}
#email, #password{width:214px;padding:5px;border:1px solid #ccc;}
.forgot{color:#333;}
</style>
<link href="../css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../js/jquery.toggle-password.js"></script>
<script type="text/javascript" src="../js/setHomeSetFav.js"></script>
<script type="text/javascript">
	function check(){
	var n_name = document.getElementById("n_name").value;
	var snumber = document.getElementById("snumber").value;
	var tel = document.getElementById("tel").value;
	var n_class = document.getElementById("n_class").value;
	var email = document.getElementById("email").value;
	var qq = document.getElementById("qq").value;
	if(n_name==''||snumber==''||tel==''||n_class==''||email==''||qq==''){
		alert("必填项不得为空！！！")
		return false;
		}else{
			if (confirm("你确定提交吗？")) {  
				alert("提交成功,等待审核！！！");
           	 		return true;
        		}  
        		else {  
           			return false;
        	}
		}
	}
	
	
</script>
</head>
<body>
<div class="wrap">
  <div  class="logo">
    <div class="logo_left"><img src="../images/logo.jpg" /></div>
    <div class="logo_right"><img src="../images/tel.jpg" width="28" height="28" />24小时服务热线：<span class="tel">123-456-7890</span></div>
  </div>
  <!--logo结束-->
  
  <div class="nav">
    <div  class="nav_left"></div>
    <div class="nav_mid">
      <div class="nav_mid_left">
        <ul>
         <li><a href="../login.jsp">首页</a></li>
          <li><a href="../news/inet.jsp">关于社团</a></li>
          <li><a href="#">学期纳新</a></li>
          <li><a href="#">联系我们</a></li>
        </ul>
      </div>
      <!--nav_mid_left结束-->
      <div class="nav_mid_right">
        <form action="" method="post">
          <input type="text" class="search_text" />
        </form>
      </div>
      <!--nav_mid_right结束--> 
    </div>
    <!--导航主体nav_mid结束-->
  		</div>
        <div class="login"> 
        <br/>
        <br/>
        <br/>
        <p class="news_title">纳新信息填写</p>
        <br/>
        <br/>
    			<form onsubmit="return check()" action="${pageContext.servletContext.contextPath}/newStudent/addPerson" method="post">
                	<ul>
                    	<li><span><label >姓&nbsp;&nbsp;名：</label><input name="n_name" id="n_name" type="text" placeholder="必填"/></span></li>
                        <li><span><label >学&nbsp;&nbsp;号：</label><input name="snumber" id="snumber" type="text" placeholder="必填"/></span></li>
                        <li><span><label >技术方向：<select name="tdirection"><option value="软件">软件</option><option value="硬件">硬件</option></select></span></li>
                        <li><span><label >电&nbsp;&nbsp;话：</label><input name="tel" id="tel"  type="text" placeholder="必填"/></span></li>
                        <li><span><label >班&nbsp;&nbsp;级：</label><input name="n_class"id="n_class"  type="text" placeholder="必填"/></span></li>
                        <li><span><label >邮箱地址：</label><input name="email" type="text" id="email" placeholder="必填"/></span></li>
                        <li><span><label >Q&nbsp;Q号码：</label><input name="qq" type="text" id="qq" placeholder="必填"/></span></li>
                        <li><span><label >爱&nbsp;&nbsp;好：</label><input name="hobby" type="text" placeholder="选填"/></span></li>
                        <li><span><label >特&nbsp;&nbsp;长：</label><input name="specalty" type="text" placeholder="选填"/></span></li>
                        <li class="li4"><input class="submit" type="submit" value="提交"> &nbsp;&nbsp;<input  class="submit" type="reset" value="重置"/></li>
                    </ul>
                </form>
   	 		</div>	
  	</div>
  </body>
</html>
