package inheritance;

public class Faculty extends Student {

	public String facultyName;
	public String facultySubject;

//		Faculty(String facultyName, String facultySubject){
//			this.facultyName = facultyName;
//			this.facultySubject = facultySubject;
//		}

	public void displayFacultyDetails() {
		System.out.println("FacultyName: " + facultyName);
		System.out.println("FacultyName: " + facultySubject);
	}
	
	public static void main(String[] args) {		
			Faculty faculty1 = new Faculty();
			faculty1.displayCollegeDetails();
			faculty1.displayStudentDetails();
			faculty1.displayFacultyDetails();
			
//			faculty1.displayAdminDetails(); // Can not access
		
	}

}
