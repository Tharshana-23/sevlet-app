package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("Init method");
	}

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		out.println("<html><head></head><body><h1>Hello World</h1></body></html>");
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = resp.getWriter();
//		out.println("<html><head></head><body><h1>Hello World From GET</h1></body></html>");
		resp.sendRedirect(req.getContextPath()+"/home.jsp");
	}

	public void destroy() {
		System.out.println("Destroy method");
	}
	
	

}
