package StackQueueQuestion;

import java.util.Stack;

public class ValidParenthesis {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch=='(' || ch=='[' || ch=='{') {
				stack.push(ch);
			}
			else {
					if( ch == ')' ) {
						if(stack.isEmpty() || stack.pop() !='(' ) {
							return false;
						}
					}
					if( ch == ']' ) {
						if(stack.isEmpty() || stack.pop() !='[' ) {
							return false;
						}
					}
					if( ch == '}' ) {
						if(stack.isEmpty() || stack.pop() !='{' ) {
							return false;
						}
					}			
			}
		}
		return stack.isEmpty();
    }

	public static void main(String[] args) {
		String str = "()[]{}";
		System.out.println(isValid(str));

	}

}
