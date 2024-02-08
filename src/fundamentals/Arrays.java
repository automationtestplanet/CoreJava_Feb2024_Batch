package fundamentals;

public class Arrays {

	public static void main(String[] args) {
//		int a = 10;
		
		int[] arr = {10,20,30,40,50};
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		
//		System.out.println(arr[5]);
		
		System.out.println(".....................Normal For Loop.....................");
		for( int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(".....................Normal For Each / Enhanced Loop.....................");
		for(int eachValue:arr) {
			System.out.println(eachValue);
		}

	}

}
