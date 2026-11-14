package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubstringsContaningVowel {
	
	public static boolean isVowel(char ch) {
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}
	
	public static long countOfSubstrings(String word, int k) {
        int n = word.length();
        
        Map<Character,Integer> freq = new HashMap<Character, Integer>();
        
        // preprocesing find index of next consonant
        int[] nextCons = new int[n];
        int lastConIndx = n;
        for(int i=n-1;i>0;i--) {
        	nextCons[i] = lastConIndx;
        	if(!isVowel(word.charAt(i))) { // this is for consonant
        		lastConIndx=i;
        	}
        }
        
        int i = 0;
        int j = 0;
        long count = 0;
        int consCount = 0;
        
        // TC - O(2*n) && SC - O(n)
        while(j<n) {
        	
        	char ch = word.charAt(j);
        	if(isVowel(ch)) {
        		freq.put(ch, freq.getOrDefault(ch, 0)+1);
        	}
        	else {
        		consCount++;
        	}
        	
        	//const must be alway == k not const >k
        	while(consCount > k) {
        		char ch1 = word.charAt(i);
        		if(isVowel(ch1)) {
        			freq.put(ch1, freq.get(ch1)-1);
        			if(freq.get(ch1) == 0) freq.remove(ch1);
        		}
        		else {
        			consCount--;
        		}
        		i++;
        	}
        	
        	// valid window
        	if( i<n && freq.size() == 5 && consCount == k) {
        		int idx = nextCons[j]; // it will tell me the next consonant  after jth index
        		count += idx - j; //most important part of this question
        		
        		// need to increment i so we have to remove character at ith index
        		char ch2 = word.charAt(i);
        		if(isVowel(ch2)) {
        			freq.put(ch2, freq.get( ch2)-1);
        			if(freq.get(ch2) == 0) freq.remove(ch2);
        		}
        		else {
        			consCount--;
        		}
        		
        		// untill it is valid shrink it
        		i++;
        		
        	}
        	j++;
        	
        }
        
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "eoeaui"; 
		int k = 0;
		System.out.println("Count Of Substrings: "+countOfSubstrings(word,k));

	}

}
