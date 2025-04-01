package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// max heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int a[] = { 7, 10, 4, 3,3, 20, 15,3,3,7,20,7,7,4,4,5};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:a) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(map);
		
		// max heap
		//PriorityQueue<Map.Entry<Integer, Integer>> max_heap = new PriorityQueue<>((a1,b1)->b1.getValue()-a1.getValue());
		//min heap banega
		PriorityQueue<Map.Entry<Integer,Integer>> max_heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			max_heap.add(entry);
		}
		
		System.out.println("Max_Heap: "+max_heap);
		System.out.println("Peek Element: "+max_heap.peek());
	}

}
