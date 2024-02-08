package fundamentals;

public class StringOperations {

	public static void main(String[] args) {
		
		String str1 = "Hello This Is Java";
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		String[] allWords= str1.split(" ");
		
		for(String eachWOrd:allWords) {
			System.out.println(eachWOrd);
		}
				
		char[] chArr = str1.toCharArray();
		
		for(char eachChar:chArr) {
			System.out.println(eachChar);
		}
		
		System.out.println(str1.length());
		
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.charAt(1));
//		System.out.println(str1.charAt(2));
//		System.out.println(str1.charAt(3));
//		System.out.println(str1.charAt(4));
		
		for(int i= 0; i < str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.indexOf("s"));
		System.out.println(str1.lastIndexOf("s"));
		
		System.out.println(str1.replace('l', 'K'));
		
		System.out.println(str1.replaceAll("l", "M"));
		
		String str2 = "ABCDEFG123456@&**$&@$";
		
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "A"));
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", "A"));

	}

}
