package egaints;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;




public class Jdbc10 {

	public static void main(String[] args) throws Exception {
		String query="insert into products(product_id,product_description,product_name,product_price,supplier_id)"
						+"values(101,'AC','Daikin',285.8,1292)";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
		Statement stmt=con.createStatement();
		int count=stmt.executeUpdate(query);
		if(count==1)
		{
			System.out.println("Entry Success");
		}
		else
		{
			System.out.println("Entry Failed");
		}
		con.close();
		
	}

}
