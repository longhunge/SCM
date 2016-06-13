package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Orders;
import com.lcx.entity.User;
import com.lcx.service.OrdersService;
import com.lcx.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

	@Resource
	OrdersService ordersService;
	@Resource
	UserService userService;
	List<Orders> olist;
	List<User> uList;
	Orders orders;
	public String olistui(){
		olist=ordersService.findall();
		for(Orders od : olist){
			if(od.getUid()!=null){
				User u=new User();
				u = userService.findbyid(od.getUid());
				uList.add(u);
			}
		}
		return "olistui";
	}
}
