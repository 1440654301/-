package com.dljy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dljy.dao.BooksDAO;

@WebServlet("/BooksServlet")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BooksDAO booksDAO=new BooksDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String flag = request.getParameter("flag");
		switch (flag) {
		case "findAll":
			findAll(request,response);
			break;
		case "add":
			add(request,response);
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
		List<Books> books=booksDAO.findByName(name);
		request.setAttribute("books", books);
		try {
			request.getRequestDispatcher("sjsy.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
	private void update(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		String id=request.getParameter("id");
		String name = request.getParameter("name");
		String writer = request.getParameter("writer");
		String type = request.getParameter("type");
		Books book = new Books(name,writer,type);
		booksDAO.update(book);
		findAll(request, response);
	}
	private void yupdate(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		String id=request.getParameter("id");
		Books book=booksDAO.findById(Integer.parseInt(id));
		request.setAttribute("updatebook", book);
		try {
			request.getRequestDispatcher("sjxg.jsp").forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
	private void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		String id=request.getParameter("id");
		booksDAO.delete(Integer.parseInt(id));
		findAll(request, response);
	}
	private void add(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		String name = request.getParameter("name");
		String writer = request.getParameter("writer");
		String type = request.getParameter("type");
		Books book = new Books(name,writer,type);
		booksDAO.insert(book);
		findAll(request, response);
	}
	private void findAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO 自动生成的方法存根
		List<Books> list=booksDAO.findAll();
		request.setAttribute("books", list);
			try {
				request.getRequestDispatcher("sjsy.jsp").forward(request,response);
			} catch (ServletException | IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} 
	}

}
