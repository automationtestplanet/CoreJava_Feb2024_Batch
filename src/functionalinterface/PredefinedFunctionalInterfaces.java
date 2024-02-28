package functionalinterface;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
//		Function
		
//		Bi-Function
		
//		Predicate
		
//		Consumer
		
//		Supplier
		
	System.out.println("-----------------------------Function------------------------");	
		Function<String, Integer> fun1 = new Function<>() {
			@Override
			public Integer apply(String t) {
				return 100;
			}
		};		
		System.out.println(fun1.apply("Hello"));
		
		Function<String, Integer> fun2 = (param1)-> {return 1000;};
		System.out.println(fun2.apply("Hello"));
		
		Function<String, Character> fun3 = (param1)-> {return 'A';};
		System.out.println(fun3.apply("Hello"));
		
		
		System.out.println("-----------------------------Bi-Function------------------------");	
		
		BiFunction<String, String, Integer> buFun1 = new BiFunction<String, String, Integer>() {
			@Override
			public Integer apply(String t, String u) {
				return 10000;
			}
		};		
		System.out.println(buFun1.apply("Hello", "Java"));
//		System.out.println(buFun1.apply("Hello"));
		
		BiFunction<String, String, Integer> buFun2 = (param1, param2) -> {return 100000;};
		System.out.println(buFun2.apply("Hello", "Java"));
		
	System.out.println("-----------------------------Predicate------------------------");
		Predicate<Integer> pred1 = new Predicate<>() {
			@Override
			public boolean test(Integer t) {
				return t > 100;
			}
		};		
		System.out.println(pred1.test(10));
		System.out.println(pred1.test(101));
		
		Predicate<Integer> pred2 = (param1)->{return param1 > 100;};
		System.out.println(pred2.test(10));
		System.out.println(pred2.test(101));
		
		Predicate<Integer> pred3 = param1->param1 > 100;
		System.out.println(pred3.test(10));
		System.out.println(pred3.test(101));
		
	System.out.println("-----------------------------Consumer------------------------");	
		Consumer<String> consumer1 = new Consumer<String>() {		
			@Override
			public void accept(String t) {
				System.out.println(t);			
			}
		};
		
		consumer1.accept("Hello");
		Consumer<String> consumer2 = param1 -> System.out.println(param1);
		consumer2.accept("Java");
		
	System.out.println("-----------------------------Supplier------------------------");
	
		Supplier<String> supp1 = new Supplier<>() {
			@Override
			public String get() {
				return "Hello Java";
			}
		};
		System.out.println(supp1.get());
		
		Supplier<String> supp2 = ()-> "Hello this is Java";
		System.out.println(supp2.get());
		
	}

}
