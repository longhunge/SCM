package com.lcx.action;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.lcx.entity.Logitics;
import com.lcx.entity.User;
import com.lcx.service.LogiticsService;
import com.lcx.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	@Resource
	private UserService userService;
	@Resource
	LogiticsService logiticsService;
	
	private List<Logitics> llist;
	private List<User> list;
	private User user;
	private String[] selectRaw;
	private File importExcel;	
	private String importExcelContentType;
	private String importExcelFileName;	
	private File headImg;
	private String headImgContentType;
	private String headImgFileName;
	ActionContext ctx = ActionContext.getContext();
	
	public String addtologitics(){
		user = userService.findbyid(user.getU_id()); 
		llist = logiticsService.findall();
		return "addtologitics";
	}
	public String ladd(){
		User u = new User();
		u = userService.findbyid(user.getU_id());
		u.setLid(user.getLid());
		u.setU_privilege("物流管理");
		userService.update(u);
		return"redirecter";
	}
	public String login(){
		User loginUser=userService.findUser(user);
		if(user!=null){
			ctx.getSession().put("user", loginUser);
		}
		return "login";
	}
	// 列表
	public String listui() {
		list=userService.findall();
		if(list==null){
			System.out.println("list为空");
		}else{
			System.out.println(list.toString());
		}
		ctx.put("list", list);
		return "listui";
	}

	// 跳转到新增
	public String addui() {
		
		return "addui";
	}

	public String add() {		
		if(user!=null){
			if(headImg!=null){
				//保存头像到指定路径upload/user
				String filepath = ServletActionContext.getServletContext().getRealPath("upload/head");
				String filename = UUID.randomUUID().toString()+headImgFileName.substring(headImgFileName.lastIndexOf("."));
				try {
					FileUtils.copyFile(headImg, new File(filepath,filename));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				user.setHeadImg("upload/head/"+filename);
			}
			
			try {
				//编码转换
				user.setU_privilege(new String(user.getU_privilege().getBytes("ISO-8859-1"),"UTF-8"));
				user.setU_sex(new String(new String(user.getU_sex().getBytes("ISO-8859-1"),"UTF-8")));
				//new String(user.getU_name().getBytes("ISO-8859-1"),"UTF-8")
				user.setU_name(new String(user.getU_name().getBytes("ISO-8859-1"),"UTF-8"));
				user.setU_account(new String(user.getU_account().getBytes("ISO-8859-1"),"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ctx.put("msg", "新增");
			userService.save(user);
		}
		return "redirecter";
	}
	
	public String redirect(){
		
		return "redirect";		
	}
	// 跳转到修改
	public String editui() {
		if(user.getU_id()!=null){
			user=userService.findbyid(user.getU_id());
		}
		ctx.put("user", user);
		return "editui";
	}
	
	//修改
	public String edit() {
		try {
			//编码转换
			user.setU_privilege(new String(user.getU_privilege().getBytes("ISO-8859-1"),"UTF-8"));
			user.setU_sex(new String(new String(user.getU_sex().getBytes("ISO-8859-1"),"UTF-8")));
			user.setU_name(new String(user.getU_name().getBytes("ISO-8859-1"),"UTF-8"));
			user.setU_account(new String(user.getU_account().getBytes("ISO-8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		userService.update(user);
		return "redirecter";
	}

	// 删除
	public String delete() {
		if(user!=null && user.getU_id()!=null){
			userService.delete(user.getU_id());
		}
		return "redirecter";
	}

	//批量 删除
	public String deleteSelected() {
		if(selectRaw!=null){
			for(String id : selectRaw){
				userService.delete(id);
			}
		}
		return "redirecter";
	}
	//导入Excel
	public String importExcel(){
		if(importExcel != null){
			System.out.println("here run!");
			//根据用户名判断是否是03或者07Excel文件
			if(importExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				userService.importExcel(importExcel,importExcelFileName);
				return "redirecter";
			}
		}
		return "redirecter";
	}
	//导出Excel
	public void exportExcel() {

		try {
			// 查找用户列表
			list = userService.findall();
			// 导出
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("application/x-excel");

			response.setHeader("Content-Disposition", "attachment;filename="+ new String("用户列表.xls".getBytes(), "ISO-8859-1"));

			ServletOutputStream out = response.getOutputStream();
			userService.exportExcel(list,out);
			if(out!=null){
				out.close();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public File getImportExcel() {
		
		return importExcel;
	}
	
	public void setImportExcel(File importExcel) {
		this.importExcel = importExcel;
	}

	public String getImportExcelContentType() {
		return importExcelContentType;
	}

	public void setImportExcelContentType(String importExcelContentType) {
		this.importExcelContentType = importExcelContentType;
	}

	public String getImportExcelFileName() {
		return importExcelFileName;
	}

	public void setImportExcelFileName(String importExcelFileName) {
		this.importExcelFileName = importExcelFileName;
	}
	public String getHeadImgContentType() {
		return headImgContentType;
	}

	public void setHeadImgContentType(String headImgContentType) {
		this.headImgContentType = headImgContentType;
	}

	public String getHeadImgFileName() {
		return headImgFileName;
	}

	public void setHeadImgFileName(String headImgFileName) {
		this.headImgFileName = headImgFileName;
	}
	public String[] getSelectRaw() {
		return selectRaw;
	}

	public void setSelectRaw(String[] selectRaw) {
		this.selectRaw = selectRaw;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public File getHeadImg() {
		return headImg;
	}

	public void setHeadImg(File headImg) {
		this.headImg = headImg;
	}
	public List<Logitics> getLlist() {
		return llist;
	}
	public void setLlist(List<Logitics> llist) {
		this.llist = llist;
	}
	public void setLogiticsService(LogiticsService logiticsService) {
		this.logiticsService = logiticsService;
	}

}
