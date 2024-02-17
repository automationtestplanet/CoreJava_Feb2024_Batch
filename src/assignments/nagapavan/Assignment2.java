package assignments.nagapavan;

public class Assignment2 {
	// Write a reusable program to check the number prime or not

	public static boolean checkPrime(int num) {
		
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		if (checkPrime(15)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (checkPrime(21)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
