package whileloop;

public class Continueloop {

	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			if(i==6) {
				 i++;
				 continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
