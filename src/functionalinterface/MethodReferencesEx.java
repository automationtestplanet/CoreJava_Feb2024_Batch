package functionalinterface;

public class MethodReferencesEx {
	
	int addition(int a, int b) {
		return a+b;
	}
	
	static int substraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		MethodReferencesEx methodRefEx = new MethodReferencesEx();
		
		FunctionalInterfaceEx2 funEx2 = methodRefEx::addition; // Object reference
		
		System.out.println(funEx2.modDivision(20,3));
		
		FunctionalInterfaceEx2 funEx3 = MethodReferencesEx::substraction; // static reference
		
		System.out.println(funEx3.modDivision(20,3));

	}

}
