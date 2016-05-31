package com.lcx.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Hot;
import com.lcx.entity.Product;
import com.lcx.service.HotService;
import com.lcx.entity.User;
import com.lcx.service.ProductService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HotAction extends ActionSupport {
	@Resource
	private HotService hotService;
	@Resource
	private ProductService productService;
	
	
	private Product product;
	private List <Product> plist = new ArrayList<Product>();
	private Hot hot;
	private List <Hot> hlist;
	private User user;
	ActionContext ctx = ActionContext.getContext();
	public String hot(){
		hlist=hotService.findall();
		if (hlist != null) {
			for (Hot hot : hlist) {
				product = productService.findbyid(hot.getHot1());
				plist.add(product);
			}
		}
		return SUCCESS;
	}
	public void setHotService(HotService hotService) {
		this.hotService = hotService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public void setHot(Hot hot) {
		this.hot = hot;
	}
	public void setHlist(List<Hot> hlist) {
		this.hlist = hlist;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getPlist() {
		return plist;
	}

	
}
