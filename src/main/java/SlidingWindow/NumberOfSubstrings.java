package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstrings {
	
	public static int numberOfSubstrings(String s) {
		int n =  s.length();
        int i = 0;
        int j = 0;
        int result = 0;
       int[] freq = new int[3]; //0-a, 1-b, 2-c
        
        while(j<n) {
        	char ch = s.charAt(j);
        	freq[ch-'a']++;
        	
        	while( freq[0] > 0 && freq[1] > 0 && freq[2] > 0 ) {
        		result += (n-j);
        		char ch1 = s.charAt(i);	
        		freq[ch1-'a']--;
        		i++;
        	}
        	
        	j++;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabc";
		
		System.out.println("Number Of SubString: "+numberOfSubstrings(s));

	}

}
