package LeedCode75Question;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFUCacheInBuiltCollectionOptimize {
		
		private Map<Integer,Integer> counter;
		private Map<Integer,LinkedHashSet<Integer>> freqMap;
		private Map<Integer,Integer> cache;
		private int minFrequency;
		private int capacity;
		
		public LFUCacheInBuiltCollectionOptimize(int capacity) {
			this.counter = new HashMap<Integer, Integer>();
			this.freqMap = new HashMap<Integer, LinkedHashSet<Integer>>();
			this.cache = new HashMap<Integer, Integer>();
			this.minFrequency = 1;
			this.capacity = capacity;
	        
	    }
	    
	    public int get(int key) {
	    	if(!cache.containsKey(key)) {
	    		return -1;
	    	}
	    	
	    	int count = counter.get(key);
	    	counter.put(key, count+1);
	    	
	    	// Remove key from its old frequency bucket
	    	freqMap.get(count).remove(key);
	    	
	    	// If old minimum frequency bucket becomes empty
	    	if(count==minFrequency && freqMap.get(count).size() == 0) minFrequency++;
	    	
	    	// Create new frequency bucket if needed
	    	if(!freqMap.containsKey(count+1)) {
	    		freqMap.put(count+1, new LinkedHashSet<>());
	    	}
	    	
	    	// Add key to new frequency bucket
	    	freqMap.get(count+1).add(key);
	    	
	    	return cache.get(key);
	        
	    }
	    
	    public void put(int key, int value) {
	    	
	    	if(capacity <=0) return;
	    	
	    	// Existing key
	    	if(cache.containsKey(key)) {
	    		cache.put(key, value);
	    		get(key);
	    		return;
	    	}
	    	
	    	// Evict LFU key if cache is full
	    	if(cache.size() >= capacity) {
	    		int evict = freqMap.get(minFrequency).iterator().next();
	    		freqMap.get(minFrequency).remove(evict);
	    		cache.remove(evict);
	    		counter.remove(evict);
	    		
	    		if(freqMap.get(minFrequency).isEmpty()) {
	    			freqMap.remove(minFrequency);
	    		}
	    	}
	    	
	    	//insert new element
	    	cache.put(key, value);
	    	counter.put(key, 1);
	    	
	    	// update minFreqency as well for new element it will always be 1.
	    	minFrequency = 1;
	    	
	    	// Create frequency 1 bucket if it does not exist
	    	freqMap.computeIfAbsent(1, LinkedHashSet::new);
	    	freqMap.get(1).add(key);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LFUCacheInBuiltCollectionOptimize cache = new LFUCacheInBuiltCollectionOptimize(2);
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
