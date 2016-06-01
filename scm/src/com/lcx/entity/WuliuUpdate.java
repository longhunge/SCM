package com.lcx.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 保存物流订单的更新信息
 * @author lcx
 *
 */
public class WuliuUpdate implements Serializable{
	private String wuid;//自己的主键
	private String woid;//物流订单id
	private String wid; //物流管理员id
	private Date wudate;//物流更新时间
	private String arrive;//物流更新地点
	
	
	
	
	public WuliuUpdate() {
		super();
	}
	


	public String getWuid() {
		return wuid;
	}



	public void setWuid(String wuid) {
		this.wuid = wuid;
	}



	public String getWid() {
		return wid;
	}



	public void setWid(String wid) {
		this.wid = wid;
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
