package iostreams;

public class CommandLineArguments {
	
	
//	varargs
	
	static void additon(int ...a) {
		int sum = 0;
		for(int eachNum:a)
			sum+=eachNum;		
		System.out.println(sum);			
	}
	
	
	public static void main(String[] args) {		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		additon(10);
		additon(10,20);
		additon(100,200,300);
		additon(1000,2000,3000,400);
		
	}

}
