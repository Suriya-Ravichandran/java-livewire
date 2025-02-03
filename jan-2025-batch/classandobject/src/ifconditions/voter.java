package ifconditions;

import java.util.Scanner;
public class voter {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			// TODO Auto-generated method stub
			System.out.println("--------voter app----------");
			System.out.println("Enter age: ");
			int age = scn.nextInt();
			
			if(age>=18) {
				System.out.println("Go Vote");
			}
			else if(age==17 && age<18){
				System.out.println("Get out the election boothu");
			}
			else {
				System.out.println("are you child");
				break;
			}
		}

	}

}
