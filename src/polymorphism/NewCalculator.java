package polymorphism;

public class NewCalculator extends Calculator {

	public int modDivision(int a, int b) {
		return a % b;
	}

	public int addition(int a, int b) {
		return super.addition(a, b) + 5;
	}

	public int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public String addition(String str1, String str2) {
		return str1 + str2;
	}

	public static int substraction(int a, int b, int c) {
		return a - b - c - 10;
	}

	public static void main(String[] args) {
		NewCalculator calc = new NewCalculator();
		System.out.println(calc.addition(10, 20));
		System.out.println(calc.addition(10.5f, 20.5f));
	}

}
