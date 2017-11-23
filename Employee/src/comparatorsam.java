import java.util.*;
public class comparatorsam {

	public static void main(String args[]) {
		
		comparatorexp ce=new comparatorexp(10,"Div");
		comparatorexp ce1=new comparatorexp(16,"Nani");
		comparatorexp ce2=new comparatorexp(14,"Ammu");
		
		ArrayList<comparatorexp> al=new ArrayList<comparatorexp>();
		al.add(ce);
		al.add(ce1);
		al.add(ce2);
		
		//Collections.sort(al,new namecomparator());
		
		
		for(comparatorexp cep:al)
		{
			System.out.println(cep.eno+ " " + cep.ename);
		}
	}
}
