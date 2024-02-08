package fundamentals;

public class FinalVariable {
	
	final int A = 100;
	
	final static int B = 200;
	
	public void addition(final int A, int b) {
//		a = 300;
		
		System.out.println(A+b);
	}

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		System.out.println(finalVariable.A);
		
//		finalVariable.a = 500;
		
		System.out.println(B);
		
//		b = 600;
//		finalVariable.b = 600;
		
		finalVariable.addition(100,200);
	}

}
