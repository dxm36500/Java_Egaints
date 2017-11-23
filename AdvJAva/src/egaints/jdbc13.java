package egaints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class jdbc13 {
	
	public static List<products> getproducts() throws SQLException
	{
		String query="select * from products";
		ArrayList<products> al= new ArrayList<>();
		
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya")) {
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				products pro=new products();
				pro.setProduct_id(rs.getInt("product_id"));
				pro.setProduct_description(rs.getString("product_description"));
				pro.setProduct_name(rs.getString("product_name"));
				pro.setProduct_price(rs.getFloat("product_price"));
				pro.setSupplier_id(rs.getInt("supplier_id"));
				System.out.println("  ");
			    al.add(pro);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return al;		
	}
	

	public static void main(String[] args) throws SQLException {
		List<products> products=getproducts();
		for(products p:products)
		{
			System.out.println(p.product_id + " "+ p.product_description+ " "+p.product_name+" "+p.product_price+ " "+p.supplier_id);
		}
	}

}
