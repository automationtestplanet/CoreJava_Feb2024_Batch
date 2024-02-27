package exceptions;

public class TryCatchFinallyEx {

	public static void main(String[] args) {
		
		
//		try {
//			System.out.println(100/0);
//		}finally {
//			System.out.println("This is Fnallly block");
//		}
		
		
//		try {
//			
//			System.out.println("THis is Try block");
//			
//			System.out.println("Database Connnection is Open");
//			System.out.println(100/1);
//			System.out.println("Database queries are executed");
//			
//		}catch(Exception e) {
//			System.out.println("Database Connnection is Closed");
//		}
		
		
		try {
			System.out.println("Database Connnection is Open");
			System.out.println(100/0);
			System.out.println("Database queries are executed");
		}catch(Exception e) {
			
		}finally {
			System.out.println("Database Connnection is Closed");
		}
		
		System.out.println("Hello Java");

	}

}
