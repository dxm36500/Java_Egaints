import java.sql.*;
import java.io.*;

public class Jdbc1 {

	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
		Statement st=Con.createStatement();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Table Name:" );
		String tname=br.readLine();
		String query="Create table "+tname + "(eno number,ename varchar2(10),esal number)";
		st.executeUpdate(query);
		System.out.println("Table Created" );
		Con.close();
		
		
	}
}
