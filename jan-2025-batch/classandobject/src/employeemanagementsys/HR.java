package employeemanagementsys;

import java.util.Scanner;
public class HR {

	public static void main(String[] args) {
		Employee e1 =new Employee();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter How many employee You Want register: ");
		int noofemployee=scn.nextInt();
		for(int i=1;i<=noofemployee;i++) {
		
		System.out.println("--------Employee Register App--------");
		System.out.println("Press 1 to register\nPress 2 to view\nPress any key to Exit");
		System.out.println("Enter your choice: ");
		
		int choice=scn.nextInt();
		if(choice==1) {
		System.out.println("Enter Name: ");
		String Ename=scn.next();
		System.out.println("Enter Eid: ");
		int Eid=scn.nextInt();
		System.out.println("Enter Edeptment: ");
		String EDept=scn.next();
		
		e1.setEmployeeData(Ename, EDept, Eid);
		System.out.println("Registered success");
		}
		else if(choice==2) {
		System.out.println("------Employee data-------");
		e1.getEmployeeData();
		}
		else {
			System.out.println("Exiting....");
			break;
		}
				
	}
	}

}
