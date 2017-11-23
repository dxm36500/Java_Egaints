import java.sql.*;
public class jdbc7 {

	/* Create or replace procedure getSal (num in number,sal out number)
AS
BEGIN
select salary into sal from empl1 where eno=num;
end getSal;
/
  */
 public static void main(String args[]) throws Exception
 {
	 Class.forName("oracle.jdbc.OracleDriver");
		Connection Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Divya");
		CallableStatement cst=Con.prepareCall("{ call getSal(?,?)}");
		cst.setInt(1,102);
		cst.registerOutParameter(2, Types.FLOAT);
		cst.execute();
		System.out.println(" Salary : " + cst.getFloat(2));
	 
 }
	
	
}
