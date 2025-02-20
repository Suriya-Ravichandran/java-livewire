package array;

public class Array1 {

	public static void main(String[] args) {
//		array creation index values start from 0.... n
		 int[] numbers = new int[10];

	        // Use a for loop to update the array
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = i + 1; // Update the array with values 1 to 10
	        }

	        // Print the array to verify the result
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }
	}

}
