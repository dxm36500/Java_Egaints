import java.util.*;
public class mapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(100,"Kavitha");
		mp.put(101, "Anitha");
		mp.put(102, "Sindhu");
		
		System.out.println(mp);
		
	 for(Map.Entry<Integer,String> m:mp.entrySet())
	 {
		 System.out.println(m.getKey() + " " + m.getValue());
	 }
	}

}
