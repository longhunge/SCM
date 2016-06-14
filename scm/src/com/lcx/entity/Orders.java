package com.lcx.entity;

import java.io.Serializable;
import java.util.List;
/**
 * 订单
 * @author lcx
 *
 */
public class Orders implements Serializable{
	private String oid; //订单id
	private String pid; //产品
	private String uid; //用户
	private String lid; //物流公司
	private String lstatus; //物流状态：发货中，已收货，运输中，退货中
	private String ostatus; //订单状态：待付款，已付款，待收货
	private String pname; //产品名称
	private Integer pnum; //产品数量
	private String uname; //用户
	private String address;
	private String phone;
	private String sid;
	private String liuyan; //留言
	private Double pay;
	
	public Orders() {
		super();
	}
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String listui(){
		
		return "list";
	}
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Double getPay() {
		return pay;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}

	public String getLiuyan() {
		return liuyan;
	}

	public void setLiuyan(String liuyan) {
		this.liuyan = liuyan;
	}


	public Integer getPnum() {
		return pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
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
