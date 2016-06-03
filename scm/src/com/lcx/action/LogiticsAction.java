package com.lcx.action;

import java.util.List;

import javax.annotation.Resource;

import com.lcx.entity.Logitics;
import com.lcx.service.LogiticsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogiticsAction extends ActionSupport {

	@Resource
	LogiticsService logiticsService;
	private List<Logitics> list;
	private Logitics logitics;
	ActionContext ctx = ActionContext.getContext();
	public String listui() {
		list=logiticsService.findall();
		if(list==null){
			System.out.println("list为空");
		}else{
			System.out.println(list.toString());
		}

		return "listui";
	}

	public String addui(){
		
		return "addui";	
	}
	public String add(){
		logiticsService.save(logitics);
		return "list";	
	}
	public String delete(){
		logiticsService.delete(logitics.getLid());
		return "list";	
	}
	public String editui(){
		logitics=logiticsService.findbyid(logitics.getLid());
		ctx.put("logitics", logitics);
		return "editui";	
	}
	public String edit(){
		logiticsService.update(logitics);

		return "list";	
	}
	
	public Logitics getLogitics() {
		return logitics;
	}

	public void setLogitics(Logitics logitics) {
		this.logitics = logitics;
	}

	public void setLogiticsService(LogiticsService logiticsService) {
		this.logiticsService = logiticsService;
	}

	public void setList(List<Logitics> list) {
		this.list = list;
	}

	public List<Logitics> getList() {
		return list;
	}
	
	
	
	
	
}
