package opreator;

import java.util.Scanner;
public class comparationopreator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=1;  // inittionzation
		while(true){ //condition
			System.out.println("Enter password: ");
			int password=scn.nextInt();
//	    	System.out.println(password);
			
			int verifypass=12345;
			
			if(password==verifypass) {
				System.out.println("Login Sucess");
			}
			else if (password != verifypass) {
					if(x==3){
						break;
					  }
					x++;// increament
				System.out.println("Login failed");
			}
			else {
				System.out.println("please Enter password");
			}
		}
		
		
		
	}

}
