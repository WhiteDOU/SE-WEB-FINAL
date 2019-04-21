    <%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>  

<!DOCTYPE html>
<html lang="en">
  <head>
  
    <script language="javascript">   
    function isValid(form)    
    {    
    if (form.id.value=="")    
     {    
     alert("活动id不能为空");    
     return false;    
     }    
   else if (form.type.value=="")    
     {    
     alert("活动类型代码不能为空");    
     return false;    
     }   
     if (form.title.value=="")    
     {    
     alert("活动标题不能为空");    
     return false;    
     }   
     if (form.content.value=="")    
     {    
     alert("活动描述不能为空");    
     return false;    
     }
     if (form.linkman.value=="")    
     {    
     alert("活动联系人不能为空");    
     return false;    
     }   
     if (form.phone.value=="")    
     {    
     alert("活动联系人电话不能为空");    
     return false;    
     }          
     if (form.date2.value=="")    
     {    
     alert("活动时间不能为空");    
     return false;    
     }   
     if (form.peoplefreenum.value=="")    
     {    
     alert("活动总人数不能为空");    
     return false;    
     }
     if (form.place.value=="")    
     {    
     alert("活动地点不能为空");    
     return false;    
     }
     else return true;
           
    }    
    </script>    
    

       
       

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
          <div class="header_top_fl fl">东大信息发布系统</div>
          <div class="header_top_fr fr"><span class="header_tel dib">欢迎使用！</span>
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
              <li class="pr"><li id="www"><li><a href="index2.jsp">首页</a></li>
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
            <div class="tit2">信息发布</div>
<p>&nbsp;</p>
<form action="putoutservlet" method="post">

    <p>
	<td>活动名称：</td>
	<td><input type="text" class="input3" name="title" size="" maxlength="20" placeholder="1~20个汉字"></td>
	</p>
	 <p>
	<td>活动类型：</td>
	<td><input type="text" class="input3" name="type" size="" maxlength="20" placeholder="1~20个汉字"></td>
	</p>
<p>
	<td>活动时间：</td>
	<td><input type="text" class="input3" name="date2" size="" maxlength="10"  placeholder="如：2018.01.01"></td>
	</p>
        <p>
	<td>活动地点：</td>
	<td><input type="text" class="input3" name="place" size="" placeholder="请填写具体地点"></td>	</p>
        <p>
	<td>人数上限：</td>
	<td><input type="text" class="input3" name="peoplefreenum" size="" maxlength="6"   placeholder="0~1000"></td>
	</p>
	 <p>
	<td>联系电话：</td>
	<td><input type="text" class="input3" name="phone" size="" maxlength="6" ></td>
	</p>

<p>信息内容：
<textarea name="content" class="input5" cols="32" rows="6"  placeholder="100~1000个汉字"></textarea>
</p>

<p>宣传图片：<input class="input6 button1" name="filename" type="file"><p>
<p>相关文档：<input class="input6 button1" name="filename" type="file"><p>

<p><button class="bb1" onclick="isValid(form)"type="submit">确认提交</button></p></form>
<p>&nbsp;</p>
<p><button class="bb1" type="submit">返回</button></p>

</div>
</div>

  </body>

      <script> 

//取出传回来的参数error并与yes比较
  var errori ='<%=request.getParameter("error")%>';
  if(errori=='yes'){
   alert("发布失败!");
   }

  
</script>  
    </html>  