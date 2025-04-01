package stackQueueQuestion;

import java.util.Stack;

public class PrefixToInfix {

	public static boolean isOperator(char c) {
		switch(c) {
			case '+':
			case '-':
			case '*':
			case '^':
			case '/':
			case '%':	
				return true;
		}
		return false;
	}
	public static void convert(String exp) {
		Stack<String> stack = new Stack<>();
		int l = exp.length();
		for(int i = l-1; i>=0; i--) {
			char c = exp.charAt(i);
			if(isOperator(c)) {
				String op1 = stack.pop();
				String op2 = stack.pop();
				String result = '(' + op1 + c + op2 + ')';
				stack.push(result);
			}
			else {
				stack.push(c+ "");
			}
			
		}
		System.out.println(stack.pop());
	}
	public static void main(String[] args) {
		//String exp = "*-A/BC-/AKL";
		String exp = "*+AB-CD";
	    convert(exp);

	}

}
