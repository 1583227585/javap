package com.byzx.java.vo;

import java.util.Date;

public class Orders {
	
	private int oid;
	private int userId;
	private String number;
	private Date createtime;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime + "]";
	}
	
	
}
