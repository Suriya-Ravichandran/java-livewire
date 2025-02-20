package array;
import java.util.Scanner;
public class StudentNameList {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many Student name to ADD: ");
		int size=scn.nextInt();
		String [] sname = new String[size];
		
		 // Use a for loop to update the array
        for (int i = 0; i < size; i++) {
        	System.out.println("Enter name: ");
        	String name=scn.next();
            sname[i] = name; // Update the array with values 1 to 10
        }
        
     // Print the array to verify the result
        for (int i = 0; i < 10; i++) {
            System.out.println("Element at index " + i + ": " + sname[i]);
        }
		
	}

}
