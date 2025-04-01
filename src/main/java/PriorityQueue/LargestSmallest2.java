package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestSmallest2 {
	
	static void kth_Largest_MaxHeap(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> b-a);
        for(int i=0;i<arr.length;i++) {
        	pq.add(arr[i]);
        }
        System.out.println(pq);
        int f=k-1;
        while(f>0) {
        	pq.remove();
        	f--;
        }
        System.out.println(pq.peek());
    }
	static void kth_Smallest_MinHeap(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		System.out.println(pq);
		int f= k-1;
		while(f>0) {
			pq.remove();
			f--;
		}
		System.out.println(pq.peek());
	}

	public static void main(String[] args) {
		//int a[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
	    int[] a = {7, 10, 4, 3, 20, 15};    
		int n = a.length;
	        int k = 3;
	        kth_Largest_MaxHeap(a,k);
	        System.out.println();
	        kth_Smallest_MinHeap(a, k);
	}

}
