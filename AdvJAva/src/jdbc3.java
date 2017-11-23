import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc3 {
	

	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
		Statement st=Con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		
		while(rs.next())
		{
			
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		}
		Con.close();
	}
}

