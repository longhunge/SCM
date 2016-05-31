package com.lcx.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 保存物流订单的更新信息
 * @author lcx
 *
 */
public class WuliuUpdate implements Serializable{
	private String woid;
	private Date wudate;
	private String arrive;
	
	
	
	
	public WuliuUpdate() {
		super();
	}
	public WuliuUpdate(String woid, Date wudate, String arrive) {
		super();
		this.woid = woid;
		this.wudate = wudate;
		this.arrive = arrive;
	}
	public String getWoid() {
		return woid;
	}
	public void setWoid(String woid) {
		this.woid = woid;
	}
	public Date getWudate() {
		return wudate;
	}
	public void setWudate(Date wudate) {
		this.wudate = wudate;
	}
	public String getArrive() {
		return arrive;
	}
	public void setArrive(String arrive) {
		this.arrive = arrive;
	}
	
}
