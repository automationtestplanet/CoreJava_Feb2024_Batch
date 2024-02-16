package innerclasses;

abstract public class AbstratClassWithAnnonymusClass {
	
	abstract public int addition(int a, int b);

	public static void main(String[] args) {
		
		//Stubs
		
		AbstratClassWithAnnonymusClass absCls = new AbstratClassWithAnnonymusClass() {
			@Override
			public int addition(int a, int b) {
				return a+b;
			}			
		};
		
		System.out.println(absCls.addition(10, 20));
	}

}
