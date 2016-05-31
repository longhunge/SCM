package com.lcx.entity;
/**
 * 物流管理人员
 */
import java.io.Serializable;

public class WuliuMana implements Serializable {
	private String wid;
	private String lid;
	private String waccount;
	private String wpwd;
	private String wname;
	
	
	
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getWaccount() {
		return waccount;
	}
	public void setWaccount(String waccount) {
		this.waccount = waccount;
	}
	public String getWpwd() {
		return wpwd;
	}
	public void setWpwd(String wpwd) {
		this.wpwd = wpwd;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	
	
}
