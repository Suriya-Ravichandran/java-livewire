package gettersetter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		while(true){
			System.out.println("Press 1 to add\nPress 2 to Logout");
			int choice=scn.nextInt();
			if(choice==1) {
			System.out.println("Enter name: ");
			String ename=scn.next();
			System.out.println("Enter age: ");
			int age=scn.nextInt();
			System.out.println("Enter Salary: ");
			double salary=scn.nextDouble();
			System.out.println("Enter Dept: ");
			String Dept=scn.next();
			
			Employee e3 =new Employee(ename,age,salary,Dept);
	
			
			System.out.println(e3.getEname());
			System.out.println(e3.getAge());
			System.out.println(e3.getSalary());
			System.out.println(e3.getDept());
			}
			else if(choice==2) {
				System.out.println("Logout");
				break;
			}
		
		}

	}

}
