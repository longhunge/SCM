package com.lcx.entity;

import java.io.Serializable;
/**
 * 商品推荐设置
 * @author lcx
 *
 */
public class Recommended implements Serializable{
	String rid;//推荐id
	String pid;//商品id
	String recid;//推荐位置id
	
	public Recommended() {
		super();
	}
	public Recommended(String rid, String pid, String recid) {
		super();
		this.rid = rid;
		this.pid = pid;
		this.recid = recid;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getRecid() {
		return recid;
	}
	public void setRecid(String recid) {
		this.recid = recid;
	}
	
}
