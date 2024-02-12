package inheritance;

public class Student extends College {
	public String studentName;
	public String studntClass;
	public int studentRollNo;

//	Student(String studentName, String studntClass, int studentRollNo){
//		this.studentName = studentName;
//		this.studntClass = studntClass;
//		this.studentRollNo =studentRollNo;
//	}

	public void displayStudentDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Class: " + studntClass);
		System.out.println("Student ROll Number: " + studentRollNo);
	}
	
	public static void main(String[] args) {		
		Student student1 = new Student();
		student1.displayCollegeDetails();
		student1.displayStudentDetails();
		
//		student1.displayFacultyDetails();   // Can not access
		
//		faculty1.displayAdminDetails(); // Can not access
	
}

}
