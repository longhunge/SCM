package com.lcx.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Brand;
import com.lcx.entity.Orders;
import com.lcx.entity.Product;
import com.lcx.entity.ProductType;
import com.lcx.entity.User;
import com.lcx.service.BrandService;
import com.lcx.service.OrdersService;
import com.lcx.service.ProductService;
import com.lcx.service.ProductTypeService;
import com.lcx.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

	@Resource
	OrdersService ordersService;
	@Resource
	UserService userService;
	@Resource
	ProductService productService;
	@Resource
	ProductTypeService productTypeService;
	@Resource
	BrandService brandService;
	List<Product> plist = new ArrayList<Product>()  ;
	List<Orders> olist;
	List<User> ulist;
	List<ProductType> tlist;
	List<Brand> blist;
	Orders order;
	
	public String olistui(){
		tlist = productTypeService.findall();
		blist = brandService.findall();
//		ActionContext actionContext = ActionContext.getContext();
//		User user = new User();
//		user = (User) actionContext.getSession().get("user");		
		olist = ordersService.findall();
		ulist = userService.findall();
		plist = productService.findall();
//		for(Orders od : olist){
//			Product product = new Product(); 
//			product = productService.findbyid(od.getPid());
//			plist.add(product);				
//		}
		return "olistui";
	}

	public String delete(){
		
		ordersService.delete(order.getOid());
		return "olist";
	}
	
	public OrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	public BrandService getBrandService() {
		return brandService;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

	public List<Orders> getOlist() {
		return olist;
	}

	public void setOlist(List<Orders> olist) {
		this.olist = olist;
	}
	
	public List<User> getUlist() {
		return ulist;
	}

	public void setUlist(List<User> ulist) {
		this.ulist = ulist;
	}

	public List<ProductType> getTlist() {
		return tlist;
	}

	public void setTlist(List<ProductType> tlist) {
		this.tlist = tlist;
	}

	public List<Brand> getBlist() {
		return blist;
	}

	public void setBlist(List<Brand> blist) {
		this.blist = blist;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
}


