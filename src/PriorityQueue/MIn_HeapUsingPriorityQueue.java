package PriorityQueue;

import java.util.PriorityQueue;

public class MIn_HeapUsingPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //A min-heap in Java can be implemented using a PriorityQueue.
		//The default behavior of PriorityQueue in Java is to act as a min-heap, where the smallest element is always at the head of the queue.
		
		//Key Methods:
		//add(E e) or offer(E e): Adds an element to the heap.
		//peek(): Retrieves the smallest element without removing it.
		//poll(): Retrieves and removes the smallest element.
		//isEmpty(): Checks if the heap is empty.
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(25);
		minHeap.add(30);
		
		System.out.println("Peek Element: "+minHeap.peek());
	}

}
