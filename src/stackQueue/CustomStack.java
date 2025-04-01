package stackQueue;

public class CustomStack {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int ptr = -1;
	
	CustomStack(){
		this(DEFAULT_SIZE);
	}
	CustomStack(int size){
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("Stack is full!!");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
	}

	public boolean isFull() {
		return ptr == data.length -1;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Cannot pop from an empty stack!!");
		}
		int remove = data[ptr];
		ptr--;
		return remove;
	}
	public boolean isEmpty() {
		return ptr == -1;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Cannot peek from an empty stack!!");
		}
		return data[ptr];
	}
	
	public static void main(String[] args) throws Exception {
		CustomStack stack = new CustomStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		System.out.println(stack.push(5));
	}

}
