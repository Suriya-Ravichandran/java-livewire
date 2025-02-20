package array;

public class Powerarray {

	public static void main(String[] args) {
		
		int []even= {2,4,6,8,10,12};
		int size=even.length;
		int []result=new int [size];
		
		for(int i=0;i<size;i++) {
			 result[i] =even[i]*even[i];
		}
		
		for(int j=0;j<size;j++) {
			System.out.println(result[j]);
		}
	}

}
