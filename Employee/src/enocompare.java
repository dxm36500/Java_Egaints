import java.util.*;

public class enocompare implements Comparator<employeearray> {
	
	public int compare(employeearray e1,employeearray e2){  
		if(e1.eid==e2.eid)  
		return 0;  
		else if(e1.eid>e2.eid)  
		return 1;  
		else  
		return -1;  
		}  
}
