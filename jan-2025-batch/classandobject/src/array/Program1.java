package array;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> Even =new ArrayList<>();
		ArrayList<Integer> odd =new ArrayList<>();
		ArrayList<Integer> Result =new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				Even.add(i);
			}
		}
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				odd.add(i);
			}
		}
		for(int i=0;i<5;i++) {
			Result.add(Even.get(i)+odd.get(i));
		}
		
		System.out.println("Even Array");
		System.out.println(Even);
		System.out.println("Odd Array");
		System.out.println(odd);
		System.out.println("Sum of Two Array");
		System.out.println(Result);
		
		
		
		
		

	}

}
