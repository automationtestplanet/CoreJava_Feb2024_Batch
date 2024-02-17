package assignments.chinamai;

public class Asignment1 {

	// Write a reusable program to check the number prime or not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =7;//example number to check for primality
		if (checkPrime(num)) {
			System.out.println(num+"is a prime number.");
		}
		else {
			System.out.println(num+"is not prime number.");
		}

	}
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(num);i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

}
