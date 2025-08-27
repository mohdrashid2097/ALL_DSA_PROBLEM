package Hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
	
	public static List<List<String>> groupAnagrams(String[] arr){
		Map<String,List<String>> map = new HashMap();
		for(String word:arr) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			//add key to map- cleaner and best way
			//map.computeIfAbsent(key, k->new ArrayList()).add(word);
			
			
			//2nd way for above line
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(word);
		}
		
		return new ArrayList(map.values());
	}
	

	public static void main(String[] args) {
		// To group anagrams from the given array ["act", "god", "cat", "dog", "tac"], you can use a HashMap where the key
		//is the sorted characters of each word, and the value is a list of words (anagrams).
		 String[] arr = {"act", "god", "cat", "dog", "tac"};
	        List<List<String>> result = groupAnagrams(arr);
	        System.out.println(result);
	}

}
