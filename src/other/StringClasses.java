package other;
import java.util.StringTokenizer;

public class StringClasses {

	public static void main(String[] args) {
		 
		String str1 = "Java";
		String str2 = "Java";
		
		System.out.println("Str1: "+ str1);
		System.out.println("Str2: "+ str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str2 = "Hello";
		
		System.out.println("Str1: "+ str1);
		System.out.println("Str2: "+ str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		System.out.println(str1.concat(" Is Very Powerfull Languange")); 
		str1 = str1.concat(" Is Very Powerfull Languange");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		
		String str3 = "Hello Java";
		String str4 = new String("Hello Java");
		
		System.out.println("Str3: "+ str3);
		System.out.println("Str4: "+ str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);
		
		System.out.println(str3 == str4.intern()); 
		
		System.out.println(str3.equals(str4));
		System.out.println("------------------------------------------------------------------");
		
		str1 = "Java";
		System.out.println(str1.concat(" Is Very Powerfull Languange")); 
		System.out.println(str1);
		str1 = str1.concat(" Is Very Powerfull Languange");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		StringBuilder strBuild = new StringBuilder("Hello Java");  // Make the string as Mutable
		
			System.out.println(strBuild);
			
			System.out.println(strBuild.hashCode());
			
			System.out.println(strBuild.append(" is a very powerfull language"));
			
			System.out.println(strBuild);
			System.out.println(strBuild.hashCode());
			
			System.out.println(strBuild);
		
		
		StringBuffer strBuffer = new StringBuffer("Hello Java");  // Make the string as Mutable
				
			System.out.println(strBuffer);
			
			System.out.println(strBuffer.hashCode());
			
			System.out.println(strBuffer.append(" is a very powerfull language"));
			
			System.out.println(strBuffer);
			System.out.println(strBuffer.hashCode());
			
			System.out.println(strBuffer);
			
			
		String str = "Hello This is Java";
		String  strArr[] = str.split(" ");
		
		for(String eachStr:strArr)
			System.out.println(eachStr);
		
		StringTokenizer strToekn = new StringTokenizer(str);
		
		while(strToekn.hasMoreTokens()) {
			System.out.println(strToekn.nextToken());
		}
		
		String str5 = "Hello#This#is#Java";
		
		StringTokenizer strToekn2 = new StringTokenizer(str5,"#");
		while(strToekn2.hasMoreTokens()) {
			System.out.println(strToekn2.nextToken());
		}
	}

}
