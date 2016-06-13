package com.lcx.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class Product implements Serializable{
	private String pid;
	private String pname;
	private double price;
	private String intrduce; //介绍
	private String bid;      //品牌
	private String tid;
	private String img1;
	private String img2;
	private String img3;
	private String img4;
	private String img5;
	
	
	public Product() {
		super();
	}
	
	public Product(String pid, String pname, double price, String intrduce,
			String bid, String tid, String img1, String img2, String img3,
			String img4, String img5) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.intrduce = intrduce;
		this.bid = bid;
		this.tid = tid;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
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

	public String getIntrduce() {
		return intrduce;
	}
	public void setIntrduce(String intrduce) {
		this.intrduce = intrduce;
	}

	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getImg4() {
		return img4;
	}
	public void setImg4(String img4) {
		this.img4 = img4;
	}
	public String getImg5() {
		return img5;
	}
	public void setImg5(String img5) {
		this.img5 = img5;
	}
	
	

}
