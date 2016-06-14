package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Orders;
import com.lcx.entity.User;
import com.lcx.entity.WOrder;
import com.lcx.entity.WuliuUpdate;
import com.lcx.service.OrdersService;
import com.lcx.service.WOrderService;
import com.lcx.service.WuliuUpdateService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WuliuAction extends ActionSupport {
	@Resource
	WuliuUpdateService wuliuUpdateService;
	@Resource
	WOrderService wOrderService;
	@Resource
	OrdersService ordersService;
	
	List<Orders> olist;
	List<WuliuUpdate> ulist;
	List<WOrder> wolist;
	ActionContext atx = ActionContext.getContext();
	public String listui(){
		User user = new User();
		user = (User) atx.getSession().get("user");
		if(user!=null){
			wolist = wOrderService.findbylid("8a82a9925516f506015516f601350000");
		}
		olist = ordersService.findall();
		System.out.println(wolist.size());
		//wolist =  wOrderService.findall();		
		return "listui";
	}
	
	public WuliuUpdateService getWuliuUpdateService() {
		return wuliuUpdateService;
	}
	public void setWuliuUpdateService(WuliuUpdateService wuliuUpdateService) {
		this.wuliuUpdateService = wuliuUpdateService;
	}
	public WOrderService getwOrderService() {
		return wOrderService;
	}
	public void setwOrderService(WOrderService wOrderService) {
		this.wOrderService = wOrderService;
	}
	public OrdersService getOrdersService() {
		return ordersService;
	}
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}
	public List<Orders> getOlist() {
		return olist;
	}
	public void setOlist(List<Orders> olist) {
		this.olist = olist;
	}
	public List<WuliuUpdate> getUlist() {
		return ulist;
	}
	public void setUlist(List<WuliuUpdate> ulist) {
		this.ulist = ulist;
	}
	public List<WOrder> getWolist() {
		return wolist;
	}
	public void setWolist(List<WOrder> wolist) {
		this.wolist = wolist;
	}
	
}
