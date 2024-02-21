package functionalinterface;

public class UseFunctionalInterfaceWithLambda {

	public static void main(String[] args) {
		FunctionalInterfaceEx2 funEx2 = (a,b)->{return a%b;};
		
		FunctionalInterfaceEx2 funEx3 = (a,b)->a%b;
		
		System.out.println(funEx2.modDivision(20, 3));
		
		System.out.println(funEx3.modDivision(20, 7));
	}
}
