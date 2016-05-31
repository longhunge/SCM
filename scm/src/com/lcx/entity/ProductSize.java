package com.lcx.entity;

import java.io.Serializable;

/**
 * 产品型号大小设置
 * @author lcx
 *
 */
public class ProductSize implements Serializable{
	private String sid;
	private String pid;
	private String psize;
	private Integer pnum;
	
	

	public ProductSize() {
		super();
	}

	

	public ProductSize(String sid, String pid, String psize, Integer pnum) {
		super();
		this.sid = sid;
		this.pid = pid;
		this.psize = psize;
		this.pnum = pnum;
	}



	public Integer getPnum() {
		return pnum;
	}



	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}



	public String getPsize() {
		return psize;
	}

	public void setPsize(String psize) {
		this.psize = psize;
	}

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	
}
