package assignments.manoj;

public class Asignment1 {

	// Write a reusable program to check the number palindrome or not

	public boolean checkPalindrome(int num) {
		int revNum = 0,reminder;
		int n=num;
		while(n!=0) {
			reminder = n%10 ;
			revNum = revNum*10+reminder;
			n = n/10;		
		
		}
		if(revNum==num){
			
			System.out.println("Given Number : "+num+" - is a Palindrome.");			
			return true;
			
		}else {
			
			System.out.println("Given Number : "+num+" - is not a Palindrome.");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Asignment1 cp = new Asignment1();
		System.out.println(cp.checkPalindrome(575));
	}

}
