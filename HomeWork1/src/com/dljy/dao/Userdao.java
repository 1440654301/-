package com.dljy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dljy.DBServe;
import com.dljy.Pager;
import com.dljy.user;


public class Userdao implements DBdao<user>{
	public List<user> findByPager(HttpServletRequest request){
		String url="UserServlet?flag=findAll";
		int size=5;
		int rows=findBySQL("select * from user").size();
		int cpage=request.getParameter("pager")==null?1:Integer.parseInt(request.getParameter("pager"));
		String pager=Pager.getPagerStr(url, size, rows, cpage, 1);
		request.setAttribute("pager",pager);
		String sql="select * from user limit "+(cpage-1)*size+" ,"+size+"";
		
		return findBySQL(sql);}
	@Override
	public void add(user t) {
		// TODO Auto-generated method stub
		String sql="insert into user values(null,'"+t.getUsername()+"','"+t.getPassword()+"','"+t.getJe()+"','"+t.getKye()+"','"+t.getKind()+"')";
	     Statement sta=DBServe.getStatement();
	     try {
			sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from user where id="+id;
		Statement stmt = DBServe.getStatement();
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(user t) {
		// TODO Auto-generated method stub
		String sql="update user set username='"+t.getUsername()+"',password='"+t.getPassword()+"',je='"+t.getJe()+"',kye='"+t.getKye()+"',kind='"+t.getKind()+"' where id='"+t.getId()+"'";
		System.out.println(sql);
		Statement stmt = DBServe.getStatement();
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public user findById(int id) {
		// TODO Auto-generated method stub

		String sql="select * from user where id="+id;
		List<user> users = findBySQL(sql);
		System.err.println(users);
		return users.size()>0?users.get(0):null;
	}

	@Override
	public user findByC(user t) {
		// TODO Auto-generated method stub
		String sql="select * from user where username='"+t.getUsername()+"' and password='"+t.getPassword()+"'";
		List<user> user=findBySQL(sql);
		return user.size()>0?user.get(0):null;
	}

	@Override
	public List<user> findAll() {
		// TODO Auto-generated method stub
String sql="select * from user";
		
		return findBySQL(sql);
	}

	@Override
	public List<user> findByName(String name) {
		// TODO Auto-generated method stub
		String sql="select * from user where username like '%"+name+"%' ";
		return findBySQL(sql);
	}

	@Override
	public List<user> findBySQL(String sql) {
		// TODO Auto-generated method stub
		List<user> yong=new ArrayList<>();
		Statement state= DBServe.getStatement();
		try {
			ResultSet rs=state.executeQuery(sql);
			while (rs.next()) {
				user y=new user();
				y.setId(rs.getInt(1));
				y.setUsername(rs.getString(2));
				y.setPassword(rs.getString(3));
				y.setJe(rs.getString(4));
				y.setKye(rs.getString(5));
				y.setKind(rs.getString(6));
				yong.add(y);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yong;
	}

}
