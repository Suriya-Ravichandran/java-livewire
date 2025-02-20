package method;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// object creation done by here
		Scanner scn = new Scanner(System.in);
//		Remote r1=new Remote();
		// creating a loop		
		
		while(true) {
		//Application Logic		
		System.out.println("-----AC Remote App------");
		System.out.println("Press 1 to Power On");
		System.out.println("Press 2 to Power Off");
		System.out.println("Press 3 to Increase temp");
		System.out.println("Press 4 to Decrease temp");
		System.out.println("Enter your Choice: ");
		
		// control the program	
		int choice=scn.nextInt();
		if(choice==1) {
			Remote.poweron();
		}
		else if(choice==2) {
			Remote.poweroff();
		}
		else if(choice==3) {
			Remote.tempincrease();
		}
		else if(choice==4) {
			Remote.tempdecrease();
		}
		else if(choice==0) {
			System.out.println("Batter Low !");
			scn.close();
			break;
		}
		else {
			System.out.println("invaild Choice..");
		}
	  }	
	}

}
