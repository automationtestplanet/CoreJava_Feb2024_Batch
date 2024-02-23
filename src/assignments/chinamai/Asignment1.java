package assignments.chinamai;

public class Asignment1 {

	// Write a reusable program to check the number prime or not

	public static void main(String[] args) {
		
		int num = 29;
		boolean flag = false;
		for(int i=2; i<=num/2;++i) {
	// condition for nonprime numbers
			if (num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime number");
	}
	
	

}
