package colections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamColllection {

	public static void main(String[] args) {
		
//		Function
//		BiFunction
//		Predicate
//		Consumer
//		Supplier
		
//		Stream.of(10,20,30,40).forEach(eachEle-> System.out.println(eachEle));
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		
		arrayList.stream()
		.filter(eachEle->{if(eachEle%2==1) {return true;}else{return false;}})
		.forEach(eachEle->System.out.println(eachEle));
		
		arrayList.stream().map(eachEle-> eachEle+5).forEach(eachEle->System.out.println(eachEle));
		
		System.out.println(arrayList.stream().reduce(0,(ele1,ele2)-> ele1+ele2));
		
		arrayList.forEach(System.out::println);
	}

}
