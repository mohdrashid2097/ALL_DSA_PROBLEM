package String;

import java.util.ArrayList;
import java.util.List;

public class FindAllPalindromicSubSequenceFromString {
	
	public static void findAllPalindromicSubSequence(String s) {
		
		int count = 0;
		List<String> palSubSequence = new ArrayList<String>();
		List<String> allSubSequence = new ArrayList<String>();
		findSubSequence(s,"",allSubSequence);
		
		System.out.println("All SubSequence: "+allSubSequence);
		
		for(String word:allSubSequence) {
			if(isPalindromic(word)) {
				count++;
				palSubSequence.add(word);
			}
		}
		
		System.out.println("Palindromic SubSequence: "+palSubSequence);
		System.out.println("Count: "+count);
	}
	
	public static boolean isPalindromic(String word) {
		
		int i =0;
		int j = word.length()-1;
		while(i<j) {
			if(word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void findSubSequence(String s, String ans, List<String> res) {
		if(s.length() == 0) {
			res.add(ans);
			return;
		}
		
		// take condition
		findSubSequence(s.substring(1), ans+ s.charAt(0), res);
		
		// not take condition
		findSubSequence(s.substring(1),ans, res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
		findAllPalindromicSubSequence(s);

	}

}
