package inheritance;

public class College {
	public static final String COLLEGE_NAME = "NRI COLLEGE";
	public static int collegeCode = 12345;
	public static String collegeLocation = "Hyderabad";
	public static final String UNIVERSITY = "JNTUH";

	public void displayCollegeDetails() {
		System.out.println("College Name: " + COLLEGE_NAME);
		System.out.println("College Code: " + collegeCode);
		System.out.println("College Location: " + collegeLocation);
		System.out.println("College University: " + UNIVERSITY);
	}
}
