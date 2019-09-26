package com.byzx.java.vo;

public class OrderDetail {
	private int odid;
	private int ordersId;
	private int itensId;
	private int itemsNum;
	public int getOdid() {
		return odid;
	}
	public void setOdid(int odid) {
		this.odid = odid;
	}
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public int getItensId() {
		return itensId;
	}
	public void setItensId(int itensId) {
		this.itensId = itensId;
	}
	public int getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}
	@Override
	public String toString() {
		return "OrderDetail [odid=" + odid + ", ordersId=" + ordersId + ", itensId=" + itensId + ", itemsNum="
				+ itemsNum + "]";
	}
}
