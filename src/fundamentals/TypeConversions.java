package fundamentals;

public class TypeConversions {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int substraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int modDivision(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		
	byte result = (byte)addition(500,500);  // compares size
	
	System.out.println(result);
	
	int a = 100;
	
	float f = a;
	
	System.out.println(f);
	
	float f2 = 100.05F; 
	
	int b = (int)f2; //checks loss of data
	
	System.out.println(b);
	
	
	char ch = 'a';
	
	System.out.println(ch);
	
	int c = ch;
	
	System.out.println(c);
	
	int d = 98;
	
	char ch2 = (char)d;
	
	System.out.println(ch2);
	
	byte byte1 = (byte)130;
	
	System.out.println(byte1);
	
	
//	small to big conversion
	
	byte byte2 = 100;
	short short1 = byte2;
	
	int int1 = byte2;
	int1 = short1;
	
	float float1 = byte2;
	float1 = short1;
	float1 = int1;
	
	long long1 = byte2;
	long1 = short1;
	long1 = int1;
	
	double double1 = byte2;  // Implicit Conversion
	double1 = short1;
	double1 = int1;
	double1 = float1;
	double1 = long1;
	
	
//	bigger to small conversion	
	
	byte2 = (byte)short1; //Explicit Conversion
	
	short1 = (byte)int1;
	short1 = (short)int1;
	
	int1 = (int)long1;
	
//	same size
	
	int1 = (int)float1;
	int1 = (int)double1;
	
	long1 = (long)float1;
	long1 = (long)double1;
	
	
	
	String str1 = "100";
	
	String str2 = "A";
	
	System.out.println(str1);
	
//	int int2 = (int)str1;
	
	TypeConversions typeConversions = new TypeConversions();
	
//	int int3 = (int)typeConversions;
	
//	Primitive to non -primitive (or) Non-Primitive to primitive not possible
	
//	Wrapper classes
	
	int int4 = 100;
	
	Integer int5 = 100;
	
	int5 = int4;
	
	int4 = int5;
	
	
	String str3 = "300";
	
	int int6 = Integer.parseInt(str3);
	
	float float3 = Float.parseFloat(str3);
	
	
	String str4 = "true";
	
	boolean bool2 =  Boolean.parseBoolean(str4);
	System.out.println(bool2);
	
	int int7 = 100;
	
//	String str6  = int7;
	String str6 = String.valueOf(int7);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
