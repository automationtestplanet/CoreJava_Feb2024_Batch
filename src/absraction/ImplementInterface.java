package absraction;

public class ImplementInterface implements InterfaceExample {

	public static void main(String[] args) {
		InterfaceExample infEx = new ImplementInterface();
		System.out.println(infEx.multiplication(10, 200));
		
		System.out.println(InterfaceExample.substraction(50, 30));
		
//		System.out.println(InterfaceExample.multiplication(50, 30));  //Can not call without object

	}
}
