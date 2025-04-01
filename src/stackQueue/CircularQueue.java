package stackQueue;

public class CircularQueue {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int end = 0;
	int front = 0;
	int size = 0;
	
	public CircularQueue(){
		this(DEFAULT_SIZE);
	}
	public CircularQueue(int size){
		this.data = new int[size];
	}
	
	public boolean isFull() {
		return size == data.length;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		data[end++] = item;
		end = end % data.length;
		size++;
		return true;
	}
	public int remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int remove = data[front++];
		front = front % data.length;
		size--;
		return remove;
		
	}
	public int front() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		return data[front];
	}
	public void display() {
//		for(int i=front;i<data.length;i++) {
//			System.out.print(data[i]+" ");
//		}
//		System.out.println("End!");
		
		if(isEmpty()) {
			System.out.println(" Queue is empty");
			return;
		}
		int i = front;
		do {
			System.out.print(data[i]+" ");
			i++;
			i = i % data.length;
		}while(i != end);
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue(5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.display();
		System.out.println(queue.front());
		System.out.println(queue.remove());
		queue.display();

	}

}
