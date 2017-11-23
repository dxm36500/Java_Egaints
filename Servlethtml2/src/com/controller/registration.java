package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter com=response.getWriter();
		String uname=request.getParameter("uname");
		String upassword=request.getParameter("upwd");
		String uemail=request.getParameter("uemail");
		String uphone=request.getParameter("uphone");
		databaseprogram dp=new databaseprogram();
		String result=dp.checkregistration(uname,upassword,uemail,uphone);
		com.println("<html><body bgcolor='lightblue'><b>");
		com.println("<center><font color='red' size='10'>");
		if(result.equals("Success"))
		{
			com.println("Registration Success");
		}
		if(result.equals("Failure"))
		{
			com.println("Login Failed");
		}
		if(result.equals("Exists"))
		{
			com.println("User Already Exists");
		}
		com.println("</b></font></center></body></html>");
		
	}

}
