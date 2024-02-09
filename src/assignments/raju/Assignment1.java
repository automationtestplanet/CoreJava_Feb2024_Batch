package assignments.raju;

public class Assignment1 {
	
	
	// Write a logic to swap the numbers with out using 3rd variable
	// i/p: a = 100, b = 200
	//o/p:  a = 200, b = 100
	
	
	public static void swapValues(int a, int b){		
		System.out.println("---------------Before Swaping--------------------");
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
		
//		int c = b;  // 200		
//		b = a; //100		
//		a = c;  // 200
		
		a = a+b;  // 300		
		b = a-b; // 100		
		a = a-b; // 200
	
		System.out.println("---------------Before Swaping--------------------");
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
	}

	public static void main(String[] args) {		
		swapValues(100,200);
	}

}
