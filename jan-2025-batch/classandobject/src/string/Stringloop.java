package string;

import java.util.ArrayList;
import java.util.Scanner;
public class Stringloop {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s =new String();
		ArrayList <String> data= new ArrayList<>();
		
		System.out.println("Enter how many data to add: ");
		int size=scn.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter data"+i+":");
			String text=scn.next();
			data.add(text);
		}
		
		 System.out.println(data);
		 
		 for(int i=0;i<size;i++) {
			 System.out.println(data.get(i));
		 }
	}

}
