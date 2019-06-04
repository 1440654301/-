package com.dljy;

public class Type {
	private int bid;
	private String type;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Type(String type) {
		super();
		this.type = type;
	}
	public Type() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
