package Errorhandling;

import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
		System.out.println("Enter num1:");
		int num1=scn.nextInt();
		System.out.println("Enter num2:");
		int num2=scn.nextInt();
		try {
		System.out.println("Result: "+num1/num2);
	    }catch(Exception e) {
			  System.out.println("invaild");
		}
		finally {
			System.out.println("success fully runing");
		}
		}

	}

}
