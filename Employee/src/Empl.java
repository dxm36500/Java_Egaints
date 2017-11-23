
public class Empl implements Comparable<Empl>{

	private int id;
    private String name;
    private Integer salary;
     
    public Empl(int id, String name, Integer sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Empl emp) {
         
        return this.salary.compareTo(emp.getSalary());
    }
    public String toString(){
        return id+"  "+name+"   "+salary;
    }
}
