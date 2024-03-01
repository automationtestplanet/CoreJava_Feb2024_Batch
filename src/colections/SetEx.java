package colections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		//import all classes ata time, use short cut Ctrl+Shift+O
		System.out.println("-----------------HashSet--------------------");
		Set<Object> hastSet = new HashSet();
		
		System.out.println("Size:"+hastSet.size());		
		System.out.println("Is Empty: "+hastSet.isEmpty());
		
		hastSet.add(false);
		hastSet.add(10);
		hastSet.add(100);
		hastSet.add('A');
		hastSet.add(1000);
		hastSet.add(10.5F);
		hastSet.add(10000);
		hastSet.add(100.594E23);
		hastSet.add("Hello");
		hastSet.add(new ListEx());
		hastSet.add(null);
		hastSet.add(1000);
		
		System.out.println(hastSet);		
//		System.out.println(hastSet.get(0)); // No get method
		for(Object eachObject:hastSet) {
			System.out.println(eachObject);
		}
		
		System.out.println("Contains 10: "+ hastSet.contains(10));		
		System.out.println("Size:"+hastSet.size());
		System.out.println("Is Empty: "+hastSet.isEmpty());		
		hastSet.clear();
		System.out.println("Size:"+hastSet.size());
		System.out.println("Is Empty: "+hastSet.isEmpty());
		
		System.out.println();
		System.out.println("-----------------LinkedHashSet--------------------");
		Set<Object> linkedHashSet1 = new LinkedHashSet();
		
		System.out.println("Size:"+linkedHashSet1.size());		
		System.out.println("Is Empty: "+linkedHashSet1.isEmpty());
		
		linkedHashSet1.add(false);
		linkedHashSet1.add(10);
		linkedHashSet1.add(100);
		linkedHashSet1.add('A');
		linkedHashSet1.add(1000);
		linkedHashSet1.add(10.5F);
		linkedHashSet1.add(10000);
		linkedHashSet1.add(100.594E23);
		linkedHashSet1.add("Hello");
		linkedHashSet1.add(new ListEx());
		linkedHashSet1.add(null);
		linkedHashSet1.add(1000);
		
		System.out.println(linkedHashSet1);		
//		System.out.println(linkedHashSet1.get(0)); // No get method
		for(Object eachObject:linkedHashSet1) {
			System.out.println(eachObject);
		}
		
		System.out.println("Contains 10: "+ linkedHashSet1.contains(10));		
		System.out.println("Size:"+linkedHashSet1.size());
		System.out.println("Is Empty: "+linkedHashSet1.isEmpty());		
		linkedHashSet1.clear();
		System.out.println("Size:"+linkedHashSet1.size());
		System.out.println("Is Empty: "+linkedHashSet1.isEmpty());
		
		System.out.println();
		System.out.println("-----------------TreeSet--------------------");
		Set<Integer> treeSet1 = new TreeSet();
		
		System.out.println("Size:"+linkedHashSet1.size());		
		System.out.println("Is Empty: "+linkedHashSet1.isEmpty());
		
		treeSet1.add(50);
		treeSet1.add(30);
		treeSet1.add(40);
		treeSet1.add(20);
		treeSet1.add(10);
		treeSet1.add(50);		
		
		System.out.println(treeSet1);	
//		System.out.println(treeSet1.get(0)); // No get method
		for(Object eachObject:treeSet1) {
			System.out.println(eachObject);
		}
		
		System.out.println("Contains 10: "+ treeSet1.contains(10));		
		System.out.println("Size:"+treeSet1.size());
		System.out.println("Is Empty: "+treeSet1.isEmpty());		
		treeSet1.clear();
		System.out.println("Size:"+treeSet1.size());
		System.out.println("Is Empty: "+treeSet1.isEmpty());
	}

}
