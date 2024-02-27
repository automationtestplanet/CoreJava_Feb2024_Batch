package functionalinterface;

public class UseFunctionalInterfaceWithoutImplements {

	public static void main(String[] args) {
		FunctionalInterfaceEx2 funEx2 = new FunctionalInterfaceEx2() {			
			@Override
			public int modDivision(int a, int b) {
				return a%b;
			}
		};		
		
		System.out.println(funEx2.modDivision(20, 3));
	}

}
