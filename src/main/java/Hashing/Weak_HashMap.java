package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Weak_HashMap {

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
