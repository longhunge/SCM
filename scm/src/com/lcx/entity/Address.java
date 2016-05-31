package com.lcx.entity;

import java.io.Serializable;
/*
 * 用户地址管理
 */
public class Address implements Serializable {
	private String aid;
	private String uid;
	private String uaddress;
	
	
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
