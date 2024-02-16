package absraction;

//public class Class3 extends Class1, Class2{

public class Class3 extends Class1 implements Interface1,Interface2{
	
	public static void main(String[] args) {
		Interface1 inf1 = new Class3();
		
		System.out.println(inf1.addition(10, 20));
	}

}
