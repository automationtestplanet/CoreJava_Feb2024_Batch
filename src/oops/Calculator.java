package oops;

//Inheritance
public class Calculator implements CalculatorInterface{

	public int addition(int a, int b) {
		return a + b;
	}
	
//	int addition(int a, int b) {
//		return a + b +5;
//	}
	
//	Compile time Polymorphism or Method overloading
	public String addition(String a, String b) {
		return a + b;
	}
	
//	Compile time Polymorphism or Method overloading
	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int substraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public int modDivision(int a, int b) {
		return 0;
	}
}
