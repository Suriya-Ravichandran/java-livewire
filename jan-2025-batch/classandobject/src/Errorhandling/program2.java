package Errorhandling;

public class program2 {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		
		for(int i=0;i<=arr.length;i++) {
     	try {
			System.out.println(arr[i]);
			}catch(Exception e) {
				System.out.println("index out of bound");
			}
			finally {
				System.out.println("Try and Catch is excuted");
			}
			
		}

	}

}
