package fundamentals;

public class StaticAndInstance {
	
	int a = 100;
	int b = 200;
	
	static int c = 300;
	
	public void addition(){
		System.out.println(c);
		print();
		System.out.println("Addition: "+(a+b));
	}
	
	public void substraction(){
		System.out.println(c);
		addition();
		System.out.println("Substraction: "+(a-b));
	}
	
//	public static void multiplication(){
////		addition();
//		System.out.println("Multiplication: "+(a*b));
//	}
//	
//	public static void division(){
//		System.out.println("Division: "+(a/b));
//	}
//	
//	public static void modDivision(){
//		System.out.println("ModDivision: "+(a%b));
//	}
	
	public static void print() {
		System.out.println(c);
	}
	
	public static void print2() {
		int a = 100;
		int b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void print3() {		
		int a = 100;
		int b = 200;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		StaticAndInstance	a = new StaticAndInstance();
		StaticAndInstance	c = new StaticAndInstance();
		StaticAndInstance	d = new StaticAndInstance();
		StaticAndInstance	e = new StaticAndInstance();
		
		int b = 200;
		
		System.out.println(b);
		
		System.out.println(a.a);
		System.out.println(a.b);
		a.addition();
		a.substraction();
		
	}

}
