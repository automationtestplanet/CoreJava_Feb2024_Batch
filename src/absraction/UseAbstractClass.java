package absraction;

public class UseAbstractClass extends AbstractClass {
	
	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {		
		return a/b;
	}

	public static void main(String[] args) {
		AbstractClass absCls = new UseAbstractClass();
		
		System.out.println(absCls.addition(10, 20));
		System.out.println(absCls.substraction(10, 20));
		System.out.println(absCls.multiplication(10, 20));
	}

	
}
