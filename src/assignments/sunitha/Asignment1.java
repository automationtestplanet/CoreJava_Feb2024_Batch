package assignments.sunitha;


public class Asignment1
{
	// Write a reusable program to check the number prime or not
	public static  boolean checkPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<num;i++)
			if(num%i==0)
				
		return false;
		return true;
			}

		public static void main() {
			if(checkPrime(11))
		     System.out.println("true");
			else
				System.out.println("false");
			
			
		}
		
	}
		