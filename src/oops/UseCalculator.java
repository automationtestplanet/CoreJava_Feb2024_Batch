package oops;

public class UseCalculator {
	
	public static void main(String[] args) {
//		Calculator calc = new Calculator();	
		CalculatorInterface calc = new NewCalculator();	
		int sum = calc.addition(100, 200);
		int sum2 = calc.addition(100, 200, 300);
		System.out.println(sum);
		System.out.println(sum2);
		
		String sum3 = calc.addition("Hello", "Java");
		System.out.println(sum3);
		
		int division = calc.division(200, 3);
		System.out.println(division);
		
		int division2 = calc.modDivision(200, 3);
		
		System.out.println(division2);
	}

}
