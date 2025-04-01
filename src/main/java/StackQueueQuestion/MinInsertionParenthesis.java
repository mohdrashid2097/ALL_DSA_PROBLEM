package StackQueueQuestion;

import java.util.Stack;

public class MinInsertionParenthesis {
	
	public static int minInsertions(String s) {
		Stack<Character> st = new Stack<>();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if ( s.charAt(i) == '(' ) {
                st.push( s.charAt(i) );
                continue;
            }
            // if s[i] is ')'
            if (st.size() > 0)  {
                st.pop();
            } else {
                count++; // missed the '('
            }
            
            // if  s[i+1] is ')', need to skip
            if ( i < s.length()-1 && s.charAt(i+1) == ')' ) {
                i++;
            }else{
            	count++; //missed the ')'
            }
            System.out.println("Hi:"+i);
		}
		
		return count + st.size()*2;

    }

	public static void main(String[] args) {
		//String str = "(()))";
		String str = "))())(";
		System.out.println(minInsertions(str));

	}

}
