package assignments.lakshman;

public class Asignment1 {


		public static void main(String[] args) {
			int num=7;
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			
			if(count==2)
			{
				System.out.println("it is a prime");
			}
			
			else
			{
				System.out.println("it is not a prime");
			}
		}

	}
