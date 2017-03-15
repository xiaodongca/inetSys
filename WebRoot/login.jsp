<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type"></meta>
<title>Inet社团主页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/myfocus-2.0.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/setHomeSetFav.js"></script>
<script type="text/javascript">
myFocus.set({
    id:'boxID',//焦点图盒子ID
    pattern:'mF_fancy',//风格应用的名称
    time:3,//切换时间间隔(秒)
    trigger:'click',//触发切换模式:'click'(点击)/'mouseover'(悬停)
    width:1000,//设置图片区域宽度(像素)
    height:310,//设置图片区域高度(像素)
    txtHeight:'default'//文字层高度设置(像素),'default'为默认高度，0为隐藏
});
</script>
</head>
<body>
<div class="wrap">
  <div  class="logo">
    <div class="logo_left"><img src="${pageContext.request.contextPath}/images/logo.jpg" /></div>
    <div class="logo_right"><img src="${pageContext.request.contextPath}/images/tel.jpg" width="28" height="28" />Inet社团联系方式：<span class="tel">123-456-7890</span></div>
  </div>
  <!--logo结束-->
  
  <div class="nav">
    <div  class="nav_left"></div>
    <div class="nav_mid">
      <div class="nav_mid_left">
        <ul>
          <li><a href="${pageContext.request.contextPath}/login.jsp">首页</a></li>
          <li><a href="news/inet.jsp">关于社团</a></li>
          <li><a href="newStudent/addStudent.jsp">学期纳新</a></li>
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
  </div>
  <!--nav结束-->
  
  <div class="ad">
    <div id="boxID"><!--焦点图盒子-->
      <div class="loading"><img src="${pageContext.request.contextPath}/images/loading.gif" alt="请稍候..." /></div>
      <!--载入画面(可删除)-->
      <div class="pic"><!--内容列表(li数目可随意增减)-->
        <ul>
          <li><a href="#"><img src="${pageContext.request.contextPath}/images/2.jpg" thumb="" alt="" text="详细描述2" /></a></li>
          <li><a href="#"><img src="${pageContext.request.contextPath}/images/1.jpg" thumb="" alt="" text="详细描述3" /></a></li>
          <li><a href="#"><img src="${pageContext.request.contextPath}/images/4.jpg" thumb="" alt="" text="详细描述4" /></a></li>
          <li><a href="#"><img src="${pageContext.request.contextPath}/images/3.jpg" thumb="" alt="" text="详细描述5" /></a></li>
        </ul>
      </div>
    </div>
  </div>
  <!--ad结束-->
  
  <div class="main">
    <div class="news">
      <div class="title">
        <h2 class="titile_left">新闻中心</h2>
        <span class="title_right"><a href="#">More&gt;&gt;</a></span> </div>
      <!--title结束-->
      
      <div class="pic_news"> <img src="${pageContext.request.contextPath}/images/news.jpg" alt="2015  年度校园十佳社团！" width="113" height="77" />
        <h2><a href="index.html">2015  年度校园十佳社团！</a></h2>      
          获奖时间：11月19日<br />
          <a href="index.html">Learn More>></a>
      </div>
      <!--pic_news结束-->
      
      <div class="news_list">
        <ul>
		  <li><span>2016-12-05</span><a href="news/news1.jsp">Inet社团获得“精英社团”称号</a></li>
          <li><span>2016-05-20</span> <a href="news/news2.jsp">Inet社团成功承办第七届移动应用开发技能大赛</a></li>
          <li><span>2016-05-21</span><a href="news/news3.jsp">Inet社团服务站举行“e修哥”义务维修活动</a></li>
          <li><span>2015-11-19</span><a href="news/news4.jsp" >“十佳社团”---Inet社团</a></li>
        </ul>
      </div>
      <!--news_list结束--> 
      
    </div>
    <!--news结束-->
    
    <div class="products">
      <div class="title">
        <h2 class="titile_left">课程中心</h2>
        <span class="title_right"><a href="#">More&gt;&gt;</a></span> </div>
      <!--title结束-->
      
      <div class="product_list"><img src="${pageContext.request.contextPath}/images/css.JPG" alt="第二课堂" width="158" height="106" />
        <h2><a href="index.html">第二课堂</a></h2>
        <p> 每周二下午的第二堂课仍然在继续哦！请小伙伴们不要错过，学习java的机会哦！</p>
      </div>
      <!--product_list结束-->
      
      <div class="product_type">
        <ul>
          <li>JAVA开发</li>
          <li>Android开发</li>
        </ul>
      </div>
    </div>
    <!--products结束-->
    
    <div class="sidebar">
      <div class="video">
        <div class="title">
          <h2 class="titile_left">用户登录</h2>
          <span class="title_right"><a href="#">More&gt;&gt;</a></span> </div>
        <!--title结束-->
       <form action="${pageContext.request.contextPath}/login" method="post">
		<div align="center">
			<br>
        	<h2><a>用户名:</a><h2><br><input type="text" name="account" /><br>
			<br>			
       		<h2><a>密&nbsp&nbsp码:</a></h2><br><input type="text" name="password" /><br> 
			<br>			
       		 <input type="radio" name="identity" value="1">教师  <input type="radio" name="identity" value="2">学生
        <input type="submit" value="登录" />  
        </div>
      </form> 
    </div>
    <!--sidebar结束--> 
    
  </div>
  <!--main结束--> 
</div>
<!--最外层wrap结束  -->
<div class="copyright">
  <div class="copyright_content">
    <ul>
      <li>关于
        <ul>
          <li>品牌故事</li>
          <li>联系我们</li>
          <li>加入我们</li>
          <li>版权声明</li>
        </ul>
      </li>
      <li>专业社团
        <ul>
          <li>Inet社团</li>
          <li>蜗壳社团</li>
          <li>柠檬社团</li>
          <li>雏雁社团</li>
        </ul>
      </li>
      <li>关注
        <ul>
          <li>新浪微博</li>
          <li>腾讯微博</li>
          <li>企业微信</li>
          <li>QQ空间</li>
        </ul>
      </li>
      <li>留言
        <ul>
          <li>意见反馈</li>
          <li>问题留言</li>
          <li>媒体联络</li>
          <li>在线客服</li>
        </ul>
      </li>
      <li><img src="${pageContext.request.contextPath}/images/weixin.png" alt="微信关注" width="30" height="27" />微信关注
        <ul>
          <li><img src="${pageContext.request.contextPath}/images/qrcode.jpg" alt="扫描关注慕课网官方微信" width="102" height="102" /></li>
        </ul>
      </li>
    </ul>
  </div>
  <!--copyright_content结束--> 
</div>
</body>
</html>
