package stackQueueQuestion;

import java.util.Stack;

public class MinAddToMakeValid {
	
	public static int minAddToMakeValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()) {
        	
        	if(ch == '(') {
        		stack.push(ch);
        	}
        	else {
        		if( ch == ')') {
        			if(!stack.isEmpty() && stack.peek() =='(') {
        				stack.pop();
        			}
        			else {
            			stack.push(ch);
            		}
        		}
        		
        	}
        }
        return stack.size();
        
    }

	public static void main(String[] args) {
		String str = "())";
		System.out.println(minAddToMakeValid(str));
	}

}
