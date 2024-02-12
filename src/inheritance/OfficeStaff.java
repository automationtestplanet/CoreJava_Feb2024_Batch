package inheritance;

public class OfficeStaff extends Faculty {

	public static void main(String[] args) {
		OfficeStaff officeStaff1 = new OfficeStaff();
		officeStaff1.displayCollegeDetails();
		officeStaff1.displayStudentDetails();
		officeStaff1.displayFacultyDetails();
		
//		officeStaff1.displayAdminDetails(); // Can not access
	}

}
