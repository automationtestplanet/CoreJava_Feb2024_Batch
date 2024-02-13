package polymorphism;

public class Upcasting {
	public static void main(String[] args) {
		NewCalculator newCalc = new NewCalculator();
		System.out.println("ModDivision: " + newCalc.modDivision(30, 3));
		System.out.println("Substraction: " + newCalc.substraction(30, 5));
		System.out.println("Addition: " + newCalc.addition(10, 20));

//		Calculator calc = new NewCalculator(); // up-casting
		Calculator calc = newCalc; // up-casting
		System.out.println("Substraction: " + calc.substraction(30, 5));
//		calc.modDivision(30,3);	// not-allowed
		System.out.println("Addition: " + calc.addition(10, 20)); // Overrides parents class addition method

		newCalc = (NewCalculator) calc; // down-casting
		System.out.println("Division: " + NewCalculator.division(30, 3));
		System.out.println("Substraction: " + newCalc.multiplication(30, 5));
		System.out.println("Addition: " + newCalc.addition(10, 20));
		System.out.println("Addition: " + newCalc.addition("Hello", "Java"));
		System.out.println("Addition: " + newCalc.addition(10,20,30));		
		
		System.out.println("Susbtraction: "+NewCalculator.substraction(10,5,2));	// Child class overriding method
		System.out.println("Susbtraction: "+Calculator.substraction(10,5,2)); // Parent class static method cannot override
	}
}
