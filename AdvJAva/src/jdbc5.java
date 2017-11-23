import java.sql.*;
import java.io.*;

public class jdbc5 {

	public static void main(String[] args) {
		Connection Con=null;
		PreparedStatement pst=null;
		BufferedReader br=null;
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
		pst=Con.prepareStatement("update emp set salary=salary+500 where salary<?");
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Salary Range");
		Float salary=Float.parseFloat(br.readLine());
		pst.setFloat(1, salary);
		int rowcount=pst.executeUpdate();
		System.out.println(rowcount +"Rows Updated Successfully");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
finally {
	try {
		br.close();
		Con.close();
		pst.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
}
