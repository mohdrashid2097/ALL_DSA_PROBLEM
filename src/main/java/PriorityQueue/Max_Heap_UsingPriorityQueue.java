package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Heap_UsingPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To implement a max-heap in Java using the PriorityQueue class,
		// can use a custom comparator to reverse the natural ordering. Here's an example:
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		maxHeap.add(5);
		maxHeap.add(10);
		maxHeap.add(15);
		maxHeap.add(20);
		maxHeap.add(25);
		System.out.println("Print PQ: "+maxHeap);
		System.out.println("Peek: "+maxHeap.peek());

	}

}
