package PriorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {
	
	//Return the answer sorted by the frequency from highest to lowest. 
	//Sort the words with the same frequency by their lexicographical order.
	
	public static void topKFrequent(String[] words, int k) {
		Map<String,Integer> map = new HashMap<>();
		for(String w:words) {
			map.put(w, map.getOrDefault(w, 0)+1);
		}
		
		List<String> llString = new ArrayList<>(map.keySet());
		llString.sort((w1,w2) ->{
			int diff = map.get(w2) - map.get(w1);
			return diff != 0?diff:w1.compareTo(w2);
		});
		System.out.println("Full List Of String: "+llString);
		System.out.println("Top K Frequent words: "+llString.subList(0, k));
		
	}

	public static void main(String[] args) {
		
		String[] words = {"i","love","leetcode","i","love","coding"};
		int k = 2;
	    topKFrequent(words,k);
	    
	    
		


	}

}
