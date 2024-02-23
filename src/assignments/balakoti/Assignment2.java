package assignments.balakoti;

public class Assignment2 {
	// Write a reusable program to check the number prime or not

		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }
		        for (int i = 2; i <number; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static void main(String[] args) {
		        int num = 2; // Change this to the number you want to check
		        if (isPrime(num)) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num + " is not a prime number.");
		        }
		    }
		}


