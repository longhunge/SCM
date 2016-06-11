package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Cart;
import com.lcx.entity.Orders;
import com.lcx.service.CartService;
import com.lcx.service.OrdersService;
import com.opensymphony.xwork2.ActionSupport;

public class OrdersAction extends ActionSupport {
	@Resource
	OrdersService ordersService;
	@Resource
	CartService cartService;
	List<String> cartlist;
	List<Orders> olist;
	Orders orders;
	public String save(){
		System.out.println("+++++++"+cartlist.toString());
		if(cartlist != null){
		for(String  cid : cartlist){
			Cart cart = new Cart();
			cart = cartService.findbyid(cid);
			Orders od = new Orders();
			od.setPid(cart.getPid());
			od.setPnum(cart.getCnumber());
			od.setLid(cart.getLid());
			od.setOstatus("待付款");
			olist.add(od);
			ordersService.save(od);
			}
		}
		
		return "detail";
	}
	
	public List<Orders> getOlist() {
		return olist;
	}

	public void setOlist(List<Orders> olist) {
		this.olist = olist;
	}

	public List<String> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<String> cartlist) {
		this.cartlist = cartlist;
	}

	public OrdersService getOrdersService() {
		return ordersService;
	}

	public CartService getCartService() {
		return cartService;
	}

	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	
}
