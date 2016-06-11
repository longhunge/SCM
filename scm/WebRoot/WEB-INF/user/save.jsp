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
<title>Insert title here</title>
 
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

</head>
<body data-spm="1">


<div id="page">

 <div id="content" class="grid-c">

  <div id="address" class="address" style="margin-top: 20px;" data-spm="2">
<form name="addrForm" id="addrForm" action="#">
<h3>确认收货地址
 <span class="manage-address">
 <a href="########" target="_blank" title="管理我的收货地址" class="J_MakePoint">管理收货地址</a>
 </span>
</h3>
<ul id="address-list" class="address-list">
   <li class="J_Addr J_MakePoint clearfix  J_DefaultAddr ">
   <div class="address-info">
 <input name="address"
 class="J_MakePoint"
 type="radio"
 value="594209677"
 id="addrId_594209677"
 checked="checked" />
 <label for="addrId_674944241" class="user-address">
         湖北省 恩施土家族苗族自治州 恩施市 湖北民族学院（信息工程学院）  男生宿舍楼235栋2323102 (某某 收) <em>18427717260</em>
   </label>
 <em class="tip" style="display: none">默认地址</em>
 <a class="J_DefaultHandle set-default J_MakePoint" href="/auction/update_address_selected_status.htm?addrid=674944241" style="display: none" data-point-url="http://log.mmstat.com/buy.1.18">设置为默认收货地址</a>
 </div>
     </li>
     <li class="J_Addr J_MakePoint clearfix" >
 <s class="J_Marker marker"></s>
 <span class="marker-tip">寄送至</span>
 <div class="address-info">
 <a href="#" class="J_Modify modify J_MakePoint" data-point-url="#">修改本地址</a>
 <input name="address"
 class="J_MakePoint"
 type="radio"
 value="594209677"
 id="addrId_594209677"
 />
 <label for="addrId_594209677" class="user-address">
       湖北省 恩施土家族苗族自治州 恩施市 某某某 (某某某 收) <em>1342407681</em></label><em class="tip" style="display: none">默认地址</em>
   <a class="J_DefaultHandle set-default J_MakePoint" style="display: none" data-point-url="#" href="#">设置为默认收货地址</a>
 </div>
   </li>
     </ul>
<ul id="J_MoreAddress" class="address-list hidden">
     
 </ul>

<div class="address-bar">
 <a href="#" class="new J_MakePoint" id="J_NewAddressBtn">使用新地址</a>
 </div>

</form>
</div>
<form id="J_Form" name="J_Form" action="/auction/order/unity_order_confirm.htm" method="post">
 <div>
 <h3 class="dib">确认订单信息</h3>
 <table cellspacing="0" cellpadding="0" class="order-table" id="J_OrderTable" summary="统一下单订单信息区域">
 <caption style="display: none">统一下单订单信息区域</caption>
 <thead>
 <tr>
 <th class="s-title">店铺宝贝<hr/></th>
 <th class="s-price">单价(元)<hr/></th>
 <th class="s-amount">数量<hr/></th>
 <th class="s-agio">优惠方式(元)<hr/></th>
 <th class="s-total">小计(元)<hr/></th>
 </tr>
 </thead>
     


<tbody data-spm="3" class="J_Shop" data-tbcbid="0" data-outorderid="47285539868"  data-isb2c="false" data-postMode="2" data-sellerid="1704508670">
<tr class="first"><td colspan="5"></td></tr>
<tr class="shop blue-line">
 <td colspan="3">
 </td>
 <td colspan="2" class="promo">
 <div>
   <ul class="scrolling-promo-hint J_ScrollingPromoHint">
       </ul>
   </div>
 </td>
