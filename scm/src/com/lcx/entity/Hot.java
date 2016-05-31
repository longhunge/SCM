package com.lcx.entity;

import java.io.Serializable;
/**
 * 热门推荐
 * @author lcx
 *
 */
public class Hot implements Serializable {
	private Integer hotid;
	private String hot1;
	
	
	
	public Hot() {
		super();
	}
	public Hot(Integer hotid, String hot1) {
		super();
		this.hotid = hotid;
		this.hot1 = hot1;
	}





	public String getHot1() {
		return hot1;
	}





	public void setHot1(String hot1) {
		this.hot1 = hot1;
	}





	public void setHotid(Integer hotid) {
		this.hotid = hotid;
	}





	public Integer getHotid() {
		return hotid;
	}



	
}
