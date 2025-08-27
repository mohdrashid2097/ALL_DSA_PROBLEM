package LeedCode75Question;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheInBuiltCollection {
	
	private int capacity;
	private LinkedList<Integer> lruList;
	private Map<Integer,Integer> cacheMap;
	
	LRUCacheInBuiltCollection(int capacity){
		this.capacity = capacity;
		this.cacheMap = new HashMap<Integer, Integer>();
		this.lruList = new LinkedList<Integer>();
	}
	
	// this is for updation and insertion opeartion
	void put(int key,int value) {
		if(cacheMap.containsKey(key)) {
			int oldValue = cacheMap.get(key);
			lruList.remove(Integer.valueOf(oldValue));
			
		}
		
		// updating cacheMap with new value
		cacheMap.put(key, value);
		lruList.addFirst(key);
		
		if(cacheMap.size()> capacity) {
			
			// remove least recently used item
			int leastUsedKey = lruList.removeLast();
			cacheMap.remove(leastUsedKey);
		}
		
	}
	
	int get(int key) {
		if(!cacheMap.containsKey(key)) {
			return -1;
		}
		
		// get value from map
		int oldValue = cacheMap.get(key);
		// remove key from lrulist
		lruList.remove(Integer.valueOf(key));
		// add key infront of lruList
		lruList.addFirst(key);
		
		return oldValue;
	}
	
	public static void main(String[] args) {
		LRUCacheInBuiltCollection cache = new LRUCacheInBuiltCollection(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(4));
		System.out.println(cache.get(2));

	}

}
