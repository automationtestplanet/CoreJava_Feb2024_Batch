package absraction;

public interface InterfaceExample {
	
	static int substraction(int a, int b) {
		return a-b;
	}
	
	default int multiplication(int a, int b) {
		return a*b;
	}

}
