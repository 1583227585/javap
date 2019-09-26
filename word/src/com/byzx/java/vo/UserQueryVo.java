package com.byzx.java.vo;

import java.util.Date;

public class UserQueryVo extends Orders {

	private int uid;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserQueryVo [uid=" + uid + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
}
