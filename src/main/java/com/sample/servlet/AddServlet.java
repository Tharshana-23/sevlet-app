package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int i = Integer.parseInt(request.getParameter("num1"));
	    int j = Integer.parseInt(request.getParameter("num2"));
	    int k = i+j;
	    PrintWriter out = response.getWriter();
	    out.println("Sum value from get : "+k);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int i = Integer.parseInt(request.getParameter("num1"));
	    int j = Integer.parseInt(request.getParameter("num2"));
	    int k = i+j;
	    PrintWriter out = response.getWriter();
	    out.println("Sum value from post : "+k);
	}


}
