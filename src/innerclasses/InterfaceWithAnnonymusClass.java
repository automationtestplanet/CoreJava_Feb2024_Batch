package innerclasses;

public interface InterfaceWithAnnonymusClass {

	int addition(int a, int b);

	public static void main(String[] args) {
		
		//Stubs
		InterfaceWithAnnonymusClass inf = new InterfaceWithAnnonymusClass() {
			@Override
			public int addition(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println(inf.addition(1000, 2000));
	}
}
