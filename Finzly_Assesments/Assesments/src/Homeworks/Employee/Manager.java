package employee;

public class Manager extends Employee {
	private String department;
	
	Manager(String department,String name, String id){
		super(name, id);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department +" Name="+super.getName()+" Id="+super.getId()+ "]";
	}
	
	
	
}
