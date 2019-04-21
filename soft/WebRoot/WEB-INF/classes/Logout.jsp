    <%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>  

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


    <div class="centers">
     <div class="baoming">
            <div class="tit2">登出</div>
<p>&nbsp;</p>
<form action="Logout" method="post">
<p>

	
<p><button class="bb1" type="submit">确认登出</button></p></form>

<p>&nbsp;</p>
<p><button class="bb1" type="submit">返回</button></p>

</div>
</div>

  </body>

      <script> 

//取出传回来的参数error并与yes比较
  var errori ='<%=request.getParameter("error")%>';
  if(errori=='yes'){
   alert("发布失败!(id重复)");}

  
</script>  
    </html>  