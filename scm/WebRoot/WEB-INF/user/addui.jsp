<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<title>添加地址 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath%>js/jquery.min.js"></script> 
<!-- start top_js_button -->
<script type="text/javascript" src="<%=basePath%>js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easing.js"></script>
   <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>
</head>
<body>

<div class="main_bg">
<div class="wrap">	
<div class="main">
	 	 <div class="contact">									
				  <div class="contact-form">
			 	  	 	<h2>添加收货地址</h2>
			 	 	    <form method="post" action="<%=basePath%>address/address_add.action">
					    	<div>
						    	<span><label>地址</label></span>
						    	<span><input name="address.uaddress" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span><label>收件人姓名</label></span>
						    	<span><input name="address.uname" type="text" class="textbox"></span>
						    </div>
						    <div>
						     	<span><label>联系电话</label></span>
						    	<span><input name="address.uphone" type="text" class="textbox"></span>
						    </div>
						   <div>
						   		<span><input type="submit" class="" value="添加"></span>
						  </div>
					    </form>
				    </div>
  				<div class="clear"></div>		
			  </div>
		</div>
</div>
</div>		

<div class="footer_bg1">
<div class="wrap">
	<div class="footer">
		<!-- scroll_top_btn -->
	    <script type="text/javascript">
			$(document).ready(function() {
			
				var defaults = {
		  			containerID: 'toTop', // fading element id
					containerHoverID: 'toTopHover', // fading element hover id
					scrollSpeed: 1200,
					easingType: 'linear' 
		 		};
				
				
				$().UItoTop({ easingType: 'easeOutQuart' });
				
			});
		</script>
		<div class="copy">
			<p class="link">Copyright &copy; 2014.LCX All rights reserved.</p>
		</div>
		<div class="clear"></div>
	</div>
</div>
</div>
</body>
</html>
