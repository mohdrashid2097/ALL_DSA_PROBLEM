package stackQueueQuestion;

import java.util.Stack;

public class InfixtoPrefix {
	
	public static int prec(char c) {
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
	static String reverse(String exp) {
		String str ="";
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			str = c + str;
		}
		return str;
	}

	public static void infixToPre(String exp1) {
		Stack<Character> stack = new Stack<>();
		String exp = reverse(exp1);
		System.out.println("Reverse String Exp1 :"+exp);
		String result = "";
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result += c;
			}
			else if(c =='(') {
				stack.push(c);
			}
			else if(c ==')') {
				while(!stack.isEmpty() && stack.peek() =='(') {
					result += stack.peek();
					stack.pop();
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
					result += stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			result += stack.peek();
			stack.pop();
		}
		System.out.println(result);
		String exp2 = reverse(result);
		System.out.println("Reverse String Exp2 :"+exp2);
		
	}
	public static void main(String[] args) {
		//String exp = "ABC/-AK/L-*";
		String exp = "A*B+C/D";
        infixToPre(exp);

	}

}
