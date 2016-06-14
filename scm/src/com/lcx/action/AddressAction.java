package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Address;
import com.lcx.entity.User;
import com.lcx.service.AddressService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAction extends ActionSupport {
	@Resource
	AddressService addressService;
	List<Address> alist;
	Address address;
	ActionContext atx = ActionContext.getContext();
	public String addui(){
		
		return "addui";
	}
	
	public String add(){
		User user = new User();
		user = (User) atx.getSession().get("user");
		if(user!=null){
			address.setUid(user.getU_id());
		}
		addressService.save(address);
		return "list";
	}
	public String delete(){
		addressService.delete(address.getAid());
		return "list";
	}
	public String listu(){
		ActionContext actionContext = ActionContext.getContext();
		User user = new User();
		user = (User) actionContext.getSession().get("user");
		alist = addressService.findbyuid(user.getU_id());		
		return "listu";
	}
	public String editui() {
		address = addressService.findbyid(address.getAid());
		return "editui";
	}
	public String edit(){
		ActionContext actionContext = ActionContext.getContext();
		User user = new User();
		user = (User) actionContext.getSession().get("user");
		address.setUid(user.getU_id());
		addressService.update(address);
		return "list";
	}
	
	public AddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	public List<Address> getAlist() {
		return alist;
	}

	public void setAlist(List<Address> alist) {
		this.alist = alist;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
