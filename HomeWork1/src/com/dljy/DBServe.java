package com.dljy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBServe {

private static final String driver="com.mysql.jdbc.Driver";
private static final String url="jdbc:mysql://localhost:3306/test";
private static final String username="root";
private static final String password="Yh950609";
private static Connection conne=null;
private static Statement state=null;
public static Connection getConnection(){
	try {
		Class.forName(driver);
		try {
			conne=DriverManager.getConnection(url, username ,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conne;
	
}
public static Statement getStatement(){
	try {
		state=getConnection().createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return state;
	
}
}
