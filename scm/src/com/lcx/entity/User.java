package com.lcx.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class User implements Serializable {
	String u_id;
	int u_rank; // 等级
	String u_privilege;// 用户权限
	String headImg; // 头像
	String u_account;// 用户
	String u_name;// 用户名
	String u_pwd;// 密码
	String u_phone;// 手机号
	String u_email;// 邮箱号
	String u_sex;// 性别
	Date u_birthday;// 生日
	String u_status;// 状态
	Double money;
	String lid;
	
	
	
	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public User(String u_id, int u_rank, String u_privilege, String headImg,
			String u_account, String u_name, String u_pwd, String u_phone,
			String u_email, String u_sex, Date u_birthday, String u_status) {
		super();
		this.u_id = u_id;
		this.u_rank = u_rank;
		this.u_privilege = u_privilege;
		this.headImg = headImg;
		this.u_account = u_account;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_phone = u_phone;
		this.u_email = u_email;
		this.u_sex = u_sex;
		this.u_birthday = u_birthday;
		this.u_status = u_status;
	}

	public Date getU_birthday() {
		return u_birthday;
	}

	public void setU_birthday(Date u_birthday) {
		this.u_birthday = u_birthday;
	}

	public String getU_privilege() {
		return u_privilege;
	}

	public void setU_privilege(String u_privilege) {
		this.u_privilege = u_privilege;
	}

	public String getU_status() {
		return u_status;
	}

	public void setU_status(String u_status) {
		this.u_status = u_status;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public int getU_rank() {
		return u_rank;
	}

	public void setU_rank(int u_rank) {
		this.u_rank = u_rank;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}

	public String getU_account() {
		return u_account;
	}

	public void setU_account(String u_account) {
		this.u_account = u_account;
	}

	public User() {
		super();
	}

}
