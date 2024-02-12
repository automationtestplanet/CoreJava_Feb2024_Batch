package inheritance;

public class UseCalculator {

	public static void main(String[] args) {
		NewCalculator2 calc = new NewCalculator2();
		System.out.println(calc.addition(10, 20));
		System.out.println(calc.substraction(10, 20));
		System.out.println(calc.multiplication(10, 20));
		System.out.println(calc.division(10, 20));
		System.out.println(calc.modDivision(10, 20));
		System.out.println(calc.addition("Hello", "Java"));
	}

}
