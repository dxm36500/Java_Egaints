
public class student implements Comparable<student>{

	int sno;
	String sname;
	
	public student(int sno, String sname) {
		
		this.sno = sno;
		this.sname = sname;
	}
	
	public int compareTo(student s)
	{
		if(this.sno==s.sno) return 0;
		else if (this.sno>s.sno) return 1;
		else
		return -1;
			
		}
	
	public boolean equals(Object obj)
	{
	 student st=(student)obj;
	 if(st!=null)
	{
		if((this.sno==st.sno) && (this.sname.equals(st.sname)))
		{
			return true;
		}
		
	}	
	 return false;
}
}