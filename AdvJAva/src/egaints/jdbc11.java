package egaints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc11 {
	
	
	public static void addproduct(int product_id,String product_description,String product_name,float product_price,int supplier_id)
	{
		
		String query="insert into products(product_id,product_description,product_name,product_price,supplier_id)"
				+"values(?,?,?,?,?)";
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divya?useSSL=false","root","Divya");
		PreparedStatement pstmt=con.prepareStatement(query);
	
		pstmt.setInt(1,product_id);
		pstmt.setString(2,product_description);
		pstmt.setString(3,product_name);
		pstmt.setFloat(4,product_price);
		pstmt.setInt(5,supplier_id);
		
		int count=pstmt.executeUpdate();
		
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
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		
		addproduct(106,"Car","Audi",25000.0f,7764);
	}

}
