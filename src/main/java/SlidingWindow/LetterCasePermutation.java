package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
	
	public static void helper(int idx, List<String> ll, StringBuffer res) {
		
		//base condition
		if(idx == res.length()) {
			ll.add(new String(res));
			return;
		}
		
		char ch = res.charAt(idx);
		
		// If character is a number, keep it unchanged
		if(Character.isDigit(ch)) {
			helper(idx+1,ll,res);
			return;
		}
		
		 // Option 1: lowercase
		res.setCharAt(idx, Character.toLowerCase(ch));
		helper(idx+1,ll,res);
		
		// Option 2: uppercase
		res.setCharAt(idx, Character.toUpperCase(ch));
		helper(idx+1,ll,res);
		
		// Backtracking: restore to original character
		res.setCharAt(idx, ch);
	}
	
	public static List<String> letterCasePermutation(String s) {
        List<String> ll = new ArrayList<String>();
        StringBuffer res = new StringBuffer(s);
        helper(0,ll,res);
        return ll;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a1b2";
		
		System.out.println(letterCasePermutation(str));

	}

}
