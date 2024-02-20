package acessmodifiers;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println("Addition: "+calc.addition(10, 20));
		
		System.out.println("Substraction: "+calc.substraction(30, 40));
		
		System.out.println("Multiplication: "+calc.multiplication(10, 20));
		
//		System.out.println("Division: "+calc.division(10, 20)); // Private can not be accessed outside the class
	}

}
