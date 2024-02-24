package arrays;

public class Array_1D {

	public static void main(String[] args) {

		int[] intArr = { 50, 20, 40, 10, 30 };

		int a = 100;
		int b;
		b = 200;

		int[] intArr2 = new int[5];
		intArr2[0] = 100;
		intArr2[1] = 200;
		intArr2[2] = 300;
		intArr2[3] = 400;
		intArr2[4] = 500;
//		intArr2[5] = 600;

		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum = sum + intArr[i];
		}
		System.out.println(sum);
		
		for (int eachValue:intArr ) {
			System.out.println(eachValue);
		}

//		for (int i = 0; i < intArr2.length; i++) {
//			System.out.println(intArr2[i]);
//		}
		
		for (int eachValue:intArr2 ) {
			System.out.println(eachValue);
		}
		
		char[] charArr1 = {'a','1','@'};
		char[] charArr2 = new char[3];		
		charArr2[0] = 'A';
		charArr2[1] = '2';
		charArr2[2] = '#';
		
		for(char eachChar:charArr1) {
			System.out.println(eachChar);
		}
		
		for(char eachChar:charArr2) {
			System.out.println(eachChar);
		}
		
		String[] strArr1 = {"Hello","This","Is","Java"};		
		String[] strArr2 = new String[4];
		strArr2[0] = "Hello";
		strArr2[1] = "This";
		strArr2[2] = "Is";
		strArr2[3] = "Test";
		
		for(String eachString:strArr1) {
			System.out.println(eachString);
		}
		
		for(String eachWord:strArr2) {
			System.out.println(eachWord);
		}
		
		
		Object[] objArr = {true, 100, 'A', "Hello", new Array_1D()};
		for(Object eachObject:objArr) {
			System.out.println(eachObject);
		}
		
	}

}
