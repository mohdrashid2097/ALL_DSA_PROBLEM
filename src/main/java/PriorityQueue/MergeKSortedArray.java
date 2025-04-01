package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {
	
	 static class Data implements Comparable<Data>{
		
		int value;
		int aPosition;
		int valPosition;
		
		Data(int value, int aPosition, int valPosition ){
			this.value = value;
			this.aPosition = aPosition;
			this.valPosition = valPosition;
		}

		@Override
		public int compareTo(Data o) {
			if(this.value < o.value) {
				return -1;
			}
			else {
				return 1;
			}
		}
		
	}

	public static void mergeKArrays(int[][] arr, int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		PriorityQueue<Data> pq = new PriorityQueue<Data>();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(new Data(arr[i][0],i,0));
		}
		
		while(!pq.isEmpty()) {
			Data curr = pq.poll();
			res.add(curr.value);
			int ap = curr.aPosition;
			int vp = curr.valPosition;
			if(vp+1 < (arr[ap].length)) {
				pq.add(new Data(arr[ap][vp+1],ap,vp+1));
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		 int[][] arr = { { 2, 6, 12 },
                         { 1, 9 },
                         { 23, 34, 90, 2000 }
                       };
		 mergeKArrays(arr, arr.length);	 

	}

}
