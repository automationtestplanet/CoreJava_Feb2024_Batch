package fundamentals;

public class Variables {

	static int a = 100;
	static int b = 200;
	int c = 300;
//	int c = 500; // not allowed

	public static void addition() {
		System.out.println("Addition: " + (a + b));
	}

	public static int sum() {
		System.out.println("Addition: " + (a + b));
		return a + b;
	}

	public static void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void substraction() {
		System.out.println("Substraction: " + (a - b));
	}

	public static void multiplication() {
		System.out.println("Multiplication: " + (a * b));
	}

	public static void division() {
		System.out.println("Division: " + (a / b));
	}

	public static void modDivision() {
		System.out.println("ModDivision: " + (a % b));
	}
	
	public void print() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		addition();
		addition(1000, 2000);
		addition(10000, 20000);

		System.out.println(sum() + 1);

		int a = sum(1000, 2000);
		int b = sum(10000, 20000);
		int c = sum(1000, 2000) + sum(10000, 20000);
//		int c = 500; // not allowed
		System.out.println(c);
	}
}
