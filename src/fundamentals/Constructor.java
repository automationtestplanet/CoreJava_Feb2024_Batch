package fundamentals;

public class Constructor {

	String sName;
	int rollNo;
	static String collegeName;
	static String qualification;
	
	boolean bool1;
	byte byte1;
	short short1;
	char char1;
	int int1;
	float float1;
	long long1;
	double double1;
	String sting1;
	
	
	Constructor(){
		
	}
	
//	Constructor(){
//		sName = "Ram";
//		rollNo = 123;
//		collegeName = "BVK";
//		qualification = "B.Tech";
//	}
	
//	Constructor(String sName1, int rollNo1, String collegeName1, String qualification1){
//		sName = sName1;
//		rollNo = rollNo1;
//		Constructor.collegeName = collegeName1;
//		Constructor.qualification = qualification1;
//	}
	
	Constructor(String sName, int rollNo, String collegeName, String qualification){
		
		int a = 100;		
		a = a;
		
		this.sName = sName;
		this.rollNo = rollNo;
		Constructor.collegeName = collegeName;
		Constructor.qualification = qualification;
	}
	
	public void displayStudentDetails() {
		System.out.println(this.sName);
		System.out.println(this.rollNo);
		System.out.println(Constructor.collegeName);
		System.out.println(Constructor.qualification);
	}
	
//	public static void displayStudentDetails1() {
//		System.out.println(this.sName);
//		System.out.println(this.rollNo);
//		System.out.println(this.collegeName);
//		System.out.println(this.qualification);
//	}
	
	public void displayDefaultValues() {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(char1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(sting1);
	}
	

	

	public static void main(String[] args) {
		
//		int a;
//		System.out.println(a);

//		Constructor studentConstructor = new Constructor();	
//		studentConstructor.displayStudentDetails();

		Constructor studentConstructor1 = new Constructor("Ram", 123, "BVK","B.Tech");
		studentConstructor1.displayStudentDetails();
		studentConstructor1.sName = "Ram1";
		System.out.println(studentConstructor1.sName);
		System.out.println(studentConstructor1.rollNo);	
		
		System.out.println("-----------------------------------------------------");
		
		Constructor studentConstructor2 = new Constructor("Naresh", 124, "BVK","B.Tech");
		studentConstructor2.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Constructor studentConstructor3 = new Constructor("Shravan", 125, "BVK","B.Tech");
		studentConstructor3.displayStudentDetails();
		
//		student3.collegeName = "NRI";
//		
//		student3.displayStudentDetails();		
//		student1.displayStudentDetails();
//		student2.displayStudentDetails();

	}

}
