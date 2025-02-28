package array;

import java.util.ArrayList;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<>();
		
		System.out.println("How many number to add an array: ");
		int numdata=scn.nextInt();
		
		for(int i=0;i<numdata;i++) {
			System.out.println("Enter the number index["+i+"]: ");
			int data=scn.nextInt();
			a1.add(data);
		}
		
		System.out.println(a1);
		scn.close();
	}

}
