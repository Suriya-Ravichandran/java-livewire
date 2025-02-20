package abstractmethod;

public class Main extends AMClass{

   public static void main(String[] args) {
		Main m1=new Main();
		m1.dummy();
		
	}

	@Override
	void dummy() {
		System.out.println("Dummy method is use");
		
	}
	


}
