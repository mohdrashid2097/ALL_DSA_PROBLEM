package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Weak_HashMap {
	
//	🔹 1. Definition
//	Map (like HashMap):
//	A collection of key-value pairs where keys and values are strongly referenced.
//	Keys are not garbage-collected as long as the Map has a reference to them.
//
//	WeakHashMap:
//	A Map implementation that uses weak references for its keys.
//	If a key is no longer used anywhere else in the program, the garbage collector (GC) can automatically remove that entry.

	public static void main(String[] args) {
		// Hashmap
		Map<Object,String> map = new HashMap<Object, String>();
		Object key = new Object();
		map.put(key, "value");
		key = null;
		System.gc();
		System.out.println(map);
		
		//WeakHashmap
		Map<Object,String> map1 = new HashMap<Object, String>();
		Object key1 = new Object();
		map.put(key1, "value");
		key1 = null;
		System.gc();
		System.out.println(map1);

	}

}
