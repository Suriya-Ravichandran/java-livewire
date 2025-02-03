package employeemanagementsys;

public class Employee {
	private String Name;
	private int Eid;
	private String Dept;
	
	
	public void getEmployeeData() {
		System.out.println("Name: "+Name);
		System.out.println("Employee id: "+Eid);
		System.out.println("Department: "+Dept);
	}
	
	public void setEmployeeData(String Name,String Dept,int Eid) {
		this.Name=Name;
		this.Eid=Eid;
		this.Dept=Dept;
	}
}
