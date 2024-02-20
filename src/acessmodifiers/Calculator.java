package acessmodifiers;

public class Calculator {
	
	public int addition(int a, int b) {
		return a+b;
	}

	int substraction(int a, int b) {
		return a-b;
	}

	protected int multiplication(int a, int b) {
		return a*b;
	}

	private int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println(new Calculator().division(10, 3));
	}
}
