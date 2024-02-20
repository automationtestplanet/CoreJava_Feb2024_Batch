package accessmodifiersuse;

import acessmodifiers.PublicClass;

public class UsePublicClass extends PublicClass{

	public static void main(String[] args) {
		UsePublicClass pubCls = new UsePublicClass();
		
		System.out.println("Addition: "+pubCls.addition(10, 20));
		
//		System.out.println("Substraction: "+pubCls.substraction(30, 40));  // default access modifier can not be accessed outside the package
		
//		System.out.println("Multiplication: "+pubCls.multiplication(10, 20)); // default access modifier can not be accessed outside the package
		
		System.out.println("Multiplication: "+pubCls.multiplication(10, 20)); // gives the access for sub/child class outside the package 
		
//		System.out.println("Division: "+pubCls.division(10, 20)); // Private can not be accessed outside the class and package
		
	}
}
