package gettersetter;

public class Employee {
//	variables
	private String ename;
	private int age;
	private double salary;
	private String Dept;
	
//	constractor
	public Employee(String ename, int age, double salary, String dept) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
		Dept = dept;
	}
	


//	getter setter
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}

	
	
}
