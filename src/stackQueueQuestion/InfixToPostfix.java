package stackQueueQuestion;

import java.util.Stack;

public class InfixToPostfix {
	
	public static int prec(Character c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	public static void infixToPostfix(String exp) {
		String res = new String();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				res += c;
			}
			else if(c == '(') {
				stack.push(c);
			}
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					res += stack.peek();
					stack.pop();
				}
				stack.pop();
				
			}
			else {
				// for all operator
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
					res += stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			res += stack.peek();
			stack.pop();
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
        infixToPostfix(exp);

	}

}
