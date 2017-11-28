package com.controller3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Storeserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter com=response.getWriter();
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String upassword=request.getParameter("password");
		
		databaseinsert dbi=new databaseinsert();
		dbi.insertdata(uname,uemail,upassword);
		com.println("<h1>Record Inserted In Database </h1>");
	}

}
