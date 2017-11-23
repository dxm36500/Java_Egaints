package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
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
		databaseprogram dp=new databaseprogram();
		String result=dp.checklogin(uname,upassword);
		com.println("<html><body bgcolor='lightblue'><b>");
		com.println("<center><font color='red' size='10'>");
		if(result.equals("Success"))
		{
			com.println("Logged In Successfully");
		}
		if(result.equals("Failure"))
		{
			com.println("Login Failed");
		}
		com.println("</b></font></center></body></html>");
		
	}
	

}
