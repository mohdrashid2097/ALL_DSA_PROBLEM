package StackQueue;

public class DynamicStack extends CustomStack{
	
	public DynamicStack(){
		super(); // it will call CustomStack constructor
	}
	
	public DynamicStack(int size){
		super(size); // it will call CustomStack constructor
	}
	
	@Override
	public boolean push(int item) {
		if(this.isFull()) {
			// double the array size
			int[] temp = new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i] = data[i];	
			}
			data = temp;
		}
		// at this point we know array is not full
		return super.push(item);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicStack stack = new DynamicStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println(stack.pop());
		
	}

}
