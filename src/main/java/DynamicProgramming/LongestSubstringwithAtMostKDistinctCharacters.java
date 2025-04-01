package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

		//7: Longest Substring with At Most K Distinct Characters:
		//8: Find the longest substring with k unique characters in a given string:


public abstract class LongestSubstringwithAtMostKDistinctCharacters {

	public static void lengthOfLongestSubstringKDistinct(String s, int k) {
		
		Map<Character,Integer> map = new HashMap<>();
		int n = s.length();
		int l=0;
		int r=0;
		int maxLength=-1;
		while(r<n) {
			map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
			
			//while(map.size() > k ) { tc -> O(n)+O(n)+log256
			if(map.size() > k ) {                      // if we if only tc-> O(n)+log256
				map.put(s.charAt(l), map.get(s.charAt(l))-1);
				if(map.get(s.charAt(l))==0 ) map.remove(s.charAt(l));
				l++;
			}
			
			if(map.size() == k) {
				maxLength = Math.max(maxLength, r-l+1);
			}
			
			r++;
		}
		System.out.println("Max Length of subtring at k Dist character: "+maxLength);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcc";
		int k = 1;
		
		lengthOfLongestSubstringKDistinct(s,k);

	}

}
