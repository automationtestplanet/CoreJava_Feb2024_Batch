package assignments.manoj;

public class Assignment2 {
	// Write a reusable program to check the number prime or not

	public boolean checkPrime(int num) {
		int n = num;
		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {
		int num = 101;
		Assignment2 a2 = new Assignment2();
		boolean isPrime = a2.checkPrime(num);
		if (isPrime) {
			System.out.println("Given number :" + num + " - is a Prime number.");
		} else {
			System.out.println("Given number :" + num + " - is not a Prime number.");
		}

	}
}
