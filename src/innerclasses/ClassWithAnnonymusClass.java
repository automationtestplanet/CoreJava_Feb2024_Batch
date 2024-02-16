package innerclasses;

public class ClassWithAnnonymusClass {
	
	int addition(int a, int b) {
		return 0;
	}

	public static void main(String[] args) {
		
		ClassWithAnnonymusClass cls = new ClassWithAnnonymusClass() {
			int addition(int a, int b) {
				return a+b;
			}			
		};
		
		System.out.println(cls.addition(10000, 20000));
	}

}
