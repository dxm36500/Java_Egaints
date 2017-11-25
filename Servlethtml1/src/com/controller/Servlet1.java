package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter com=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String gender=request.getParameter("sgender");
		String[] squal=request.getParameterValues("squal");
		String qual="";
		for(int i=0;i<squal.length;i++)
		{
			qual=squal[i]+"    " +qual;
		}
		String[] interests=request.getParameterValues("interested");
		String interest="";
		for(int i=0;i<interests.length;i++)
		{
			interest=interests[i]+"   "+interest;
		}
		String comments=request.getParameter("comments");
		com.println("<html><body><h1 style=color:RED> Student Details</h1>");
		com.println("<table><tr><td>First Name</td><td>"+fname+"</td></tr>");
		com.println("<tr><td>Last Name</td><td>"+lname+"</td></tr>");
		com.println("<tr><td>Address</td><td>"+address+"</td></tr>");
		com.println("<tr><td>Gender</td><td>"+gender+"</td></tr>");
		com.println("<tr><td>Qualifications</td><td>"+qual+"</td></tr>");
		com.println("<tr><td>Interests</td><td>"+interest+"</td></tr>");
		com.println("<tr><td>Comments</td><td>"+comments+"</td></tr>");
		com.println("</table></body></html>");		
	}

}
