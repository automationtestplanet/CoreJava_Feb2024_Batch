package demo;

public class ClassEx {

	public static void print() {
		System.out.println("Hi!!!!!!!! this is Java");
	}

	public static void print2() {
		System.out.println("Hi!!!!!!!! this is Java");
	}

	public static void print3() {
		System.out.println("Hi!!!!!!!! this is Java");
	}

	public static void print4() {
		print();
		print2();
		print3();
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, int c, int d) {
		return a + b;
	}

//	public static void static(){
//		System.out.println("Hi!!!!!!!! this is Static Keyword");
//	}

	public static void main(String[] args) {
		System.out.println("This is Class block");

		print4();
//		static();

		int a = 100;

		System.out.println(a);

		a = 300;

		System.out.println(a);

		System.out.println(a);

		System.out.println(add(10000, add(1000, 200, add(10, 20, 30, 40))));

	}

}
