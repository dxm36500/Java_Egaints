import java.util.Date;
public class accountholder {

	private String Name;
	private String email;
	private Date dob;
	private Gender gender;
	public accountholder() {
		// TODO Auto-generated constructor stub
	}
	
	public accountholder(String name, String email, Date dob, Gender gender) {
		super();
		Name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
