import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cities {
	public static void main(String[] args) {
		HashMap<String, List<String>> cl=new HashMap<>();
		cl.put("Hyd", Arrays.asList(new String[] {"Ameerpet","SR Nagar","Panjagutta"}));
		cl.put("Chennai", Arrays.asList(new String[] {"Marina Beach","T Nagar","Covelong"}));
		cl.put("Mumbai", Arrays.asList(new String[] {"Kamala","Shivaji Airport","Aroli"}));
	
		for(Map.Entry<String,List<String>> prt:cl.entrySet())
		{
			System.out.println(prt.getKey() + " "+ prt.getValue());
		}
	}

}
