package accessmodifiersuse;

import acessmodifiers.Calculator;
import acessmodifiers.PublicClass;

public class UseCalculator extends Calculator{

	public static void main(String[] args) {
		UseCalculator calc = new UseCalculator();
		
		System.out.println("Addition: "+calc.addition(10, 20));
		
//		System.out.println("Substraction: "+calc.substraction(30, 40));  // default access modifier can not be accessed outside the package
		
//		System.out.println("Multiplication: "+calc.multiplication(10, 20)); // default access modifier can not be accessed outside the package
		
		System.out.println("Multiplication: "+calc.multiplication(10, 20)); // gives the access for sub/child class outside the package 
		
//		System.out.println("Division: "+calc.division(10, 20)); // Private can not be accessed outside the class and package
		
		
		PublicClass pubCls = new PublicClass();
		
		
		
	}

}
