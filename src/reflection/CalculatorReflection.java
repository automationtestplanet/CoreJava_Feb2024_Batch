package reflection;

import java.lang.reflect.Method;

public class CalculatorReflection extends Calculator{
	
	@Override
	public void addition(int a, int b) {
		System.out.println("Addition: " + (a + b+5));
	}

	public static void main(String[] args) throws Exception {

		Method[] allMethods = Calculator.class.getMethods();

		for (Method eachMethod : allMethods) {
			System.out.println(eachMethod.getName());
		}

		Calculator calc = new Calculator();

		Object[] data = { 10, 20 };

		for (Method eachMethod : allMethods) {
			String methodName = eachMethod.getName();
			if (methodName.equalsIgnoreCase("addition") || methodName.equalsIgnoreCase("substraction")
					|| methodName.equalsIgnoreCase("multiplication") || methodName.equalsIgnoreCase("division"))
				eachMethod.invoke(calc, data);
		}
		
		Method modDivsionMethod = Calculator.class.getDeclaredMethod("modDivision", int.class, int.class);
		modDivsionMethod.setAccessible(true);
		modDivsionMethod.invoke(calc, data);

	}

}
