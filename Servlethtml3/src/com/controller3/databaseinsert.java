package com.controller3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseinsert {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null; 
	public databaseinsert() {
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
	public void insertdata(String name,String email,String password)
	{ 
		try {
		st.executeUpdate("insert into jquery_table values('"+name+"','"+email+"','"+password+"')");
	
	}
	catch(Exception e)
	 {
		
		 e.printStackTrace();
		 
	 }
	

	
	}
}

