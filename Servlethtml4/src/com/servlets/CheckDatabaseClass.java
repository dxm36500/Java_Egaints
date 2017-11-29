package com.servlets;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckDatabaseClass {
		  Connection con=null;
		  Statement st=null;
		  ResultSet rs=null;
		  Student student=null;	  
		  public CheckDatabaseClass()
		  {		
			 try {
				 	Class.forName("oracle.jdbc.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
					st=con.createStatement();
							
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
				 
			 }
		  }
		 
		 public Student checkrecord(int sno) 
		 {		
			 try
		 {
				rs=st.executeQuery("select * from student where student_number="+sno);
		 		while(rs.next())
		 		{
		 			student=new Student();
		 			student.setStudent_number(rs.getInt(1));
		 			student.setStudent_name(rs.getString(2));
		 			student.setStudent_address(rs.getString(3));
		 			
		 		}
		 		
		 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return student;
			 
}
		 public String updatedatabase(int sno,String sname,String saddress) throws SQLException
		 {
			 String sql="update student set student_name='"+sname+"',student_address='"
					 	 +saddress+"'where student_number="+sno;
			 int count=st.executeUpdate(sql);
			 if(count==1)
			 {
				 return "Success";
			 }
			 else
			 {
				 return "Failure";
			 }
		 }
		 
}