
import java.util.LinkedHashMap;
import java.util.Map;

public class company {

	public static void main(String[] args) {
		Texascompany tc=new Texascompany("Hyd","Ameerpet");
		Texascompany tc1=new Texascompany("Hyd","Panjagutta");
		Texascompany tc2=new Texascompany("Hyd","SR Nagar");
		Texascompany tc3=new Texascompany("Mumbai","Aroli");
		Texascompany tc4=new Texascompany("Mumbai","GateWay");
		Texascompany tc5=new Texascompany("Mumbai","Kamala");
		Texascompany tc6=new Texascompany("Chennei","T Nagar");
		Texascompany tc7=new Texascompany("Chennei","Marina");
		Texascompany tc8=new Texascompany("Chennei","Edward");
		
		LinkedHashMap<Integer,Texascompany> map=new LinkedHashMap<Integer,Texascompany>();
		map.put(1,tc);
		map.put(2,tc1);
		map.put(3,tc2);
		map.put(4,tc3);
		map.put(5,tc4);
		map.put(6,tc5);
		map.put(7,tc6);
		map.put(8,tc7);
		map.put(9,tc8);
		
		
		 for(Map.Entry<Integer,Texascompany> m:map.entrySet())
		 {
			 	//int key=m.getKey();  
		        Texascompany d=m.getValue();  
		         
		        System.out.println(d.branch+ " "+ d.subbranch);   	 
		 }
				
	}

}
