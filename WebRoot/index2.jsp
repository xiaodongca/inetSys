<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
	
}
 html{height:100%;} 
.wrap {
	width: 100%;
	margin: 0 auto;
	background-color: #ffffff;
	
}
body{ background-color: #F5F5F5;height:100%;overflow:hidden; }
	.top{
		width:100%;
		height:30px;
		margin-left:20px;
		 
		}
	.title{ text-align:center; 
			font-size:28px;
			font-weight:bold;
			width:100%;
			height:30px;	
	}
	li{list-style:none;  text-align:center;}
	a:link,a:visited{text-decoration: none;color: #000;}
	.list{width: 210px;margin:40px auto 0 auto;}
	.list ul li{  border-bottom:0; }
	.list ul li a{padding-left: 10px;color: #000; font-size:14px; display: block; font-weight:bold; height:36px;line-height: 36px;position: relative;
	}
	.list ul li .inactive{ background:url(images/off.png) no-repeat 184px center;}
	.list ul li .inactives{background:url(images/on.png) no-repeat 184px center;} 
	.list ul li ul{display: none;}
	.list ul li ul li { border-left:0; border-right:0;  border-color:#467ca2;}
	.list ul li ul li a{padding-left: 10px;color: #000; font-size:12px; display: block; font-weight:none; height:36px;line-height: 36px;position: relative;}
	.list ul li ul li ul{display: none;}
	.list ul li ul li a{ padding-left:20px;}
	.list ul li ul li ul li {  border-color:#6196bb; }
	.last{  border-color:#6196bb; }
	.list ul li ul li ul li a{ color:#316a91; padding-left:30px;}
	.left{ float:right; width:120px; height:60px; font-size:12px;margin-right:10px;margin-bottom:10px;}
	.left_top{ height: 10px; float: right}
	.left_min{ height: 10px; float: right}
	.left_bottom{ height: 10px; float: right}	
</style>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function title(){
			var n=document.getElementById("title").innerText;
			if(n!='null'){
			alert(n);
			}
		}
		$(document).ready(function() {
		$('.inactive').click(function(){
			if($(this).siblings('ul').css('display')=='none'){
				$(this).parent('li').siblings('li').removeClass('inactives');
				$(this).addClass('inactives');
				$(this).siblings('ul').slideDown(100).children('li');
				if($(this).parents('li').siblings('li').children('ul').css('display')=='block'){
					$(this).parents('li').siblings('li').children('ul').parent('li').children('a').removeClass('inactives');
					$(this).parents('li').siblings('li').children('ul').slideUp(100);

				}
			}else{
				//控制自身变成+号
				$(this).removeClass('inactives');
				//控制自身菜单下子菜单隐藏
				$(this).siblings('ul').slideUp(100);
				//控制自身子菜单变成+号
				$(this).siblings('ul').children('li').children('ul').parent('li').children('a').addClass('inactives');
				//控制自身菜单下子菜单隐藏
				$(this).siblings('ul').children('li').children('ul').slideUp(100);

				//控制同级菜单只保持一个是展开的（-号显示）
				$(this).siblings('ul').children('li').children('a').removeClass('inactives');
			}
		})
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Inet后台管理系统</title>
</head>

<body onLoad="title()">
<div class="wrap">
	<table width="100%" height="800px" border="2px" style="border-collapse:collapse; border-color:#333">
    	<tr height="12%" >
    		<td colspan="2" background="images/td_bg.png"><div class="top"> <img src="images/logo2.png" /></div>
            		          
            		<div class="title">Inet社团后台管理系统</div>
                	<div class="left">
                		<div class="left_top">
                			当前用户：<%=session.getAttribute("ass_name") %>
                		</div>
                		<br>
                		<div class="left_min">
                			当前时间：<%=session.getAttribute("date")%>
                		</div>
                		<br/>
                		<div class="left_bottom">
                			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=session.getAttribute("week")%>
                		</div>
                	</div>
                	<br/>
            </td>
    		
    	</tr>
    	<tr>
    		<td width="18%" background="images/td_bg2.png">
            	<div class="list">
		<ul class="yiji">
			<li><a href="#" class="inactive">个人中心</a>
				<ul style="display: none">
					<li><a href="${pageContext.servletContext.contextPath}/assPerson/selectOne?Id=<%=session.getAttribute("id") %>" target="mainFrame" class="last">个人信息</a></li> 
					<li><a href="${pageContext.servletContext.contextPath}/assPerson/upPassword.jsp" target="mainFrame" class="last">修改密码</a></li> 
					<li><a href="${pageContext.servletContext.contextPath}/activity/toListPerson" class="last" target="mainFrame">参加活动</a></li> 
					<li><a href="${pageContext.servletContext.contextPath}/duty/toSelect?Id=<%=session.getAttribute("id") %>" class="last" target="mainFrame">值班安排</a></li> 
					<li><a href="${pageContext.servletContext.contextPath}/message/addMessagePerson.jsp" class="last" target="mainFrame">留言</a></li> 
				</ul>
			</li>
		</ul>
	</div>
    		</td>
    		<td background="images/td_bg2.png">
    			<iframe src="welcome.jsp" frameborder=no border=0 marginwidth=0 marginheight=0 scrolling=no allowTransparency="true" name="mainFrame" width="100%" height="100%"/>
      		</td>
    	</tr>
    </table>
    </div>
</body>
</html>
