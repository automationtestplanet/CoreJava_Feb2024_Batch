package colections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList();
		
		System.out.println("-----------------------ArrayList-----------------------");
		System.out.println("Size:"+arrayList.size());		
		System.out.println("Is Empty: "+arrayList.isEmpty());
		
		arrayList.add(false);
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add('A');
		arrayList.add(1000);
		arrayList.add(10.5F);
		arrayList.add(10000);
		arrayList.add(100.594E23);
		arrayList.add("Hello");
		arrayList.add(new ListEx());
		arrayList.add(null);
		arrayList.add(1000);		
		
		System.out.println(arrayList);		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		
		for(Object eachObject:arrayList) {
			System.out.println(eachObject);
		}
		
		System.out.println("Contains 10: "+ arrayList.contains(10));		
		System.out.println("Size:"+arrayList.size());
		System.out.println("Is Empty: "+arrayList.isEmpty());		
		arrayList.clear();
		System.out.println("Size:"+arrayList.size());
		System.out.println("Is Empty: "+arrayList.isEmpty());
		
		System.out.println("-----------------------LinkedList-----------------------");
		List likedList = new LinkedList();
		
		System.out.println("Size:"+likedList.size());		
		System.out.println("Is Empty: "+likedList.isEmpty());
		
		likedList.add(false);
		likedList.add(10);
		likedList.add(100);
		likedList.add('A');
		likedList.add(1000);
		likedList.add(10.5F);
		likedList.add(10000);
		likedList.add(100.594E23);
		likedList.add("Hello");
		likedList.add(new ListEx());
		likedList.add(null);
		likedList.add(1000);		
		
		System.out.println(likedList);		
		System.out.println(likedList.get(0));
		System.out.println(likedList.get(1));
		
		for(Object eachObject:likedList) {
			System.out.println(eachObject);
		}
		
		System.out.println("Contains 10: "+ likedList.contains(10));		
		System.out.println("Size:"+likedList.size());
		System.out.println("Is Empty: "+likedList.isEmpty());		
		likedList.clear();
		System.out.println("Size:"+likedList.size());
		System.out.println("Is Empty: "+likedList.isEmpty());

	}

}
