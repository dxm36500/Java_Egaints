import java.util.*;
public class esalcompare implements Comparator<employeearray>{

	@Override
	public int compare(employeearray o1, employeearray o2) {
	
			if(o1.esal==o2.esal)  
			return 0;  
			else if(o1.esal>o2.esal)  
			return 1;  
			else  
			return -1;  
	}
	}
	
	


