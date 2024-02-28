package colections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollections {

	public static void main(String[] args) {
		
		System.out.println("-----------------------ArrayList-----------------------");
//		List arrayList = new ArrayList();
//		arrayList.add(false);
//		arrayList.add('A');
//		arrayList.add(1000);
//		arrayList.add(10.5F);
//		arrayList.add("Hello");
//		arrayList.add(new ListEx());
//		arrayList.add(null);
//		arrayList.add(1000);
		
//		System.out.println(arrayList.get(4));
//		String str = (String)arrayList.get(4);
//		System.out.println(str);
		
//		int str = (int)arrayList.get(4); // ClassCastException
//		System.out.println(str);
		
//		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> arrayList = new ArrayList<>();
//		arrayList.add(true); // not possible
//		arrayList.add('A'); // not possible
//		arrayList.add("Hello"); // not possible
//		arrayList.add(new GenericCollections()); // not possible
//		arrayList.add(null); // not possible
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(300);
		arrayList.add(40);
		arrayList.add(50);
		
//		String str = (String)arrayList.get(4);
		int int1= arrayList.get(4);
		System.out.println(int1);
		
//		Set<String> set1 = new HashSet<String>();
		Set<String> set1 = new HashSet<>();
		set1.add("Hello");
		set1.add("This");
		set1.add("Is");
		set1.add("Java");
		
		
//		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("First Name", "Ram");
		map1.put("Last Name", "M");
		map1.put("Address", "Hyderabad");
		
		
//		List<GenericCollections> genericCol = new ArrayList<GenericCollections>();
		List<GenericCollections> genericCol = new ArrayList<>();
		genericCol.add(null);
		genericCol.add(new GenericCollections());
		
	}

}
