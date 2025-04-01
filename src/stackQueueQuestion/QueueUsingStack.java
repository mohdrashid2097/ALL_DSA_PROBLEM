package stackQueueQuestion;

import java.util.Stack;
// add efficient
public class QueueUsingStack {
	
	Stack<Integer> first;
	Stack<Integer> second;
	
	public QueueUsingStack() {
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}
	
	public void add(int item) {
		first.push(item);
	}
	public int remove() throws Exception {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int remove = second.pop();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return remove;
	}
	
	public int peek() throws Exception{
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int peek = second.peek();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return peek;
	}
	
	public boolean isEmpty() {
		return first.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		QueueUsingStack qs = new QueueUsingStack();
		qs.add(1);
		qs.add(2);
		System.out.println(qs.remove());
	}

}
