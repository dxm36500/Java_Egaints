package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletprogram
 */
@WebServlet("/Servletprogram")
public class Servletprogram extends HttpServlet {
	private static final long serialVersionUID = 1L;

private List<String> usernamesList;
	
	
	public void init(ServletConfig config) throws ServletException {
		
		usernamesList = new ArrayList<String>();
		
		usernamesList.add("hary");
		usernamesList.add("raj");
		usernamesList.add("kumar");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("****validateUnameServlet()****");
		
		//reading the input data i.e. username
		String username1 = request.getParameter("username");
		
		
		//printwriter helps the servlet to send the response back to the client
		PrintWriter out = response.getWriter();
		
		
		if(usernamesList.contains(username1)){
			out.println("<font color='red'>Username Not Available</font>");			
		}else{
			out.println("<font color='green'>Username Available</font>");
		}
		
	}

}
