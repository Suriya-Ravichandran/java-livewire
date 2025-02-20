package method;

import java.util.Scanner;

public class Signin {
	
	
	public int login(String Email,String password){
		String finnalEmail=Email;
		String finnalpassword=password;
		String verifyEmail="suriya@gmail.com";
		String verifypassword="Suriya@123";
		if(verifypassword.equals(finnalpassword) && verifyEmail.equals(finnalEmail)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	

	public static void main(String[] args) {
//		object creation
		
		Scanner scn =new Scanner(System.in);
		Signin s1=new Signin();
		
		System.out.println("Enter Your Email: ");
		String Email=scn.nextLine();
		System.out.println("Enter your Password: ");
		String Password=scn.nextLine();
		int success=s1.login(Email,Password);
		System.out.println(success);
		if(success==1) {
			System.out.println("Login sucess");
		}
		else {
			System.out.println("Login failed");
		}
	}

}
