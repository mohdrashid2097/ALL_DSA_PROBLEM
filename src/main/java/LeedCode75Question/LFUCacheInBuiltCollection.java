package LeedCode75Question;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class LFUCacheInBuiltCollection {
	
	private int capacity;
	private HashMap<Integer,Integer> counter;
	private Map<Integer,Integer> cacheMap;
	private LinkedList<Integer> lfuCache;
	
	
	public LFUCacheInBuiltCollection(int capacity) {
		this.capacity = capacity;
		this.counter = new HashMap<Integer, Integer>();
		this.cacheMap = new HashMap<Integer, Integer>();
		this.lfuCache = new LinkedList<Integer>();
        
    }
    
	// this is for updation and insertion opeartion
		void put(int key,int value) {
			if(cacheMap.containsKey(key)) {
				int oldValue = cacheMap.get(key);
				lfuCache.remove(Integer.valueOf(oldValue));
				counter.put(key, counter.get(key)+1);
				
			}
			
			// updating cacheMap with new value
			cacheMap.put(key, value);
			lfuCache.addFirst(key);
			counter.put(key, counter.getOrDefault(key, 0)+1);
			
			if(cacheMap.size()>= capacity) {
				
				// remove least recently used item
				//int leastUsedKey = lfuCache.removeLast();
				//cacheMap.remove(leastUsedKey);
				
				int minFrequenecy = Integer.MAX_VALUE;
				int leastUsedKey = -1;
				for(int keyInList:lfuCache) {
					
					int frequency = counter.get(keyInList);
					if(frequency < minFrequenecy) {
						minFrequenecy = frequency;
						leastUsedKey = keyInList;
					}
				}
				cacheMap.remove(leastUsedKey);
				counter.remove(leastUsedKey);
				lfuCache.remove(Integer.valueOf(leastUsedKey));
			}
			
		}
		
		int get(int key) {
			if(!cacheMap.containsKey(key)) {
				return -1;
			}
			
			// get value from map
			int oldValue = cacheMap.get(key);
			// remove key from lrulist
			lfuCache.remove(Integer.valueOf(key));
			// add key infront of lruList
			lfuCache.addFirst(key);
			
			//update frequency
			counter.put(key, counter.get(key)+1);
			
			
			return oldValue;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LFUCacheInBuiltCollection cache = new LFUCacheInBuiltCollection(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
		cache.put(4, 4);
		System.out.println(cache.get(1));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));

	}

}
