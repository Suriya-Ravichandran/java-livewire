package oops;

public class Main extends Dog {

	public static void main(String[] args) {
		
		Cow C1 =new Cow();
		Dog D1 =new Dog();
		Main s1=new Main();
		s1.Dogsound();
		s1.Catsound();
		
		
		D1.Dogsound();
		D1.Catsound();
		
		C1.Catsound();
		C1.Cowsound();		
	}

}
