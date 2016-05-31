package test;

import java.io.Serializable;

public class TestUser implements Serializable {
	private String tid;
	private String name;
	private String password;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TestUser(String tid, String name, String password) {
		super();
		this.tid = tid;
		this.name = name;
		this.password = password;
	}
	public TestUser() {
		super();
	}
	public TestUser(String name) {
		super();
		this.name = name;
	}
	public TestUser(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}
