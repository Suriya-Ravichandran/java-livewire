package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] result = new int[6];
		 
		 int []num1= {1,8,9,10,20,30};
		 int []num2= {2,4,6,8,10,21};
		 
		 for(int i=0;i<num1.length;i++) {
			 result[i] =num1[i] + num2[i];
		 }
		 
		 for(int j=0;j<result.length;j++) {
			 System.out.println("Result:"+num1[j]+"+"+num2[j]+"="+result[j]);
		 }

	}

}
