package com.dljy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dljy.dao.Userdao;



@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Userdao udao=new Userdao();
    public UserServlet() {
        super();
         }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String flag=request.getParameter("flag");
		switch (flag) {
		case "login":
			login(request,response);
			break;
		case "add":
			add(request,response);
			break;
		case "findAll":
			findAll(request,response);
			break;
		case "delete":
			delete(request,response);
			break;
		case "yupdate":
			yupdate(request,response);
			break;
		case "update":
			update(request,response);
			break;
		case "findByName":
			findByName(request,response);
			break;
		default:
			break;
		}
	}
	private void findByName(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		String name = request.getParameter("name");
		List<user> chs=udao.findByName(name);
		request.setAttribute("ch", chs);
		try {
			request.getRequestDispatcher("hysy.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id").trim();
		System.out.println(id);
		int id1=Integer.parseInt(id);
		System.out.println(id1);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String je=request.getParameter("je");
		String kye=request.getParameter("kye");
		String kind=request.getParameter("kind");
		user user=new user(id1,username,password,je,kye,kind);
		udao.update(user);
		System.out.println(user);
		findAll(request, response);
	}

	private void yupdate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		System.out.println(id);
		  user u = udao.findById(Integer.parseInt(id));
		  System.out.println(u);
		  request.setAttribute("ch", u);
		  try {
				request.getRequestDispatcher("hyxg.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
	    udao.delete(Integer.parseInt(id));
		findAll(request, response);
	}

	private void add(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String password=request.getParameter("password");
		String username=request.getParameter("username");
		String je=request.getParameter("je");
		String kye=request.getParameter("kye");
		String kind=request.getParameter("kind");
		user user=new user();
		user.setPassword(password);
		user.setUsername(username);
		user.setJe(je);
		user.setKye(kye);
		user.setKind(kind);
		udao.add(user);		
		findAll(request, response);
	}
	private void findAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List<user> ch=udao.findByPager(request);
		request.setAttribute("ch",ch);
		try {
			request.getRequestDispatcher("hysy.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		user user=new user(username,password);
		user u=udao.findByC(user);
		if(u!=null){
			try {
				request.getSession().setAttribute("user",u);
				request.getRequestDispatcher("SY.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
