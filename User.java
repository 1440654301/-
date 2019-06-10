package dljy.pojo;

public class User {
	private int userid;
	private String username;
	private String userpassword;
	private String usertype;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public User(String username, String userpassword, String usertype) {
		super();
		this.username = username;
		this.userpassword = userpassword;
		this.usertype = usertype;
	}
	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
