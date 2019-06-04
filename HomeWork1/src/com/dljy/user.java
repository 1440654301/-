package com.dljy;

public class user {
private int id;
private String username;
private String password;
private String je;
private String kye;
private String kind;
public user(String username, String password, String je, String kye, String kind) {
	super();
	this.username = username;
	this.password = password;
	this.je = je;
	this.kye = kye;
	this.kind = kind;
}
/**
 * @return the je
 */
public String getJe() {
	return je;
}
/**
 * @param je the je to set
 */
public void setJe(String je) {
	this.je = je;
}
/**
 * @return the kye
 */
public String getKye() {
	return kye;
}
/**
 * @param kye the kye to set
 */
public void setKye(String kye) {
	this.kye = kye;
}
/**
 * @return the kind
 */
public String getKind() {
	return kind;
}
/**
 * @param kind the kind to set
 */
public void setKind(String kind) {
	this.kind = kind;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
public user(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */


public user(int id, String username, String password, String je, String kye, String kind) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.je = je;
	this.kye = kye;
	this.kind = kind;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "user [id=" + id + ", username=" + username + ", password=" + password + ", je=" + je + ", kye=" + kye
			+ ", kind=" + kind + "]";
}

}
