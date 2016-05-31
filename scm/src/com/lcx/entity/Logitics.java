package com.lcx.entity;

import java.io.Serializable;
/**
 * 物流公司
 * @author lcx
 *
 */
public class Logitics implements Serializable {
	private String lid;	//物流公司id
	private String lname;// 物流公司名称
	
	public Logitics() {
		super();
	}
	public Logitics(String lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
