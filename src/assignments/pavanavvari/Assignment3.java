package assignments.pavanavvari;

public class Assignment3 {
	
	//Write a program to to print Fibonacci Series
	//Ex: 0,1,1,2,3,5,8,13...
	int fibo(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return (fibo(n-1)+fibo(n-2));
				
	}
	public static void main(String[] args) {
		
		Assignment3 obj=new Assignment3();
		for(int i=0;i<=10;i++)
			System.out.println(obj.fibo(i));
			

	}

}
