package absraction;

public class UseInterface implements FullAbstractionInterface {
	
	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public int modDivision(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		
		FullAbstractionInterface inf = new UseInterface();
		
		System.out.println(inf.addition(10, 20));	
	}

	

}
