package assignments.manoj;

public class Assignment3 {

	// Write a program to to print Fibonacci Series
	// Ex: 0,1,1,2,3,5,8,13...

	public void printFibonacci(int count) {

		int n1 = 0, n2 = 1, n3;

		System.out.print(n1 + " " + n2);

		for (int i = 0; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		int count = 0;
		Assignment3 fn = new Assignment3();
		fn.printFibonacci(count-2);

	}

}
