package functionalinterface;

public class UseFunctionalInterfaceWithImplements implements FunctionalInterfaceEx2 {
	@Override
	public int modDivision(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		FunctionalInterfaceEx2 funEx2 = new UseFunctionalInterfaceWithImplements();
		
		System.out.println(funEx2.modDivision(10, 20));
	}
}
