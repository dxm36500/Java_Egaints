package egaints;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class jdbc12 {

	public static void getproducts() {
		String query="select * from products";
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println("Product id : "+rs.getInt("product_id"));
				System.out.println("Product Description :"+rs.getString("product_description"));
				System.out.println("Product name: "+rs.getString("product_name"));
				System.out.println("Product price: "+rs.getFloat("product_price"));
				System.out.println("Supplier id: "+rs.getInt("supplier_id"));
				System.out.println("  ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
	}
	
    public static void main(String args[])
    {
    	getproducts();
    }
	
}