</tr>
 <tr class="item" data-lineid="19614514619:31175333266:35612993875" data-pointRate="0">
 <td class="s-title">
   <a href="#" target="_blank" title="Huawei/华为 G520新款双卡双待安卓系统智能手机4.5寸四核手手机" class="J_MakePoint" data-point-url="http://log.mmstat.com/buy.1.5">
     <img src="#########" class="itempic"><span class="title J_MakePoint" >Huawei/华为 G520新款双卡双待安卓系统智能手机4.5寸四核手手机</span></a>

   <div class="props">
   <span>机身颜色: 黑 </span>
   <span>手机套餐: 套餐二 </span>
   <span>机身内存: 4G </span>
   <span>版本: 中国大陆 </span>
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
 <em class="style-normal-small-black J_ItemPrice"  >630.00</em>
  </span>
</td>
 <td class="s-amount" data-point-url="">
         <input type="hidden" class="J_Quantity" value="1" name="19614514619_31175333266_35612993875_quantity"/>1
 
 </td>
 <td class="s-agio">
       <div class="J_Promotion promotion" data-point-url="">无优惠</div>
   </td>
 <td class="s-total">
   
   <span class='price '>
 <em class="style-normal-bold-red J_ItemTotal "  >630.00</em>
  </span>
 </td>
</tr>



<tr class="item-service">
 <td colspan="5" class="servicearea" style="display: none"></td>
</tr>
<tr class="blue-line" style="height: 2px;"><td colspan="5"></td></tr>
<tr class="other other-line">
 <td colspan="5">
 <ul class="dib-wrap">
 <li class="dib user-info">
 <ul class="wrap">
 <li>
  <div class="field gbook">
   <label class="label">给卖家留言：</label>
   <textarea style="width:350px;height:80px;" title="选填：对本次交易的补充说明（建议填写已经和卖家达成一致的说明）" name=""></textarea>
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
   <select name="1704508670:2|post" class="J_Fare">
     <option data-fare="1500" value=" 2 " data-codServiceType="2" data-level=""  selected="selected"  >快递 15.00元 </option>
   </select>
   <em tabindex="0" class="J_FareFree" style="display: none">免邮费</em>
     </li>
 <li class="dib fee">  <span class='price'>
 <em class="style-normal-bold-red J_FareSum"  >30.00</em>
  </span>
</li>
 </ul>
 </div>
 <div class="extra-area">
 <ul class="dib-wrap">
 <li class="dib title">发货时间：</li>
 <li class="dib content">卖家承诺订单在买家付款后，72小时内<a href="#">发货</a></li>
 </ul>
 </div> 
   <div class="servicearea" style="display: none"></div>
 </li>
 </ul>
 </td>
</tr>

<tr class="shop-total blue-line">
 <td colspan="5">店铺合计(<span class="J_Exclude" style="display: none">不</span>含运费<span class="J_ServiceText" style="display: none">，服务费</span>)：
   <span class='price g_price '>
 <span>&yen;</span><em class="style-middle-bold-red J_ShopTotal"  >630.00</em>
  </span>
  <input type="hidden" name="1704508670:2|creditcard" value="false" />
<input type="hidden" id="J_IsLadderGroup" name="isLadderGroup" value="false"/>

   </td>
</tr>
</tbody>
  <tfoot>
 <tr>
 <td colspan="5">

<div class="order-go" data-spm="4">
<div class="J_AddressConfirm address-confirm">
 <div class="kd-popup pop-back" style="margin-bottom: 40px;">
 <div class="box">
 <div class="bd">
 <div class="point-in">
   
   <em class="t">实付款：</em>  <span class='price g_price '>
 <span>&yen;</span><em class="style-large-bold-red"  id="J_ActualFee"  >630.00</em>
  </span>
</div>

  <ul >
 <li><em>寄送至:</em><span id="J_AddrConfirm" style="word-break: break-all;">
   湖北省 恩施土家族苗族自治州 恩施市 湖北民族学院（信息工程学院）  男生宿舍楼235栋1234202
 </span></li>
 <li><em>收货人:</em><span id="J_AddrNameConfirm">某某某 18124317260 </span></li>
 </ul>
     </div>
 </div>
         <a href="#"
 class="back J_MakePoint" target="_top"
 data-point-url="">返回购物车</a>
  <a id="J_Go" class=" btn-go"  data-point-url=""  tabindex="0" title="点击此按钮，提交订单。">提交订单<b class="dpl-button"></b></a>
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