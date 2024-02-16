package assignments.pavanavvari;

public class Asignment1 {

	// Write a reusable program to check the number prime or not

	public boolean checkPrime(int num) {
		int ctr=0;
		while(num>=1)
		{
			if(num%2==0)
				ctr++;
			num--;
		}
		if(ctr==2)
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignment1 obj=new Asignment1();
		if(obj.checkPrime(5)==true)
		System.out.println("5 is prime");
		else
			System.out.println("5 is not prime");

	}

}
