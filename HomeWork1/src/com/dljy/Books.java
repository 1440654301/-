package com.dljy;

public class Books {
	private int id;
	private String name;
	private String writer;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Books(String name, String writer, String type) {
		super();
		this.name = name;
		this.writer = writer;
		this.type = type;
	}
	public Books() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
