package com.lcx.entity;

import java.io.Serializable;
/**
 * 品牌设置
 * @author lcx
 *
 */
public class Brand implements Serializable{
	private String bid; //品牌
	private String tid; //分类id producttype
	private String bname; //品牌名称
	
	
	public Brand() {
		super();
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Brand(String bid, String tid, String bname) {
		super();
		this.bid = bid;
		this.tid = tid;
		this.bname = bname;
	}
	
}
