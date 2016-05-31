package com.lcx.entity;

import java.io.Serializable;
/**
 * 订单
 * @author lcx
 *
 */
public class Orders implements Serializable{
	private String oid;
	private String pid;
	private String uid;
	private String lid;    //物流公司
	private String lstatus;//物流状态：发货中，已收货，运输中，退货中
	private String ostatus;//订单状态：待付款，已付款，待收货
	private String pname;
	private String address;
	private String phone;
	
	public Orders() {
		super();
	}
	
	public Orders(String oid, String pid, String uid, String lid,
			String lstatus, String ostatus, String pname, String address,
			String phone) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.uid = uid;
		this.lid = lid;
		this.lstatus = lstatus;
		this.ostatus = ostatus;
		this.pname = pname;
		this.address = address;
		this.phone = phone;
	}





	public String getLid() {
		return lid;
	}


	public void setLid(String lid) {
		this.lid = lid;
	}


	public String getLstatus() {
		return lstatus;
	}


	public void setLstatus(String lstatus) {
		this.lstatus = lstatus;
	}


	public String getOstatus() {
		return ostatus;
	}


	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}


	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
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

	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 

}
