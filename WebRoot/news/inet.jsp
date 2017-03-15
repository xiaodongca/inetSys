<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>INET网络社团简介</title>
<link href="../css/main.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/setHomeSetFav.js"></script>
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
          <li><a href="#">关于社团</a></li>
           <li><a href="../newStudent/addStudent.jsp">学期纳新</a></li>
          <li><a href="#">联系我们</a></li>
        </ul>
      </div>
      <!--nav_mid_left结束-->
      <div class="nav_mid_right">
        <form action="" method="post">
          <input type="text" class="search_text" />
          <!--<input type="text" class="search_text" x-webkit-speech />-->
        </form>
      </div>
      <!--nav_mid_right结束--> 
    </div>
    <!--导航主体nav_mid结束-->
    <div class="nav_right"></div>
   <div><br /> 
    		<br/><br/><br/>
			<div class="news_title">INET网络社团简介</div><br/><br/><br/>
   
    	<div class="news_context">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;INet网络社团在王德成和於磊老师的带领下由一群对网络充满热爱与激情的科院学子创立于2009年。自成立之日起，一直以坚实稳健的步伐迈向成熟。在校企合作方面，我社与杭州朗讯电脑有限公司、浙江在线、浙江纵横科技有限公司等校外知名公司保持着良好的合作关系。在自身专业发展的方面我们坚持发展自己的特色，服务大众，成功举办了各类科技活动：微机组装大赛，计算机网络大赛。社团内部我们定期为成员进行各类技术培训指导，比如photoshop，计算机网络技术，网站管理等相关课程。在社团的大学生创业中我们从广大科院学生的实际需求出发，提供各类计算机及周边服务。电脑维修，电脑外设零售，以及各类电脑配件零售。还提供计算机组装，品牌台式机、笔记本零售等业务，我们还提供快速上门服务，服务科院学子。</div>
    	<br/>
    	<br/>
    	<br/>
    	<br/>
      	<div align="center"><img alt="" src="../images/inet.jpg"></div>
    </div>		
  </div>
  </div>
  </body>
</html>
