package com.lcx.entity;

import java.io.Serializable;
/**
 * 
 * @author lcx
 *
 */
public class ProductType implements Serializable{
	private String tid;
	private String tname;
	//private String fathertid;设置品牌类
	
	
	public String getTid() {
		return tid;
	}
	public ProductType() {
		super();
	}
	public ProductType(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
}
