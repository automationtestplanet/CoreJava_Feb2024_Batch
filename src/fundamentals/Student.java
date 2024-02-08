package fundamentals;

public class Student {

	String sName;
	int rollNo;
	static String collegeName;
	static String qualification;
	

	public void displayStudentDetails() {
		System.out.println(sName);
		System.out.println(rollNo);
		System.out.println(Student.collegeName);
		System.out.println(qualification);
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.sName = "Ram";
		student1.rollNo = 123;
		Student.collegeName = "BVK";
		qualification = "B.Tech";
		student1.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Student student2 = new Student();
		student2.sName = "Naresh";
		student2.rollNo = 124;
		Student.collegeName = "BVK";
		Student.qualification = "B.Tech";
		student2.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Student student3 = new Student();
		student3.sName = "Santosh";
		student3.rollNo = 125;
		Student.collegeName = "BVK";
		Student.qualification = "B.Tech";
		
		student3.collegeName = "NRI";
		
		student3.displayStudentDetails();		
		student1.displayStudentDetails();
		student2.displayStudentDetails();

	}

}
