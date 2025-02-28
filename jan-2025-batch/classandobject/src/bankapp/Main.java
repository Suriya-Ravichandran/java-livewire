package bankapp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		user u1 =new user();
		
		System.out.println("--------Welcome To SBI---------");
		System.out.println("Press 1 to Login\nPress 2 to Signup");
		System.out.println("Enter Your Choice: ");
		int choice=scn.nextInt();		
		
		if(choice==1) {
			System.out.println("Enter your Username: ");
			String username=scn.next();
			System.out.println("Enter your Password: ");
			String password=scn.next();
			password=u1.login(username, password);
			System.out.println(password);
		}
		else if(choice==2) {
			System.out.println("Enter your Username: ");
			String username=scn.next();
			System.out.println("Enter your Password: ");
			String password=scn.next();
			System.out.println("Enter Account Type: ");
			String Accounttype=scn.next();
			System.out.println("Enter initial Amount: ");
			double amount=scn.nextDouble();
			password=u1.signin(username, Accounttype, amount, password);
			System.out.println(password);
			
		}

	}

}
