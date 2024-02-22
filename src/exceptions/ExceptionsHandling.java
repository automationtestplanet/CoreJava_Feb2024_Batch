package exceptions;

public class ExceptionsHandling {
	
	public int addition(int a, int b) {
		return a + b;
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

	public static void main(String[] args) {

		System.out.println("---------------------------Program Execution Started----------------------");
		
		ExceptionsHandling ex = new ExceptionsHandling();
		
		int a = 10;
		ExceptionsHandling ex2 = new ExceptionsHandling();
		
		ArithmeticException ae1 = new ArithmeticException();

		try {
			System.out.println(ex.division(100, 0));  // Runtime Exception
//			throw new ArithmeticException();
		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
			
			System.out.println(ex.division(100, 1));
		}
		
		System.out.println(ex.addition(100, 200));
		
		long startTime = System.nanoTime();

//		b =300 int;
		try {
			Thread.sleep(30000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		long endTIme = System.nanoTime();
		
		System.out.println("Exectuion TIme: "+ (endTIme-startTime));
		
		
		System.out.println(ex.substraction(100, 3));
		System.out.println(ex.multiplication(100, 3));
		

		System.out.println("---------------------------Program Execution Ended----------------------");

	}

}
