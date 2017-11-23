
public class employeearray implements Comparable<employeearray>{

	int eid;
	String ename;
	float esal;
	public employeearray(int eid, String ename, float esal) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		employeearray other = (employeearray) obj;
		if(other != null)
		{
			
			if ((this.eid == other.eid) && (this.ename==other.ename)
				&& (this.esal == other.esal))
				return true;
		}
				
	    return false;
				
	}
	
	public int compareTo(employeearray ea)
	{
		if(this.eid==ea.eid)
			return 0;
		else if(this.eid > ea.eid)
			return 1;
		else
			return -1;
	}
	
	}

