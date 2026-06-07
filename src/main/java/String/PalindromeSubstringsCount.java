package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PalindromeSubstringsCount {
	
	public static int countPalindromicSubstrings(String s) {
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(helper(s,i,j)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static boolean helper(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	// do not consider duplicate character
	public static int countPalindromicSubstringsWithOutDuplicate(String s) {
		int count=0;
		Map<String,Integer> subFreq = new HashMap<String, Integer>();
		for(int i=0;i<s.length();i++) {
			Set<Character> seen = new HashSet<Character>();
			for(int j=i;j<s.length();j++) {
				char ch = s.charAt(j);
				if(!seen.add(ch)) {
					break;
				}
				if(helper(s,i,j)) {
					count++;
				}
				String sub = s.substring(i,j+1);
				subFreq.merge(sub, 1, Integer::sum);
			}
		}
		System.out.println(subFreq);
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abaab";
		//String s = "abc";
		System.out.println("Total Count: "+countPalindromicSubstrings(s));
		
		//suppose do want to consider duplicate character
		System.out.println("Without Duplicate Character Total Count: "+countPalindromicSubstringsWithOutDuplicate(s));
	}

}
