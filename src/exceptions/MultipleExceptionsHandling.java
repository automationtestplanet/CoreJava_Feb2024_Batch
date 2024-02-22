package exceptions;

public class MultipleExceptionsHandling {

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

	public static void main(String[] args) throws InterruptedException {
		String str = "Hello";
		MultipleExceptionsHandling mEx = null;
		MultipleExceptionsHandling mEx2 = new MultipleExceptionsHandling();

//		try {
//			System.out.println(str.charAt(5));
//		} catch (StringIndexOutOfBoundsException strIn) {
//
//		}
//
//		try {
//			System.out.println(mEx.addition(10, 20));
//		} catch (NullPointerException nullEx) {
//
//		}
//
//		try {
//			System.out.println(mEx2.division(100, 0));
//		} catch (ArithmeticException ae) {
//
//		}
		
//		try {
//			System.out.println(str.charAt(4));
//			System.out.println(mEx2.addition(10, 20));
//			System.out.println(mEx2.division(100, 0));
//		}catch(StringIndexOutOfBoundsException strEx) {
//			System.out.println(strEx.getMessage());
//		}catch(NullPointerException nullEx) {
//			System.out.println(nullEx.getMessage());
//		}catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//		}
		
//		try {
//			System.out.println(str.charAt(4));
//			System.out.println(mEx2.addition(10, 20));
//			System.out.println(mEx2.division(100, 0));
//		}catch(StringIndexOutOfBoundsException | NullPointerException | ArithmeticException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		try {
			System.out.println(str.charAt(4));
			System.out.println(mEx2.addition(10, 20));
			System.out.println(mEx2.division(100, 0));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException iEx) {
//			
//		}
		
		Thread.sleep(10000);

		System.out.println(mEx2.substraction(20, 3));
		System.out.println(mEx2.multiplication(20, 3));

	}

}
