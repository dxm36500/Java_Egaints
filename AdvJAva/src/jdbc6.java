import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class jdbc6 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
		Statement st=con.createStatement();
		st.addBatch("delete from emp where salary>6000");
		st.addBatch("insert into emp values(104,'Baby',9000)");
		st.addBatch("Update emp set ename='Div' where eno=100");
		int[] count =st.executeBatch();
		for(int i=0;i<count.length;i++)
		{
			System.out.println("Records Modified: "+count[i]);
		}
		
	}

}
