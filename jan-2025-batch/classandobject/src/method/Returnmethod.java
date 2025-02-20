package method;

public class Returnmethod {

	
	public  int add(int value1,int value2) {
			int num1=value1;
			int num2=value2;
			int result=num1+num2;
			return result;
		
	}
	
	public static void main(String[] args) {
		Returnmethod r1=new Returnmethod();
		int result=r1.add(10,20);
		System.out.println(result);
	}

}
