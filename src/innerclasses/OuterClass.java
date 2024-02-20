package innerclasses;

public class OuterClass {

	int a;
	static int b;

	void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void substraction(int a, int b) {
		System.out.println(a - b);
	}

	class InnerInstanceClass {
		void method1() {
			System.out.println("Inner Instance Class Method1");
		}
	}

	static class InnerStaticClass {
		static void method2() {
			System.out.println("Inner Static Class Method2");
		}
		
		void method3() {
			System.out.println("Inner Static Class Method3");
		}
	}

	{
		int a = 1000;
		int b = 2000;
		System.out.println(a+b);
		System.out.println("Inner annonymus class");
	}

	static {
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		System.out.println("Inner static block");
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		
		OuterClass.InnerStaticClass.method2();
		OuterClass.InnerStaticClass innStaticCls = new InnerStaticClass();
		innStaticCls.method3();
		
		OuterClass.InnerInstanceClass innInstanceCls =  new OuterClass().new InnerInstanceClass();
		innInstanceCls.method1();
	}

}
