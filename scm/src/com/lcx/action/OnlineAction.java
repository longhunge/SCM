package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.components.Date;

import com.lcx.entity.Brand;
import com.lcx.entity.ProductType;
import com.lcx.service.BrandService;
import com.lcx.service.ProductTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class OnlineAction extends ActionSupport {
	@Resource
	private BrandService brandService;
	@Resource
	private ProductTypeService productTypeService;
	private List<Brand> blist;
	private ProductType productType;
	
	public String checktype() {
		blist = brandService.findlistbytid(productType.getTid());
		productType=productTypeService.findbyid(productType.getTid());
		if(blist==null){
			Brand brand =new Brand();
			brand.setBname("该分类下尚未添加品牌");
			blist.add(brand);
		}
		return SUCCESS;	
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public List<Brand> getBlist() {
		return blist;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
		
}
