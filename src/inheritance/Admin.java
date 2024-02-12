package inheritance;

public class Admin extends Faculty {
	public String adminName;

//	Admin(String adminName){
//		this.adminName = adminName;
//	}

	public void displayAdminDetails() {
		System.out.println(adminName);
	}

	public static void main(String[] args) {
		Admin admin1 = new Admin();

		admin1.displayCollegeDetails();
		admin1.displayStudentDetails();
		admin1.displayFacultyDetails();
		admin1.displayAdminDetails();

	}
}
