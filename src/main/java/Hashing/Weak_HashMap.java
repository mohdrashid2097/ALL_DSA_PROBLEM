package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

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
		Map<Object, String> hashMap = new HashMap<>();
        Map<Object, String> weakHashMap = new WeakHashMap();

        Object key1 = new Object();
        Object key2 = new Object();

        hashMap.put(key1, "HashMap Value");
        weakHashMap.put(key2, "WeakHashMap Value");

        key1 = null; // remove strong reference
        key2 = null; // remove strong reference

        System.gc(); // force garbage collection

        System.out.println("HashMap: " + hashMap); 
        System.out.println("WeakHashMap: " + weakHashMap);

	}

}
