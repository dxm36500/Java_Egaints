import java.util.*;
public class linkedlistpgm {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("jbhi");
		l.add("Devi");
		l.add("John");
		l.add("Martin");
		
		ListIterator<String> a=l.listIterator();
		Collections.sort(l);
		
		while(a.hasNext())
		{
			
			System.out.println(a.next());
		}	

	}
}


