package array;

import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("How many number to add an Array:");
		int size=scn.nextInt();
		
		int []num = new int[size];
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter your numbers index["+i+"]:");
			int data=scn.nextInt();
			num[i]=data;
		}
		System.out.println("Result: ");
		for(int j=0;j<num.length;j++) {
			System.out.println(num[j]);
		}

	}

}
