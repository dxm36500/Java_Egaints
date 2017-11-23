	import java.sql.*;
	import java.io.*;
public class jdbc4 {

		public static void main(String args[]) throws Exception
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
			Statement st=Con.createStatement();
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Table Name:" );
			String tname=br.readLine();
			String query="Create table "+tname + "(eno int,ename varchar(10),esal int)";
			st.executeUpdate(query);
			System.out.println("Table Created" );
			Con.close();
			
			
		}
	}


