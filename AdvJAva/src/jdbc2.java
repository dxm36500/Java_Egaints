import java.sql.*;

public class jdbc2 
{
	public static void main(String args[]) throws Exception
	{		
	Connection con=null;
	Statement st=null;
	{
	try 
	{	
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
		st=con.createStatement();
        st.execute("update testing set ename='fgegee' where ENO=100");
        ResultSet rs=st.executeQuery("select * from testing");
        int c= st.getUpdateCount();
        System.out.println("count"+c);
        System.out.println("ENo" +"   "+"ENAME");
        System.out.println("==================");
        while(rs.next())
     {
    	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
     }
 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		st.close();
		con.close();
		
	}
	}
}
}

