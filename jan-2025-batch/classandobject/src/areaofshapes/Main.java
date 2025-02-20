package areaofshapes;

public class Main {

	public static void main(String[] args) {
		Shapes s1 = new Shapes();
		Cricle c1=new Cricle();
		Triangle t1=new Triangle();
		
		double Cricleresult=c1.AreaofCricle(200);
		c1.Shapes();
		System.out.println("Area of Circle: "+Cricleresult);
		
		double Triangleresult=t1.AreaofTriangle(200, 400);
		t1.Shapes();
		System.out.println("Area of Triangle: "+Triangleresult);
//		double Cricleresult=s1.AreaofCricle(30);
//		System.out.println("Area of Circle: "+Cricleresult);
//		
//		int Squareresult=s1.areaofsquare(120);
//		System.out.println("Area of Square: "+Squareresult);
		
		
	}

}
