<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8"/>
    <title>Go-Info</title>
    <meta name="keywords" content="keywords"/>
    <meta name="description" content="description"/>
    <script type="text/javascript" src="js/base-loading.min.js"></script>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  <body>
    <div class="s_header w">
      <div class="s_header_top w">
        <div class="header_top w1000 auto">
          <div class="header_top_fl fl">Go Info</div>
          <div class="header_top_fr fr"><span class="header_tel dib">Welcome！</span>
            <div class="cb"></div>
          </div>
          <div class="cb"></div>
        </div>
      </div>
      <div class="s_header_nav w">
        <div class="header_nav w1000 auto">
          <div class="logo fl"><a href="index.jsp"><img src="images/logo.png" alt="" width="200" height="69"//></a></div>
          <div class="nav fr">
            <ul>
              <li class="pr"><li id="www"><li><a href="index1.jsp">Home</a></li>
              <li class="pr fr"><li id="www"><li><a href="index.jsp">Login</a></li>
            </ul>
          </div>
          <div class="cb"></div>
        </div>
      </div>
    </div>
    <div class="header_line"></div>
    </div>
</header>


    <div class="centers">
     <div class="baoming">
            <div class="tit1">奔跑吧，少年！金锤社校园定向越野活动报名</div>
<p>&nbsp;</p>
        <p>
	<td>姓名：</td>
	<td><input type="text" class="input2" name="Name" size="" maxlength="15"  placeholder="请填写真实姓名"></td>
	</p>

        <p>
	<td>年龄：</td>
	<td><input type="text"  class="input2" name="Name" size="" maxlength="15" placeholder="请填写周岁"></td>
	</p>
        <form action = "enroll">  <p>
	<td>学院：</td>
	<td><select name="xueyuan" xueyuan="" size="1">
    <option value="学院">请选择学院
	<option value="计算机科学与工程学院">计算机科学与工程学院
	<option value="工商管理学院">工商管理学院
	<option value="马克思主义学院">马克思主义学院
	<option value="文法学院">文法学院
	<option value="软件学院">软件学院
	<option value="中荷生物医学与信息工程学院">中荷生物医学与信息工程学院
	<option value="生命科学与健康学院">生命科学与健康学院
	<option value="江河建筑学院">江河建筑学院
	</select></td>

	</p>
      <p><button class="bb1" type="submit">报名</button></p></form>
<p>&nbsp;</p>
<p><button class="bb1" type="submit">返回</button></p>

</div>
</div>

  </body>
</html>