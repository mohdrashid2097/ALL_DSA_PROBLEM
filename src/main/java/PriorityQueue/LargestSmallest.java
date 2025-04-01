package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestSmallest {
	
	static void kLargest(int a[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++) {
        	pq.add(a[i]);
        	if(pq.size()>k) {
        		pq.poll();
        	}
        }
        while(!pq.isEmpty()) {
        	System.out.print(pq.peek()+" ");
        	pq.poll();
        }
    }
	static void kSmallest(int a[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (b,c) -> c-b );
		for(int i=0;i<n;i++) {
			pq.add(a[i]);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");
			pq.poll();
		}
	}

	public static void main(String[] args) {
		//int a[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
	    int[] a = {12, 5 ,787, 1, 23};    
		int n = a.length;
	        int k = 2;
	        //kLargest(a, n, k);
	        System.out.println();
	        kSmallest(a, n, k);
	}

}
