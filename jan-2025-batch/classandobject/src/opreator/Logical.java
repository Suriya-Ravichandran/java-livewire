package opreator;


import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter y choice: ");
		int y=scn.nextInt();
		System.out.println("Enter z choice: ");
		int z=scn.nextInt();

		if(y==1 || z==0) {
			System.out.println("y is rigth");
		}
		else if(y==0 || z==1) {
				System.out.println("z is rigth");
		}else {
			System.out.println("Unperidictable");
		}
		
	}

}
