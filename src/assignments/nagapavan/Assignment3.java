package assignments.nagapavan;

public class Assignment3 {

	// Write a program to to print Fibonacci Series
	// Ex: 0,1,1,2,3,5,8,13...

	public void printFibonacci(int count) {

		int n1 = 0, n2 = 1, n3;
		if (count <= 2) {
			System.out.println(n1 + " " + n2);
		} else {
			for (int i = 0; i < count; i++) {
				n3 = n1 + n2;
				System.out.println(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		}
	}

	public static void main(String[] args) {
		Assignment3 ag = new Assignment3();
		ag.printFibonacci(20);

	}

}
