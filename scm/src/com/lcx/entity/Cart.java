package com.lcx.entity;

import java.io.Serializable;

public class Cart implements Serializable {
	private String cid; //购物车的id
	private String pid; //购物车的商品
	private String uid; //购物车所属的人
	private Integer cnumber;//购物车内商品数量
	private Double totle;//购物车的价格
	private String tid;
	private String bid;//
	private String sid;//款式
	
	

	
	public Cart(String cid, String pid, String uid, Integer cnumber,
			Double totle, String tid, String bid, String sid) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.uid = uid;
		this.cnumber = cnumber;
		this.totle = totle;
		this.tid = tid;
		this.bid = bid;
		this.sid = sid;
	}


	
	public String getSid() {
		return sid;
	}



	public void setSid(String sid) {
		this.sid = sid;
	}



	public Integer getCnumber() {
		return cnumber;
	}

	public void setCnumber(Integer cnumber) {
		this.cnumber = cnumber;
	}

	public Cart() {
		super();
	}

	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Double getTotle() {
		return totle;
	}
	public void setTotle(Double totle) {
		this.totle = totle;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	
}
