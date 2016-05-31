<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>三秒后跳转</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="error" align="center">
         <c:if test="${msg != null}">
         	<c:out value="${msg }成功"></c:out>
         	<c:set var="msg" scope="session" value=""/>
         </c:if>	
		<p>操作成功！</p> 
		<p>将在 <span id="mes">3</span> 秒钟后返回！</p> 
		<a href="back/user_listui.action">点击此处直接返回</a>
	</div> 

    <script language="javascript" type="text/javascript"> 
		var i = 3; 
		var intervalid; 
		intervalid = setInterval("fun()", 1000); 
		function fun() { 
		if (i == 0) { 
			window.location.href = "back/user_listui.action"; 
				clearInterval(intervalid); 
			} 
			document.getElementById("mes").innerHTML = i; 
			i--; 
		} 
	</script>
  </body>
</html>
