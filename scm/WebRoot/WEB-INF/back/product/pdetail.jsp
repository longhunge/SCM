<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>详情</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start details -->
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/productviewgallery.css" media="all" />
	<script src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
	<style type="text/css">
		*{
			margin: 0;padding: 0; 
		} 
		img{vertical-align: top;border: 0;}
		/* #MagnifierWrap{position: relative;width: 350px;margin:100px auto;} */
		#MagnifierWrap2{position: relative;width: 350px;margin:100px auto;}

		.MagnifierMain{position: relative;width: 350px;height: 350px;}
		.MagnifierMain img{width: 100%;} 
		.MagnifierDrag{position: absolute;top:0;left: 0;background-color: #ccc; opacity: 0.4;filter:alpha(opacity = 40);cursor: move;}

		.MagnifierPop{position: absolute;top:0;overflow: hidden;background:#fff url(http://fan.yoka.com/fan5.0/img/loading.gif) no-repeat center center; }
		.MagnifierImg{position: absolute;top:0; left: 0;}

		.spec-items{position: relative;width: 292px;height: 69px;overflow: hidden;padding-top: 10px;margin: 0 auto;}
		.spec-items ul{width: 500%;position: absolute;top: 10px;left: 0;}
		.spec-items ul *{
			-webkit-transition: all .3s;
			-o-transition: all .3s;
			transition: all .3s;
		}
		.spec-items li{
			width: 65px;height: 65px;float: left;overflow: hidden;margin-right: 5px;border: 2px solid #fff;cursor: pointer;
			
		}
		.spec-items li.on{border:2px solid #000;}
		.spec-items li img{
			width: 100%;
			-webkit-transform: scale(1,1);
			-ms-transform: scale(1,1);
			-o-transform: scale(1,1);
			transform: scale(1,1);
		}
		.spec-items li.on img{
			-webkit-transform: scale(1.2,1.2);
			-ms-transform: scale(1.2,1.2);
			-o-transform: scale(1.2,1.2);
			transform: scale(1.2,1.2);
		}
		span.spe_leftBtn,span.spe_rightBtn{position: absolute;bottom: 0px;display: block;width: 20px;height: 69px;line-height: 69px;font-family: "黑体";text-align: center;font-size: 30px;color: #ddd;cursor: default;background-color: #f9f9f9;}
		span.on{background-color: #ccc;color: #999;cursor: pointer;} 
		span.spe_leftBtn{left: 0;}
		span.spe_rightBtn{right: 0;}

		.i_tips{height:30px;margin-left:20px;color:#f60;font-size:14px;line-height:30px}
		.i_box{margin:10px 20px;font-size:14px;float:left}
		.i_box *{vertical-align:middle}
		.i_box a{padding:2px 5px;background-color:#e9e9e9;border:1px solid #ccc;text-decoration:none;color:#585858;line-height:20px}
		.i_box a:hover{color:#000}
		.i_box input{width:30px;height:18px;margin:0 8px;padding:2px;border:1px solid #ccc;text-align:center;line-height:16px}
	</style>
	<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/cloud-zoom.1.0.3.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox.pack.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-buttons.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.fancybox-thumbs.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/productviewgallery.js"></script>
	<!-- start top_js_button -->
	<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
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
  <div class="header_bg">
   <div class="wrap">
	<div class="header">
		<div class="logo">
			<a href="index.html"><img src="<%=basePath%>images/logo.png" alt=""/> </a>
		</div>
		<div class="h_icon">
		<ul class="icon1 sub-icon1">
			<li><a class="active-icon c1" href="#"><i>$300</i></a>
				<ul class="sub-icon1 list">
					<li><h3>shopping cart empty</h3><a href=""></a></li>
					<li><p>if items in your wishlit are missing, <a href="contact.html">contact us</a> to view them</p></li>
				</ul>
			</li>
		</ul>
		</div>
		<div class="h_search">
    		<form>
    			<input type="text" value="">
    			<input type="submit" value="">
    		</form>
		</div>
		<div class="clear"></div>
	</div>
</div>
</div>
<div class="header_btm">
<div class="wrap">
	<div class="header_sub">
		<div class="h_menu">
			<ul>
				<li class="active"><a href="index.html">主页</a></li> |
				<li><a href="sale.html">推荐</a></li> |
				<li><a href="handbags.html">男鞋</a></li> |
				<li><a href="handbags.html">女鞋</a></li> |
				<li><a href="shoes.html">男装</a></li> |
				<li><a href="handbags.html">女装</a></li> |
				<li><a href="service.html">服务</a></li> |
				<li><a href="contact.html">联系我们</a></li>
			</ul>
		</div>
		<div class="top-nav">
	          <nav class="nav">	        	
	    	    <a href="#" id="w3-menu-trigger"> </a>
	                  <ul class="nav-list" style="">
				<li class="active"><a href="index.html">主页</a></li> |
				<li><a href="sale.html">推荐</a></li> |
				<li><a href="handbags.html">男鞋</a></li> |
				<li><a href="handbags.html">女鞋</a></li> |
				<li><a href="shoes.html">男装</a></li> |
				<li><a href="handbags.html">女装</a></li> |
				<li><a href="service.html">服务</a></li> |
				<li><a href="contact.html">联系我们</a></li>
	                 </ul>
	           </nav>
	             <div class="search_box">
				<form>
				   <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
			    </form>
			</div>
	          <div class="clear"> </div>
	          <script src="<%=basePath%>js/responsive.menu.js"></script>
         </div>	
	<div class="clear"></div>
</div>
</div>
</div>
<!-- start main -->
<div class="main_bg">
<div class="wrap">	
	<div class="main">
	<!-- start content -->
	<div class="single">
			<!-- start span1_of_1 -->
			<div class="left_content">
			<div class="span1_of_1">
				<!-- start product_slider -->
	
	<div id="MagnifierWrap2">
	<div class="MagnifierMain">
		<img class="MagTargetImg" src="<%=basePath%>${product.img1}"> 
	</div>
	<span class="spe_leftBtn">&lt;</span>
	<span class="spe_rightBtn">&gt;</span>
	<div class="spec-items"> 
		<ul>
			<li class="on"><img src="<%=basePath%>${product.img1}"></li>
			<li><img src="<%=basePath%>${product.img1}"></li>
			<li><img src="<%=basePath%>${product.img2}"></li>
			<li><img src="<%=basePath%>${product.img3}"></li>
			<li><img src="<%=basePath%>${product.img4}"></li>
			<li><img src="<%=basePath%>${product.img5}"></li>
			
		</ul>
	</div>
</div>
<script type="text/javascript">
;(function(){ 
	var EventUtil,Get,Element; 
	EventUtil = {
		addHandler: function(ele, type, handler) {
			if (ele.addEventListener) {
				ele.addEventListener(type, handler, false)
			} else if (ele.attachEvent) {
				ele.attachEvent("on" + type, handler)
			} else {
				ele["on" + type] = handler;
			}
		},
		removeHandler: function(element, type, handler) {
			if (element.removeEventListener) {
				element.removeEventListener(type, handler, false);
			} else if (element.detachEvent) {
				element.detachEvent("on" + type, handler);
			} else {
				element["on" + type] = null;
			}
		},
		getEvent: function(event) {
			return event ? event : window.event;
		},
		getTarget: function(event) {
			return event.target || event.srcElement;
		},
		preventDefault: function(event) {
			if (event.preventDefault) {
				event.preventDefault();
			} else {
				event.returnValue = false;
			}
		},
		stopPropagation: function(event){
	        if (event.stopPropagation){
	            event.stopPropagation();
	        } else {
	            event.cancelBubble = true;
	        }
	    } 
	};

	Get = {
		byId: function(id) {
			return typeof id === "string" ? document.getElementById(id) : id
		},
		byClass: function(sClass, oParent) {
			var aClass = [];
			var reClass = new RegExp("(^| )" + sClass + "( |$)");
			var aElem = this.byTagName("*", oParent);
			for (var i = 0; i < aElem.length; i++) reClass.test(aElem[i].className) && aClass.push(aElem[i]);
			return aClass
		},
		byTagName: function(elem, obj) {
			return (obj || document).getElementsByTagName(elem)
		}
	}; 
 	
 	Element = {
 		hasClass:function(obj,name){
			return (' '+obj.className+' ').indexOf(' '+name+' ') > -1 ? true : false;
		},
		addClass : function(obj,name){
			if(this.hasClass(obj,name)) return;
			obj.className += ' ' + name;
		},
		removeClass : function(obj,name){
			obj.className = obj.className.replace(new RegExp('(^|\\s)' +name+ '(?:\\s|$)'),'$1').replace(/\s{1,}/g,' ');
		}
 	}

	function MagnifierF(){ 
		this.init.apply(this,arguments);  
	}

	MagnifierF.prototype = {
		init: function(id){
			var _is = this; 
			this.magWrap = Get.byId(id);
			this.magMain = this.magWrap.children[0];
			this.mW = this.magMain.offsetWidth;
			this.mH = this.magMain.offsetHeight;
			this.magImg = this.magMain.getElementsByTagName('img')[0];
			this.mImgSrc = this.magImg.getAttribute('src').slice(0,-4);

			this.specBox = Get.byClass("spec-items",this.magWrap)[0];
			this.specUl = this.specBox.getElementsByTagName('ul')[0];
			this.specItem = this.specBox.getElementsByTagName('li');

			_is.specFn();
			_is.setEventFn().dragEvent();
			
		},
		setEleFn: function(){   
			var _is = this,
				_html1 = "",
				oFrag = document.createDocumentFragment(),
				oFrag2 = document.createDocumentFragment(); 

			_is.oMD = document.createElement('div');
			_is.oMD.className = "MagnifierDrag"; 
			_is.oMD.style.cssText = 'width:' + _is.mW/2 +'px;height:' + _is.mH/2 + 'px;';
			_is.oMD.innerHTML = "&nbsp;";

			_is.oMP =  document.createElement('div');
			_is.oMP.className = 'MagnifierPop';
			_is.oMP.style.cssText =  'width:' + _is.mW +'px;height:' + _is.mH + 'px;right:' + (-_is.mW-10) + 'px;';  
			
			_is.oMI = document.createElement('div');
			_is.oMI.className ='MagnifierImg';
			_is.oMI.style.cssText = 'width:' + _is.mW*2 + 'px;height:' + _is.mH*2 + 'px;';
			_html1 = '<img style="width:100%;height:100%;" src="' + _is.mImgSrc + '.jpg">'
			_is.oMI.innerHTML = _html1; 

			_is.oMP.appendChild(_is.oMI)

			oFrag.appendChild(_is.oMD);
			oFrag2.appendChild(_is.oMP);   

			_is.magMain.appendChild(oFrag);
			_is.magWrap.appendChild(oFrag2);  

		},
		removeFn :function(){
			var _is = this;
				_is.magMain.removeChild(_is.oMD);
				_is.magWrap.removeChild(_is.oMP);  
		},
		setMousemoveFn :function(event){
			var _is = this,
				 
				_WinScrLeft = document.documentElement.scrollLeft || document.body.scrollLeft,
				_WinScrTop = document.documentElement.scrollTop || document.body.scrollTop;
				
				_x = event.clientX + _WinScrLeft -  
				(_is.magWrap.getBoundingClientRect().left  + _WinScrLeft) - _is.oMD.offsetWidth/2;

				_y = event.clientY  + _WinScrTop - 
				(_is.magMain.getBoundingClientRect().top  + _WinScrTop) - _is.oMD.offsetHeight/2;
				
				_l = _is.magMain.offsetWidth - _is.oMD.offsetWidth;
				_t = _is.magMain.offsetHeight - _is.oMD.offsetHeight;
				
				_l2 = - (_is.oMI.offsetWidth - _is.magMain.offsetWidth);
				_t2 = - (_is.oMI.offsetHeight - _is.magMain.offsetHeight);

				if( _x < 0 )
		        {
		            _x = 0;  
		        }
		        else if( _x > _l )
		        {
		            _x = _l;
		        }
		         
		        if( _y < 0 )
		        {
		            _y = 0;  
		        }
		        else if( _y > _t )
		        {
		            _y = _t;
		        }
			 	
				 
				_is.oMD.style.left = _x + "px";
				_is.oMD.style.top  = _y + "px";
				 
				
				_bigx = _x / _l;
				_bigy = _y / _t;
					

				_is.oMI.style.left = _bigx * _l2 + "px";
				_is.oMI.style.top = _bigy * _t2 + "px";  
		},
		setEventFn: function(){
			var _is = this,
				_x = 0,
				_y = 0,
				_l = 0,
				_t = 0,
				_bigx = 0,
				_bigy = 0,
				_l2 = 0, 
				_t2 = 0;

			function handleEvent(event){
				event = EventUtil.getEvent(event);   

				switch(event.type){
					case "mouseenter":  
						_is.setEleFn(); 
					break;
					case "mousemove": 
						if (_is.oMD) {
							_is.setMousemoveFn(event);
						}
					break;
					case "mouseleave":   
						_is.removeFn(); 
					break;
				} 
				
			}	
			return {
				dragEvent: function() { 

					EventUtil.addHandler(_is.magMain, "mouseenter", handleEvent);
					EventUtil.addHandler(_is.magMain, "mousemove", handleEvent);
					EventUtil.addHandler(_is.magMain, "mouseleave", handleEvent);  
				} 
			}
			
		},
		specFn: function(){
			var _is = this, _oSpImg, _oISrc,
				oLBtn = Get.byClass("spe_leftBtn",_is.magWrap)[0],
				oRBtn = Get.byClass("spe_rightBtn",_is.magWrap)[0],
				oLiW = this.specUl.getElementsByTagName('li')[0].offsetWidth + 5,
				_len = _is.specItem.length,  
				n = 0,
				l = null, 
				r = null;  

			function TabFn(event){   
				var target = EventUtil.getTarget(event),
					i = 0;  

				if (target.nodeName != "UL") { 

					if (target.nodeName == "IMG") {
						target = target.parentNode;
					}
					for (; i < _len; i++){
						_is.specItem[i].className = '';
					}
					target.className = 'on';

					_oSpImg = target.getElementsByTagName('img')[0]; 
					_oISrc = _oSpImg.getAttribute('src'); 
					
					_is.magImg.setAttribute('src',_oISrc);
					_is.mImgSrc =  _oISrc.slice(0,-4);  
				}
				 
			}   
			EventUtil.addHandler(_is.specUl,"mouseover",TabFn);

			function moveFn(event){
				var target = EventUtil.getTarget(event);
				 
				if (target.className.indexOf("spe_rightBtn") > -1 ) {
					r = ++n; 
					if (r > _len - 5)
							Element.removeClass(target,"on");

					if (r > _len - 4) { 

						n = _len - 4; 
						return false;
					}else{   

						_is.buttur(_is.specUl, {left:-(r*oLiW)}); 
						Element.addClass(oLBtn,"on");
					} 
				} 
				if (target.className.indexOf("spe_leftBtn") > -1 ) {
					l = --n; 
					if (l < 1)
						Element.removeClass(target,"on");

					if (l < 0) {

						n = 0;  
						return false; 
					}else{ 

						_is.buttur(_is.specUl, {left:-(l*oLiW)});  
						Element.addClass(oRBtn,"on"); 
					}  
				} 
			}

			if(_len > 4 ){

				Element.addClass(oRBtn,"on");  
				EventUtil.addHandler(_is.magWrap,"click",moveFn);
			}
			 

				 			 
		},
		buttur: function(ele, obj) {

	        window.clearTimeout(ele.timer);

	        var _this = this,
	            end = null;

	        for (direc in obj) {

	            var direc1 = direc.toLowerCase(),
	                strOffset = "offset" + direc1.substr(0, 1).toUpperCase() + direc1.substring(1).toLowerCase(),
	                target = obj[direc],
	                nSpeed = (target - ele[strOffset]) / 8; 
	                
	            nSpeed = nSpeed >= 0 ? Math.ceil(nSpeed) : Math.floor(nSpeed);
	            ele.style[direc1] = ele[strOffset] + nSpeed + "px";
	            end += nSpeed;

	        }

	        if (end)

	            if (typeof fnCallback == "function") {
	                fnCallback.call(ele);
	            } else {

	                ele.timer = window.setTimeout(function() {
	                    _this.buttur(ele, obj)
	                }, 20);

	            }
	    }  

	} 
    
	window['MagnifierF'] = function(id){
		return new MagnifierF(id);
	}

})()


window.onload = function(){
 

	  MagnifierF("MagnifierWrap2");
		 
}
</script>	
					<!-- end product_slider -->
		</div>
			<!-- start span1_of_1 -->
			<div class="span1_of_1_des">
			<form>
				  <div class="desc1">
					<h3>${product.pname }</h3>
					<p>服装简介在这里咯</p>
					<h5>￥${product.price } <a href="#">联系客服</a></h5>
					<div class="available">
						<h4>详情选择:</h4>
						<ul>
							<li>物流公司:
								<select>
								<option>顺丰</option>
								<option>韵达</option>
								
							</select></li>
							<li>尺寸:
								<select>
								<c:forEach var="posize" items="${slist }" varStatus="rowStatus">
									<option >${posize.psize }</option>
								</c:forEach>
								</select>
							<li>
						<div class="i_box">数量:<a href="javascript:;" class="J_minus">-</a><input type="text" value="0" class="J_input" /><a href="javascript:;" class="J_add">+</a></div>
						</li>
						</ul>
						<ul>
						
						</ul>
						<li>
							<a href="#" ></a>
						</li>	
						<span class="span_right"><a href="#"><img src="<%=basePath%>images/logo/addcart.png" title="加入购物车"></a></span>
						<div class="clear"></div>
					</div>
			   	 </div>
				 </form>
			   	</div>
				
			   
		         	<!-- end tabs -->
			   	</div>
          	    <div class="clear"></div>
	       </div>	
	<!-- end content -->
	</div>
	</div>
</div>
</div>		
<!-- start footer -->
<div class="footer_bg">
<!-- start footer -->
<div class="footer_bg1">
<div class="wrap">
	<div class="footer">
		<!-- scroll_top_btn -->
		<script src="<%=basePath%>js/mycount.js"></script>
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
		 <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
		<!--end scroll_top_btn -->
		<div class="copy">
			<p class="link">Copyright &copy; 2014.Company name All rights reserved LCX</p>
		</div>
		<div class="clear"></div>
	</div>
</div>
</div>
  </body>
</html>
