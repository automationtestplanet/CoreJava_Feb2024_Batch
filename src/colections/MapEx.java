package colections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		Map hashMap1 = new HashMap();
		System.out.println("--------------------------HashMap--------------------");
		System.out.println(hashMap1.isEmpty());
		System.out.println(hashMap1.size());
		hashMap1.put("First Name", "Ram");
		hashMap1.put("Second Name", "G");
		hashMap1.put("Age", 20);
		hashMap1.put("Qualification", "BTech");
		hashMap1.put("PhoneNumber", 9876543210L);
		hashMap1.put(null, 9876543210L);
		hashMap1.put("Address", null);
		hashMap1.put(1000, 20000);
		
		System.out.println(hashMap1.isEmpty());
		System.out.println(hashMap1.size());
		
		System.out.println(hashMap1);
		System.out.println(hashMap1.get("First Name"));		
		System.out.println(hashMap1.get(null));
		System.out.println(hashMap1.get("Address"));
		
		System.out.println(hashMap1.keySet());
		System.out.println(hashMap1.values());
		for(Object eachObject:hashMap1.entrySet()) {
			System.out.println(eachObject);
		}
		
		System.out.println(hashMap1.containsKey("Address"));
		hashMap1.clear();
		System.out.println(hashMap1.isEmpty());
		System.out.println(hashMap1.size());

		System.out.println();
		System.out.println("--------------------------LinkedHashMap--------------------");
		Map likedHashMap1 = new LinkedHashMap();
		
		System.out.println(likedHashMap1.isEmpty());
		System.out.println(likedHashMap1.size());
		likedHashMap1.put("First Name", "Ram");
		likedHashMap1.put("Second Name", "G");
		likedHashMap1.put("Age", 20);
		likedHashMap1.put("Qualification", "BTech");
		likedHashMap1.put("PhoneNumber", 9876543210L);
		likedHashMap1.put(null, 9876543210L);
		likedHashMap1.put("Address", null);
		likedHashMap1.put(1000, 20000);
		
		System.out.println(likedHashMap1.isEmpty());
		System.out.println(likedHashMap1.size());
		
		System.out.println(likedHashMap1);
		System.out.println(likedHashMap1.get("First Name"));		
		System.out.println(likedHashMap1.get(null));
		System.out.println(likedHashMap1.get("Address"));
		
		System.out.println(likedHashMap1.keySet());
		System.out.println(likedHashMap1.values());
		for(Object eachObject:likedHashMap1.entrySet()) {
			System.out.println(eachObject);
		}
		
		System.out.println(likedHashMap1.containsKey("Address"));
		likedHashMap1.clear();
		System.out.println(likedHashMap1.isEmpty());
		System.out.println(likedHashMap1.size());
		
		System.out.println();
		System.out.println("--------------------------TreeMap--------------------");
		Map treeMap1 = new TreeMap();
		System.out.println(treeMap1.isEmpty());
		System.out.println(treeMap1.size());
		treeMap1.put("First Name", "Ram");
		treeMap1.put("Last Name", "G");
		treeMap1.put("Age", 20);
		treeMap1.put("Qualification", "BTech");
		treeMap1.put("PhoneNumber", 9876543210L);
		treeMap1.put("Address", null);
		
		System.out.println(treeMap1.isEmpty());
		System.out.println(treeMap1.size());
		
		System.out.println(treeMap1);
		System.out.println(treeMap1.get("First Name"));		
		System.out.println(treeMap1.get("Address"));
		
		System.out.println(treeMap1.keySet());
		System.out.println(treeMap1.values());
		for(Object eachObject:treeMap1.entrySet()) {
			System.out.println(eachObject);
		}
		
		System.out.println(treeMap1.containsKey("Address"));
		treeMap1.clear();
		System.out.println(treeMap1.isEmpty());
		System.out.println(treeMap1.size());
		

		System.out.println();
		System.out.println("--------------------------Hashtable--------------------");
		Map hashTable1 = new Hashtable();
		System.out.println(hashTable1.isEmpty());
		System.out.println(hashTable1.size());
		hashTable1.put("First Name", "Ram");
		hashTable1.put("Last Name", "G");
		hashTable1.put("Age", 20);
		hashTable1.put("Qualification", "BTech");
		hashTable1.put("PhoneNumber", 9876543210L);
		
		System.out.println(hashTable1.isEmpty());
		System.out.println(hashTable1.size());
		
		System.out.println(hashTable1);
		System.out.println(hashTable1.get("First Name"));		
		System.out.println(hashTable1.get("Address"));
		
		System.out.println(hashTable1.keySet());
		System.out.println(hashTable1.values());
		for(Object eachObject:hashTable1.entrySet()) {
			System.out.println(eachObject);
		}
		
		System.out.println(hashTable1.containsKey("Address"));
		hashTable1.clear();
		System.out.println(hashTable1.isEmpty());
		System.out.println(hashTable1.size());

	}

}
