<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- EL表达式支持 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单详情</title>
<link rel="stylesheet" href="<%=basePath %>css/tasp.css" />
<link href="<%=basePath %>css/orderconfirm.css" rel="stylesheet" />

<style>
#page{width:auto;}
#comm-header-inner,#content{width:950px;margin:auto;}
#logo{padding-top:26px;padding-bottom:12px;}
#header .wrap-box{margin-top:-67px;}
#logo .logo{position:relative;overflow:hidden;display:inline-block;width:140px;height:35px;font-size:35px;line-height:35px;color:#f40;}
#logo .logo .i{position:absolute;width:140px;height:35px;top:0;left:0;background:url(http://a.tbcdn.cn/tbsp/img/header/logo.png);}
</style>
<script type="text/javascript">
function dosubmit(){
	document.order.action = "<%=basePath %>orders/orders_addto.action";
	document.forms[0].submit();
	//document.order.submit();
	
}
</script>
</head>
<body data-spm="1">


<div id="page">

 <div id="content" class="grid-c">

  <div id="address" class="address" style="margin-top: 20px;" data-spm="2">
<form name="order" id="addrForm" method="post">
<h3>确认收货地址
 <span class="manage-address">
 <a href="########" target="_blank" title="管理我的收货地址" class="J_MakePoint">管理收货地址</a>
 </span>
</h3>
<ul id="address-list" class="address-list">
<c:if test="${!empty alist }">
<c:forEach var="address" items="${alist }">
   <li class="J_Addr J_MakePoint clearfix  J_DefaultAddr ">
   <div class="address-info">
 <input name="aid"
 class="J_MakePoint"
 type="radio"
 value="${address.aid }"
 checked="checked" />
 <label  class="user-address">
       ${address.uaddress }   (${address.uname} 收) <em>${address.uphone }</em>
  </label>
 </div>
 </li>
 </c:forEach>
 </c:if>
 </ul>
<ul id="J_MoreAddress" class="address-list hidden">
     
 </ul>

<div class="address-bar">
 <a href="<%=basePath %>address/address_addui.action" class="new J_MakePoint" id="J_NewAddressBtn">使用新地址</a>
 </div>

<!-- </form> -->
</div>
<!-- <form id="J_Form" name="J_Form" action="#####" method="post">
 --> <div>
 <h3 class="dib">确认订单信息</h3>
 <table cellspacing="0" cellpadding="0" class="order-table" id="J_OrderTable" summary="统一下单订单信息区域">
 <caption style="display: none">统一下单订单信息区域</caption>
 <thead>
 <tr>
 <th class="s-title">选择<hr/></th>
 <th class="s-title">商品<hr/></th>
 <th class="s-price">单价(元)<hr/></th>
 <th class="s-amount">数量<hr/></th>
 <th class="s-agio">优惠方式(元)<hr/></th>
 <th class="s-total">小计(元)<hr/></th>
 </tr>
 </thead>
<tbody data-spm="3" class="J_Shop" data-tbcbid="0" data-outorderid="47285539868"  data-isb2c="false" data-postMode="2" data-sellerid="1704508670">
<tr class="first"><td colspan="6"></td></tr>
<tr class="shop blue-line">
 <td colspan="3">
 </td>
 <td colspan="3" class="promo">
 <div>
   <ul class="scrolling-promo-hint J_ScrollingPromoHint">
       </ul>
   </div>
 </td>
</tr>
 <c:if test="${!empty olist}">
 <c:forEach var="order" items="${olist }">
<tr class="item">

<c:forEach var="product" items="${plist }">
<c:if test="${order.pid eq product.pid }">
<td>
<input name="oilist"  type="checkbox" value="${order.oid }" checked="checked"> 
</td>
 <td class="s-title">
   <a href="<%=basePath %>product/product_pdetail.action?product.pid=${product.pid }" target="_blank" title="${product.pname }" class="J_MakePoint">
     <img src="" class="itempic"><span class="title J_MakePoint" >${product.pname }</span></a>
   <div class="props">
   <c:forEach var="type" items="${tlist }">
   <c:if test="${product.tid eq type.tid}">
   <span>类别：${type.tname } </span>
   </c:if>
   </c:forEach>
   <c:forEach var="brand" items="${blist }">
   <c:if test="${product.bid eq brand.bid}">
   <span>类别：${brand.bname } </span>
   </c:if>
   </c:forEach>
   <c:forEach var="size" items="${slist }">
   <c:forEach var="order" items="${olist }">
   <c:if test="${size.sid eq order.sid}">
   <span>尺寸： ${size.psize }</span>
   </c:if>
   </c:forEach>
   </c:forEach>
   </div>
 <a title="消费者保障服务，卖家承诺商品如实描述" href="#" target="_blank">
