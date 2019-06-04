package com.dljy;

public class Users {
	private int id;
	private String name;
	private String books;
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
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}
	public Users(String name, String books) {
		super();
		this.name = name;
		this.books = books;
	}
	public Users() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
