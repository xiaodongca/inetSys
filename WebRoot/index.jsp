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
body{ background-color: #F5F5F5;height:100%;overflow:hidden; font-size: 12px; }
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
	a{ text-decoration:none}
	.left{ float:right; width:150px; height:60px; font-size:12px;margin-right:10px;}
	.left_top{ height: 10px; float: right}
	.left_min{ height: 10px;float: right}
	.left_bottom{ height: 10px;float: right}
		
</style>
<script type="text/javascript">
	function title(){
			var n=document.getElementById("title").innerText;
			if(n!='null'){
			alert(n);
			}
		}
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
                			当前用户：<%=session.getAttribute("admin_name") %>
                		</div>
                		<br>
                		<div class="left_min">
                			当前时间：<%=session.getAttribute("date")%>
                		</div>
                		<br/>
                		<div class="left_bottom">
                			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=session.getAttribute("week")%>
                		</div>
                		
                	</div>
            </td>
    		
    	</tr>
    	<tr>
    		<td width="18%" background="images/td_bg2.png">
            	<ul>
                	<div style="display: none;" id="title"><%=request.getAttribute("title")%></div>
                    <ul>
                   		 <li><a href="${pageContext.servletContext.contextPath}/goods/toList" target="mainFrame">物&nbsp;&nbsp;品&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/adminUser/toList" target="mainFrame">管&nbsp;理&nbsp;员&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/assPerson/toList" target="mainFrame">社团人员管理表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/message/toList" target="mainFrame">留&nbsp;&nbsp;言&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/duty/toList" target="mainFrame">值&nbsp;&nbsp;班&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/activity/toList" target="mainFrame">活&nbsp;&nbsp;动&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/actPerson/toList" target="mainFrame">参与活动人员表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/newStudent/toList" target="mainFrame">纳&nbsp;&nbsp;新&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/news/toList" target="mainFrame">新&nbsp;&nbsp;闻&nbsp;&nbsp;表</a></li><br>
                         <li><a href="${pageContext.servletContext.contextPath}/finance/toList" target="mainFrame">财&nbsp;&nbsp;务&nbsp;&nbsp;表</a></li><br>
                    </ul>
                </ul>
    		</td>
    		<td background="images/td_bg2.png">
    			<iframe src="welcome.jsp" frameborder=no border=0 marginwidth=0 marginheight=0 scrolling=no allowTransparency="true" name="mainFrame" width="100%" height="100%"/>
      		</td>
    	</tr>
    </table>
    </div>
</body>
</html>
