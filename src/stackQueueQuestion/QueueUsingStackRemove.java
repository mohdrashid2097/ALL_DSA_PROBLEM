package stackQueueQuestion;

import java.util.Stack;
// add efficient
public class QueueUsingStackRemove {
	
	Stack<Integer> first;
	Stack<Integer> second;
	
	public QueueUsingStackRemove() {
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}
	
	public void add(int item) {
		
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(item);
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
	}
	public int remove() throws Exception {
		return first.pop();
	}
	
	public int peek() throws Exception{
		return first.peek();
	}
	
	public boolean isEmpty() {
		return first.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		QueueUsingStackRemove qs = new QueueUsingStackRemove();
		qs.add(1);
		qs.add(2);
		System.out.println(qs.remove());
		System.out.println(qs.peek());
	}

}
