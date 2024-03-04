package other;

public class Class3 {

	String firstName;
	String lastName;

	public Class3 setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Class3 setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public void printFullName() {
		System.out.println(firstName + " " + lastName);
	}

	public static void main(String[] args) {
		new Class1().getFirstName().getLastName().setFirstName("Hello").setLastName("Java").printFullName();
	}

}
