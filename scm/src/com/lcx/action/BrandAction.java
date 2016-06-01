package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Brand;
import com.lcx.entity.ProductType;
import com.lcx.service.BrandService;
import com.lcx.service.ProductTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BrandAction extends ActionSupport {
	
	private Brand brand;
	private List<Brand> blist;
	private List<ProductType> tlist;
	private ProductType ptype;
	ActionContext ctx = ActionContext.getContext();
	@Resource
	private BrandService brandService;
	@Resource
	private ProductTypeService productTypeService;
	
		// 跳转到新增
		public String baddui() {
		tlist = productTypeService.findall();
		ctx.put("tlist", tlist);
		return "baddui";
		}

		//添加类别
		public String badd() throws Exception{
			if(brand!=null){
				//ttype.setTname(new String(ttype.getTname().getBytes("ISO-8859-1"),"UTF-8"));
				brandService.save(brand);
			}
			return "list";
		}
		//类别列表
		public String blistui(){
			tlist=productTypeService.findall();
			ctx.put("tlist", tlist);
			blist=brandService.findall();
			ctx.put("blist", blist);
			return "blistui";
		}
		
		public String bdelete(){
			brandService.delete(brand.getBid());
			return "list";	
		}
		//编辑页面
		public String beditui(){
			tlist=productTypeService.findall();
			brand=brandService.findbyid(brand.getBid());
			return "beditui";
		}
		//编辑功能
		public String bedit() throws Exception{
			brand.setBname(new String(brand.getBname().getBytes("ISO-8859-1"),"UTF-8"));
			brandService.update(brand);
			return "list";
		}
	
	/***************************************
	 * seter 和 geter
	 **************************************/
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public List<Brand> getBlist() {
		return blist;
	}
	public void setBlist(List<Brand> blist) {
		this.blist = blist;
	}
	public BrandService getBrandService() {
		return brandService;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	public List<ProductType> getTlist() {
		return tlist;
	}

	public void setTlist(List<ProductType> tlist) {
		this.tlist = tlist;
	}

	public ProductType getPtype() {
		return ptype;
	}

	public void setPtype(ProductType ptype) {
		this.ptype = ptype;
	}

	
	

	
}
