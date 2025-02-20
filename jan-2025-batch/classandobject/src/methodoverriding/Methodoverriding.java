package methodoverriding;

public class Methodoverriding extends override{
	
	
	public void overridefun() {
		System.out.println("This is override from main");
	}

	public static void main(String[] args) {
		override o1 =new override();
		Methodoverriding m1=new Methodoverriding();
		m1.overridefun();
		o1.overridefun();
		
	}

}
