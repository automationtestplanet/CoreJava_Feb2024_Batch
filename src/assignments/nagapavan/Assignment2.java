package assignments.nagapavan;

public class Assignment2 {
	// Write a reusable program to check the number prime or not

	public boolean checkPrime(int num) {

		int n = num;
		boolean primeNo = true;
		if (n <= 1) {
			primeNo = false;
			return primeNo;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					primeNo = false;
					break;
				}
			}
		}
		return primeNo;
	}

	public static void main(String[] args) {
		
		int num=28;
		Assignment2 ag=new Assignment2();
		boolean primeNo =ag.checkPrime(num);
		
		if(primeNo) {
			System.out.println("prime number: "+num);
		}else {
			System.out.println("Not prime number: "+num);
		}
	}
}