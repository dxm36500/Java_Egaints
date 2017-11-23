import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
/* create or replace function avgsal(input1 in number,input2 in number) return float
 as
 sal1 number;
 sal2 number;
 begin
 select salary into sal1 from empl1 where eno=input1;
 select salary into sal2 from empl1 where eno=input2;
 return (sal1+sal2)/2;
 end avgsal;
 /
 
 */

public class jdbc8 {
	public static void main(String args[]) throws Exception
	 {
		 Class.forName("oracle.jdbc.OracleDriver");
			Connection Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
			CallableStatement cst=Con.prepareCall("{?= call avgsal(?,?)}");
			cst.setInt(2,101);
			cst.setInt(3,103);
			cst.registerOutParameter(1, Types.FLOAT);
			cst.execute();
			System.out.println(" Avg Salary : " +cst.getFloat(1) );
		 
	 }
		
		

}