<img src="img/flo.png"/>
</a>
  <div>
 <span style="color:gray;">卖家承诺72小时内发货</span>
 </div>
 </td>
 
 <td class="s-price">   
  <span class='price '>
 <em class="style-normal-small-black J_ItemPrice"  >${product.price }</em>
  </span>
</td>
<td>
     <input type="hidden" class="J_Quantity" value="1" />
     <c:out value="${order.pnum }"></c:out>
 </td>
 <td class="s-agio">
       <div class="J_Promotion promotion" data-point-url="">无优惠</div>
   </td>
 <td class="s-total">
   
  <span class='price '>
  	<em class="style-normal-bold-red J_ItemTotal">${product.price*order.pnum }</em>	
 </span>
 </td>
 </c:if>
</c:forEach>
</tr>

</c:forEach>
</c:if>


<tr class="item-service">
 <td colspan="5" class="servicearea" style="display: none"></td>
</tr>
<tr class="blue-line" style="height: 2px;"><td colspan="5"></td></tr>
<tr class="other other-line">
 <td colspan="6">
 <ul class="dib-wrap">
 <li class="dib user-info">
 <ul class="wrap">
 <li>
  <div class="field gbook">
   <label class="label">给卖家留言：</label>
   <textarea style="width:350px;height:80px;" title="选填：对本次交易的补充说明（建议填写已经和卖家达成一致的说明）" name="orders.liuyan"></textarea>
 </div>
</li>
   </ul>
 </li>
 <li class="dib extra-info">

 <div class="shoparea">
 <ul class="dib-wrap">
 <li class="dib title">店铺优惠：</li>
 <li class="dib sel"><div class="J_ShopPromo J_Promotion promotion clearfix"></div></li>
 <li class="dib fee">  <span class='price '>
 -<em class="style-normal-bold-black J_ShopPromo_Result"  >0.00</em>
  </span>
</li>
 </ul>
 </div>

 <div class="shoppointarea"></div>

   <div class="farearea">
 <ul class="dib-wrap J_farearea">
 <li class="dib title">运送方式：</li>
 <li class="dib sel">
   <select name="orders.lid" class="J_Fare">
   <c:forEach var="logitics" items="${llist }">
   <c:forEach var="order" items="${olist }">
   <c:if test="${order.lid eq logitics.lid }">
     <option value="${logitics.lid }" selected="selected">${logitics.lname } :${logitics.lprice }元 </option>
    </c:if>
    <c:if test="${order.lid ne logitics.lid }">
     <option value="${logitics.lid }" >${logitics.lname } :${logitics.lprice }元 </option>
    </c:if>
    </c:forEach>
   </c:forEach>
   </select>
   <em tabindex="0" class="J_FareFree" style="display: none">免邮费</em>
     </li>
 <li class="dib fee">  <span class='price'>
 <em class="style-normal-bold-red J_FareSum"  ></em>
  </span>
</li>
 </ul>
 </div>
 <div class="extra-area">
 <ul class="dib-wrap">
 <li class="dib title">发货时间：</li>
 <li class="dib content">卖家承诺订单在买家付款后，72小时内发货</li>
 </ul>
 </div> 
   <div class="servicearea" style="display: none"></div>
 </li>
 </ul>
 </td>
</tr>

<tr class="shop-total blue-line">
 <td colspan="6">店铺合计(不含运费，服务费)：
   <span class='price g_price '>
 <span>&yen;</span><em class="style-middle-bold-red J_ShopTotal"  >${total }</em>
  </span>
  <input type="hidden" name="total" value="${total }" />

   </td>
</tr>
</tbody>
  <tfoot>
 <tr>
 <td colspan="6">
<div class="order-go" data-spm="4">
<div class="J_AddressConfirm address-confirm">
	<div class="kd-popup pop-back" style="margin-bottom: 40px;">
	<div class="box">
	<div class="bd">
</div>
</div>
</div>
         <a href="<%=basePath %>cart/cart_list.action"
 class="back J_MakePoint" target="_top"
 data-point-url="">返回购物车</a>
  <a id="J_Go" class=" btn-go" title="点击此按钮，提交订单。" onclick="dosubmit()">提交订单<b class="dpl-button"></b></a>
  </div>
 </div>

 <div class="J_confirmError confirm-error">
 <div class="msg J_shopPointError" style="display: none;"><p class="error">积分点数必须为大于0的整数</p></div>
 </div>


 <div class="msg" style="clear: both;">
 <p class="tips naked" style="float:right;padding-right: 0">若价格变动，请在提交订单后联系卖家改价，并查看已买到的宝贝</p>
 </div>
 </div>
 </td>
 </tr>
 </tfoot>
 </table>
</div>
</form>
</div>

<div id="footer"></div>
</div>
</body>
</html>