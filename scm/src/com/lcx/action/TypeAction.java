package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.ProductType;
import com.lcx.service.ProductTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TypeAction extends ActionSupport {
	private ProductType ttype;
	private List<ProductType> tlist;
	ActionContext ctx = ActionContext.getContext();
	@Resource
	private ProductTypeService productTypeService;

	// 跳转到新增
	public String taddui() {

		return "taddui";
	}

	//添加类别
	public String tadd() throws Exception{
		if(ttype!=null){
			//ttype.setTname(new String(ttype.getTname().getBytes("ISO-8859-1"),"UTF-8"));
			productTypeService.save(ttype);
		}
		return "list";
	}
	//类别列表
	public String tlistui(){
		tlist=productTypeService.findall();
		return "tlistui";
	}
	
	public String tdelete(){
		productTypeService.delete(ttype.getTid());
		return "list";	
	}
	//编辑页面
	public String teditui(){
		ttype=productTypeService.findbyid(ttype.getTid());
		ctx.put("ttype", ttype);
		return "teditui";
	}
	//编辑功能
	public String tedit() throws Exception{
		ttype.setTname(new String(ttype.getTname().getBytes("ISO-8859-1"),"UTF-8"));
		productTypeService.update(ttype);
		return "list";
	}
	
	
	
	
	
	/********************************************
	 * 分割geter和seter方法                                                           *
	 * @return                                  *
	 ********************************************/
	
	public List<ProductType> getTlist() {
		return tlist;
	}
	public ProductType getTtype() {
		return ttype;
	}
	public void setTtype(ProductType ttype) {
		this.ttype = ttype;
	}
	public void setTlist(List<ProductType> tlist) {
		this.tlist = tlist;
	}
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	
	
	
}
