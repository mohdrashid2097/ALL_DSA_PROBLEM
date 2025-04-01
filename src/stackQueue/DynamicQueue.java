package stackQueue;

public class DynamicQueue extends CircularQueue{
	public DynamicQueue(){
		super(); // it will call CustomStack constructor
	}
	
	public DynamicQueue(int size){
		super(size); // it will call CustomStack constructor
	}
	
	@Override
	public boolean insert(int item) {
		if(this.isFull()) {
			// double the array size
			int[] temp = new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i] = data[(front + i) % data.length];	
			}
			front = 0;
			end = data.length;
			data = temp;
		}
		// at this point we know array is not full
		return super.insert(item);
	}


	public static void main(String[] args) {
		DynamicQueue queue = new DynamicQueue(5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.display();
		//System.out.println(queue.front());
		//System.out.println(queue.remove());
		//queue.display();

	}

}
