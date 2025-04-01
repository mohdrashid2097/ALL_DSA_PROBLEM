package DynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;

//Longest substring length without repeating character

public class LongestSubstringLength {
	
	public static void lSubsLenght(String s) {
		HashMap<Character,Integer> map =new HashMap<>(); 
		int n = s.length();
		int r=0,l=0;
		int len =0;
		while(r<n) {
			
			if(map.containsKey(s.charAt(r))) {
				l = Math.max(map.get(s.charAt(r))+1,l);
			}
			map.put(s.charAt(r), r);
			r++;
			len = Math.max(r-l, len);
		}
		System.out.println("Longest Length: "+len);
	}
	
	public static void subStringLength(String s) {
		HashSet<Character> set = new HashSet<Character>();
		int l=0;
		int r=0;
		int ans = 0;
		int n = s.length();
		while(l<n && r<n) {
			if(!set.contains(s.charAt(r))) {
				set.add(s.charAt(r));
				r++;
				ans = Math.max(ans, r-l);
			}
			else {
				set.remove(l);
				l++;
			}
		}
		System.out.println("Longest SubString Longest Length: "+ans);
	}

	public static void main(String[] args) {
		String s = "ABCDEFGABEF";
		String s1 = "GEEKSFORGEEKS";
		String s2 = "abcaabcdb";
		lSubsLenght(s);
		//lSubsLenght(s1);
		//lSubsLenght(s2);
		subStringLength(s);

	}

}
