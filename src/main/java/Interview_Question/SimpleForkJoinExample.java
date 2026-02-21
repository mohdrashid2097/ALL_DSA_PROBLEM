package Interview_Question;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SimpleForkJoinExample {
	
	// Task: compute sum of array elements
	public static class SumTask extends RecursiveTask<Integer>{
		private static final int Threshold = 5;
		private int[] arr;
		private int start, end;
		
		public SumTask(int[] arr, int start, int end) {
			this.arr = arr;
			this.start = start;
			this.end = end;
		}
		
		@Override
		protected Integer compute() {
			int length = end - start;
			if(length <= Threshold) {
				int sum = 0;
				for(int i=start;i<end;i++) {
					sum += arr[i];
				}
				return sum;
			}
			
			// split task into two sub tasks
			int mid = start +length/2;
			SumTask leftTask = new SumTask(arr, start, mid);
			SumTask rightTask = new SumTask(arr, mid, end);
			
			// Fork left task (push to worker's deque)
			leftTask.fork();
			// compute right task directly(help reduce overhead)
			int rightResult = rightTask.compute();
			// Join left task result
			int leftResult = leftTask.join();
			
			return leftResult + rightResult;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		ForkJoinPool pool = new ForkJoinPool();
		SumTask task = new SumTask(num, 0, num.length);
		int result = pool.invoke(task);
		
		System.out.println("Sum = "+result);
		

	}

}
