package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int sno=Integer.parseInt(request.getParameter("sno"));
		String sname=request.getParameter("sname");
		String saddress=request.getParameter("saddress");
		
		CheckDatabaseClass db=new CheckDatabaseClass();
		String output=db.updatedatabase(sno,sname,saddress);
		out.println("<html><body>");
		if(output.equals("Success"))
				{
		out.println("<h1><b>Student Details Updated Successfully</b></h1>");
				}
		else
		{
			out.println("<h1><b>Error Occurred</b></h1>");
		}
		out.print("</body></html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
