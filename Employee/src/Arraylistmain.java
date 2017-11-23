import java.util.*;


public class Arraylistmain {
	
	public static employeearray findmaxsal(List<employeearray> lt)
	{
		Collections.sort(lt,new esalcompare());
		employeearray ea=lt.get(lt.size()-1);
		return ea;
		
	}

	public static void main(String[] args) {
		employeearray al=new employeearray(1,"Hary",2000);
		employeearray al1=new employeearray(2,"Raj",9000);
		employeearray al2=new employeearray(3,"Kumar",5000);
		employeearray al3=new employeearray(4,"Jhon",9200);
		employeearray al4=new employeearray(5,"Steve",8000);
		employeearray al5=new employeearray(6,"Abdul",7000);
		employeearray al6=new employeearray(7,"Ashfaq",6500);
		employeearray al7=new employeearray(8,"Ravi",6800);
		employeearray al8=new employeearray(9,"Rachel",3400);
		employeearray al9=new employeearray(10,"Archana",8000);
		
		ArrayList<employeearray> lt=new ArrayList<employeearray>();
		lt.add(al);
		lt.add(al1);
		lt.add(al2);
		lt.add(al3);
		lt.add(al4);
		lt.add(al5);
		lt.add(al6);
		lt.add(al7);
		lt.add(al8);
		lt.add(al9);
		
		employeearray ea=findmaxsal(lt);
		
		 System.out.println("Emp Id: "+ea.eid);
		 System.out.println("Emp Name: "+ea.ename);
		 System.out.println("Emp Sal: "+ea.esal);
			
			
			
		}
		
			}	
			 


