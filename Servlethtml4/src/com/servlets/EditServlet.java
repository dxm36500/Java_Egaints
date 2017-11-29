package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter com=response.getWriter();
		 int sno=Integer.parseInt(request.getParameter("sid"));
		 CheckDatabaseClass dbc=new CheckDatabaseClass();
		 Student student=dbc.checkrecord(sno);
		 com.println("<html><body>");
		 if(student==null)
		 {
			 com.println("<h1 style=color:red><b> Student Doesn't Exists</b></h1>");
			 com.println("<a href='./updateform.html'> Update Form </a>");
			 
		 }
		 else
		 {
			 com.println("<form method='POST' action='./update' >");
			 com.println("<h1>Edit Form</h1><br>");	
			 com.println("<table><tr><td>Student Number:</td><td>"+sno+"</td>");
			 com.println("<td><input type='hidden' name='sno' value='"+sno+"'/></td></tr>");
			 com.println("<tr><td>Student Name:</td><td><input type='text' name='sname' value='"+student.getStudent_name()+"'/>");
			 com.println("<tr><td>Student Address:</td><td><input type='text' name='saddress' value='"+student.getStudent_address()+"'/>");
			 com.println("<br><br><input type='submit' value='Update Detail'");
			 com.println("</form>");
		 }
		 
		 com.println("</body></html>");
	}

}
