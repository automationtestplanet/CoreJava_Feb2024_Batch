package colections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Cursors {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		Iterator<Integer> itr1 = arrayList.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ListIterator<Integer> itr3 = arrayList.listIterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		while(itr3.hasPrevious()) {
			System.out.println(itr3.previous());	
		}
	
		Set<String> set1 = new HashSet<>();
		set1.add("Hello");
		set1.add("This");
		set1.add("Is");
		set1.add("Java");
		
		Iterator<String> itr2 = set1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
