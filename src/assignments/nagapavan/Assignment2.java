package assignments.nagapavan;

public class Assignment2 {
	// Write a reusable program to check the number prime or not

	public boolean checkPrime(int num) {

		int n=num;
		boolean prime=true;
		if(n<=1) {
			prime = false;
			return prime;
		}else {
			for(int i=2;i<n;i++) {
				if(n%i == 0) {
					prime = false;
					break;
				}
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		
		int num=28;
		Assignment2 ag=new Assignment2();
		boolean prime =ag.checkPrime(num);
		
		if(prime) {
			System.out.println("prime number: "+num);
		}else {
			System.out.println("Not prime number: "+num);
		}
	}
}