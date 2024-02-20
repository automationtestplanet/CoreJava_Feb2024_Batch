package absraction;

abstract public class AbstractClass {

	public int addition(int a, int b) {
		return a + b;
	};

	public int substraction(int a, int b) {
		return a - b;
	};

	abstract public int multiplication(int a, int b);

	abstract public int division(int a, int b);

//	public static void main(String[] args) {
//
//  AbstractClass absCls = new AbstractClass(); // Can not create the Object
//
//	}
}
