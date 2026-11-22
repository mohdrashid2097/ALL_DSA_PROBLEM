package Iterator_MultiThreading_Java;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemoWithAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		
		map.put("A", 20);
		Integer result = map.putIfAbsent("Java", 30);  // return null
		//System.out.println(result);  // return null 
		//System.out.println(map.get("A"));
		
		map.putIfAbsent("Spring", 10);
		//System.out.println(map.get("Spring"));
		
		map.put("sum", 10);
		map.merge("sum", 20, Integer::sum);
		System.out.println("Sum: "+map.get("sum"));

	}
	
//	Summary of atomic methods
//	Method						When does it execute?				Main purpose
//	putIfAbsent()				Key absent							Insert only once
//	replace(key, value)			Key present							Replace existing value
//	replace(key, old, new)		Key and old value match				Conditional update
//	remove(key, value)			Key and value match					Conditional deletion
//	computeIfAbsent()			Key absent							Create value
//	computeIfPresent()			Key present							Update existing value
//	compute()					Always evaluates mapping			Insert/update/remove
//	merge()						Key exists or doesn't exist			Combine values

}
