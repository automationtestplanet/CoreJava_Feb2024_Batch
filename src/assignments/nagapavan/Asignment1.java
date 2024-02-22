package assignments.nagapavan;

public class Asignment1 {

	// Write a reusable program to check the string palindrome or not

	
	public static boolean checkPalindrome(String inputString) {
		
		// Initializing an empty string to store the reverse
		//of original inputString
		String rev= "";
		
		for (int i=inputString.length()- 1 ;i >= 0; i--) {
			
			rev =rev+inputString.charAt(i);
		}
		
		// Checking if both the strings are equal
		
		if (inputString.equals(rev)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		//input string
		String inputString="mom";
		
		//converting the lower cases
		inputString =inputString.toLowerCase();
		
		boolean p =checkPalindrome(inputString);
		
		System.out.println(p);
		
		
}
}
