package Methodoverloading;

public class output {

	public static void print(int data) {
		System.out.println(data);
	}
	public static void print(String data) {
		System.out.println(data);
	}
	public static void print(double data) {
		System.out.println(data);
	}
	public static void print(char data) {
		System.out.println(data);
	}
	public static void print(int data,int data2) {
		System.out.println(data+data2);
	}
	
	
	public static void main(String[] args) {
		print("Hello");
		print(10);
		print(20.3);
		print('A');

	}

}
