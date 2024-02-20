package functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceEx {
	int addition(int a, int b);

	public static void main(String[] args) {
		FunctionalInterfaceEx funInf = new FunctionalInterfaceEx() {
			@Override
			public int addition(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println(funInf.addition(100000, 200000));
		
		FunctionalInterfaceEx funInf2 = (a,b)->{return a+b;};  // Lambda expression		
		System.out.println(funInf2.addition(25000, 35000));
		
		FunctionalInterfaceEx funInf3 = (a,b)-> a+b;  // Lambda expression		
		System.out.println(funInf3.addition(2000, 3000));
	}
}
