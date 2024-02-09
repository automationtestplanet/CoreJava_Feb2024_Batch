package fundamentals;

public class InterviewQuestions {

	// Check a number Prime or not
	// number can divide by 1 and itself

	// 2 -> 1, 2
	// 3 -> 1, 3
	// 4 -> 1, 2, 4 - not prime
	// 5 -> 1,5
	// 6 -> 1,2,3,6 - not prime
	// 7, 11, 13, 17, 19
	public static void checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " Prime Number");
		} else {
			System.out.println(num + " Not Prime Number");
		}
	}
	
	public static void printCharactersFromString(String str, String patteren) {
		System.out.println(str.replaceAll(patteren, ""));
	}
	
	public static void gitSumOfNumbersFromString(String str, String patteren) {
		int sum = 0;
		for(char eachChar: str.replaceAll(patteren, "").toCharArray()) {
			sum+= ((int)eachChar)-'0';
		}		
		System.out.println(sum);
	}

	
	public static void printUniqueCharacters(String str){
		for(char eachChar:str.toCharArray()) {
			if(str.indexOf(eachChar) == str.lastIndexOf(eachChar)) {
				System.out.println(eachChar);
			}
		}
	}
	
	public static int printUniqueCharactersCount(String str){
		int count = 0;
		for(char eachChar:str.toCharArray()) {
			if(str.indexOf(eachChar) == str.lastIndexOf(eachChar)) {
				count++;
			}
		}
		return count;
	}
	
	public static void lowerCaseAndUpperCaseLettersCount(String str){
		
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		
		for( char eachChar : str.toCharArray()) {
			int asciiiCode = (int)eachChar;			
			if( asciiiCode >= 65 && asciiiCode <= 90) {
				upperCaseCount++;
			}else if(asciiiCode >= 97 && asciiiCode <= 122) {
				lowerCaseCount++;
			}			
		}		
		System.out.println("LoweCase letters Count: "+lowerCaseCount);		
		System.out.println("UpperCase letters Count: "+upperCaseCount);
		
		
		lowerCaseCount = 0;
		upperCaseCount = 0;
		for( int i =0; i < str.length(); i++) {
			int asciiiCode = (int)str.charAt(i);			
			if( asciiiCode >= 65 && asciiiCode <= 90) {
				upperCaseCount++;
			}else if(asciiiCode >= 97 && asciiiCode <= 122) {
				lowerCaseCount++;
			}			
		}
		
		System.out.println("LoweCase letters Count: "+lowerCaseCount);		
		System.out.println("UpperCase letters Count: "+upperCaseCount);
		
	}
	
	public static void main(String[] args) {

//		checkPrime(6);

		for (int i = 2; i <= 20; i++) {
			checkPrime(i);
		}
		
		String str2 = "ABCDEFGabcdefg123456@&**$&@$"; 
		
		printCharactersFromString(str2,"[^A-Za-z]");
		printCharactersFromString(str2,"[^A-Z]");
		printCharactersFromString(str2,"[^a-z]");
		printCharactersFromString(str2,"[^0-9]");
		printCharactersFromString(str2,"[A-Za-z0-9]");		
		
		gitSumOfNumbersFromString(str2,"[^0-9]");  // o/p -> 21
		
		String str3 = "Java";
		printUniqueCharacters(str3);		
		printUniqueCharactersCount(str3);
		
		String str4 = "kdsviehvendvkhviehgievpehvwndvbewio";
		
		System.out.println(str4.length());
		
		System.out.println(printUniqueCharactersCount(str4));
		
		System.out.println(str4.length()-printUniqueCharactersCount(str4));
		
		
		lowerCaseAndUpperCaseLettersCount("HeLLo ThIs JaVa");
	}

}
