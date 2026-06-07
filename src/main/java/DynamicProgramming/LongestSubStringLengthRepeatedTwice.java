package DynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringLengthRepeatedTwice {
	
	public static String findLongest(String s) {
		
		Map<String, Integer> subFreq = new HashMap();
		String result = "";
		for(int i=0;i<s.length();i++) {
			
			Set<Character> seen = new HashSet<Character>();
			for(int j=i;j<s.length();j++) {
				
				char ch = s.charAt(j);
				if(!seen.add(ch)) {
					break;
				}
				
				String sub = s.substring(i,j+1);
				subFreq.merge(sub, 1, Integer::sum);
			}
		}
		
		for(Map.Entry<String, Integer> entry : subFreq.entrySet()) {
			
			String sub = entry.getKey();
			int count = entry.getValue();
			if(count >=2 && sub.length() > result.length()) {
				result = sub;
			}
			if(count >=2) {
				System.out.println("Key: "+sub+" Value: "+count);
			}
		}
		
		//System.out.println(subFreq);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //String s = "ABCDEFGABEFABCD";
		 String s = "ijklghmavcghpl";
		 System.out.println(findLongest(s));


	}

}
