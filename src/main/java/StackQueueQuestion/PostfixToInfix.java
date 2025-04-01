package StackQueueQuestion;

import java.util.Stack;

public class PostfixToInfix {

	public static boolean isOperator(char c) {
		switch(c) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
		case '%':	
			return true;
		}
		return false;
	}
	public static void convert(String exp) {
		Stack<String> stack = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(isOperator(c)) {
				String op1 = stack.pop();
				String op2 = stack.pop();
				String result = '('+ op2 + c + op1 + ')';
				stack.push(result);
			}
			else {
				stack.push(c+"");
			}
		}
		System.out.println(stack.pop());
	}
	public static void main(String[] args) {
		//String exp = "AB+CD-*";
		String exp = "ab*c+";
	    convert(exp);

	}

}
