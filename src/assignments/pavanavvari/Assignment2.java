package assignments.pavanavvari;

public class Assignment2 {
	// Write a reusable program to check the number palindrome or not

	public boolean checkPalindrome(int num) {
		int res = 0, val = num;
		while (val != 0) {
			int i = val % 10;
			res = res * 10 + i;
			val = val / 10;
		}
		if (res == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		// TODO Auto-generated method stub
		if (obj.checkPalindrome(121) == true)
			System.out.println("121 is palindrome...");
		else
			System.out.println("121 is not palindrome..");
	}
}
