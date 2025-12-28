package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestAndLowestElemet {

	public static void findHighestLowestElement(int[] arr,int n) {
		Map<Integer,Integer> map = new HashMap<>();
		int count_min=n;
		int count_max=0;
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
			else map.put(arr[i], 1);
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			count_min=Math.min(count_min,m.getValue());
		    count_max=Math.max(count_max,m.getValue());
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			if(m.getValue() == count_min) {
				System.out.print("MinFreElemet :"+m.getKey()+" ");
			}
			if(m.getValue() == count_max) {
				System.out.print("MaxFreElement :"+m.getKey()+" ");
			}
		}
		
		System.out.println();
		System.out.println("Min :"+count_min);
		System.out.println("Max :"+count_max);
	}
	
	public static void findMaxMin(int[] arr,int n) {
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > max) max = arr[i];
			else if(arr[i] < min) min = arr[i];
		}
		System.out.println("Min :"+min+" "+" Max :"+max);
	}
	public static void main(String[] args) {
		int arr[] = { 7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5 };
		int arr1[] = { 7, 8, 8, 4, 4, 1, 1, 7, 7, 2 };
	    int n = arr.length;
	    //findHighestLowestElement(arr, n);
	    findHighestLowestElement(arr1, arr1.length);
	    //findMaxMin(arr,n);

	}

}
