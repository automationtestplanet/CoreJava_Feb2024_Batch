package polymorphism;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}
	
//	public void addition(int a, int b) {
//		System.out.println(a + b);
//	}
	
	public int addition(short a, short b) {
		return a + b;
	}
	
	public int addition(float a, float b) {
		return (int)(a + b);
	}
	
	public int addition(int a, short b) {
		return (int)(a + b);
	}
	
	public int addition(int a, int b, int c) {
		return a + b + c;
	}
	
	
	public int substraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	static public int division(int a, int b) {
		return a / b;
	}
	
	public static int substraction(int a, int b, int c) {
		return a - b - c;
	}
	
}
