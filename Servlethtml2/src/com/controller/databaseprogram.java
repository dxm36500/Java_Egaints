package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseprogram {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null; 
	String result="";
	
 public databaseprogram()
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
 
 public String checklogin(String uname,String upwrd) 
 {		
	 try
 {
		rs=st.executeQuery("select * from registered_Users where UNAME='"+uname+"'and UPASSWORD='"+upwrd+"'");
 		boolean b=rs.next();
 		if(b==true)
 		{
 			result="Success";
 		}
 		else
 		{
 			result="Failure";
 		}
 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return result;
 }
 
 public String checkregistration(String uname,String password,String email,String phone)
 {
	 try {
		 
		 rs=st.executeQuery("select * from registered_Users where UNAME='"+uname+"'");
		boolean b=rs.next();
		if(b==true)
		{
			result="Exists";
		}
		if(b==false)
		{
			st.executeUpdate("insert into registered_Users values('"+uname+"','"+password+"','"+email+"','"+phone+"')");
			result="Success";
		}

		 
	 }catch(Exception e)
	 {
		 result="Failure";
		 e.printStackTrace();
		 
	 }
	 return result;
 }
}
