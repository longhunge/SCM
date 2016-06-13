package com.lcx.entity;

import java.io.Serializable;
/*
 * 用户地址管理
 */
public class Address implements Serializable {
	private String aid;
	private String uid;
	private String uaddress;
	private String uname;
	private String uphone;
		
	
	public Address() {
		super();
	}
	public Address(String aid, String uid, String uaddress, String uname,
			String uphone) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.uaddress = uaddress;
		this.uname = uname;
		this.uphone = uphone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	
}
