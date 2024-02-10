package oops;


//Inheritance
public class NewCalculator extends Calculator{
	
	public int modDivision(int a, int b) {
		return a%b;
	}
	
//	runtime polymorphism or method overriding
	public int addition(int a, int b) {
		return a + b + 5;
	}
}
