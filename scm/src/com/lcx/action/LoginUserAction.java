package com.lcx.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Hot;
import com.lcx.entity.Product;
import com.lcx.entity.User;
import com.lcx.service.HotService;
import com.lcx.service.ProductService;
import com.lcx.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginUserAction extends ActionSupport {
	@Resource
	private UserService userService;
	@Resource
	private HotService hotService;
	@Resource
	private ProductService productService;
	
	private Product product =new Product();
	private List <Product> plist =new ArrayList<Product>() ;
	private Hot hot;
	private List <Hot> hlist =new ArrayList<Hot>();
	private User user;
	ActionContext ctx = ActionContext.getContext();
	
	public String login(){
		
		if(user!=null){
			User loginUser=userService.findUser(user);
			ctx.getSession().put("user", loginUser);
		}
		hlist = hotService.findall();
		for(Hot ho: hlist){
			System.out.println(ho.getHot1());
			product = productService.findbyid(ho.getHot1());
			System.out.println(product.getPname());
			plist.add(product);
		}
		return "login";
	}
	
//	public String login(){	
//		if(user!=null){
//			User loginUser=userService.findUser(user);
//			ctx.getSession().put("user", loginUser);
//		}
//		return "login";
//	}
	
	
	
	public HotService getHotService() {
		return hotService;
	}



	public void setHotService(HotService hotService) {
		this.hotService = hotService;
	}



	public ProductService getProductService() {
		return productService;
	}



	public void setProductService(ProductService productService) {
		this.productService = productService;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public List<Product> getPlist() {
		return plist;
	}



	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}



	public Hot getHot() {
		return hot;
	}



	public void setHot(Hot hot) {
		this.hot = hot;
	}



	public List<Hot> getHlist() {
		return hlist;
	}



	public void setHlist(List<Hot> hlist) {
		this.hlist = hlist;
	}



	public UserService getUserService() {
		return userService;
	}
	public User getUser() {
		return user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
