package reflection;

public class Calculator {

	public void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("Substraction: " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	private void modDivision(int a, int b) {
		System.out.println("Private method Modular Division: " + (a % b));
	}
}
