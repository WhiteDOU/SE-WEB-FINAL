<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s2" uri="/struts-tags" %>
<!DOCTYPE HTML>
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
              <li class="pr"><li id="www"><li><a href="index.jsp">Home</a></li>
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
   
    <div id="login">  
        <h1>请登录</h1>  
        <form action="LogInOutservlet" method="post">  
            <input class="input1" type="text" required="required" placeholder="请输入账号" name="name"></input>  
            <input class="input1" type="password" required="required" placeholder="请输入密码" name="pwd"></input>  
            <button class="but" type="submit">登录</button>  
        </form>
        

    </div>   

  </body>
  <script> 

//取出传回来的参数error并与yes比较
  var errori ='<%=request.getParameter("error")%>';
  if(errori=='yes'){
   alert("登录失败!");
  }
</script>
</html>