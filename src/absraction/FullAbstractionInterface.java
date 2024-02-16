package absraction;

public interface FullAbstractionInterface {
	
	// By default all global variables inside the Interface are public, static and final 
	
	public final static String str = "JAVA";
	
	//By default all methods in the Interface are public and Abstract methods
	
	int addition(int a, int b);

	int substraction(int a, int b);

	int multiplication(int a, int b);

	int division(int a, int b);
	
	int modDivision(int a, int b);
	
	public static void main(String[] args) {
		System.out.println(str);
		
//		str = "Hello";
	}

}
