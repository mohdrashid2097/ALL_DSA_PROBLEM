	package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class UnionIntersection {

	// time coplexity O(m + n) space O(1);
	public static void union(int[] arr1, int m, int[] arr2, int n) {
		List<Integer> ll = new ArrayList<>();
		int i=0,j=0;
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				ll.add(arr1[i]);
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				ll.add(arr2[j]);
				j++;
			}
			else {
				ll.add(arr1[i]);
				i++;
				j++;
			}
		}
		while(i<m) {
			ll.add(arr1[i++]);
		}
		while(j<n) {
			ll.add(arr2[j++]);
		}
		System.out.println(ll);
	}
    
	// time coplexity O(m + n) space O(m*logm +n*logn);
	public static void unionTreeSet(int[] arr1,int[] arr2) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i : arr1) {
			treeSet.add(i);
		}
		for(int i:arr2) {
			treeSet.add(i);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:treeSet) {
			list.add(i);
		}
		System.out.println(list);
	}
	
	// time coplexity O(m + n) space O(m+n);
    public static void unionHashMap(int[] arr1,int[] arr2) {
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	int m = arr1.length;
    	int n = arr2.length;
    	for(int i=0;i<m;i++) {
    		if(map.containsKey(arr1[i])) {
    			map.put(arr1[i], map.get(arr1[i])+1);
    		}
    		else {
    			map.put(arr1[i], 1);
    		}
    	}
    	
    	for(int i=0;i<n;i++) {
    		if(map.containsKey(arr2[i])) {
    			map.put(arr2[i], map.get(arr2[i])+1);
    		}
    		else {
    			map.put(arr2[i], 1);
    		}
    	}
    	ArrayList<Integer> ll = new ArrayList<Integer>();
    	
    	for(int i : map.keySet()) {
    		ll.add(i);
    	}
    	System.out.println(ll);
    	
    	
    }
	
    //===============================InterSection=======================
    public static void interSection(int[] arr1,int[] arr2,int m,int n) {
    	Map<Integer,Integer>  map = new HashMap<Integer, Integer>();
    	for(int i=0;i<m;i++) {
    		if(map.containsKey(arr1[i])) {
    			map.put(arr1[i], map.get(arr1[i])+1);
    		}else map.put(arr1[i], 1);
    	}
    	
    	for(int i=0;i<n;i++) {
    		if(map.containsKey(arr2[i])) {
    			map.put(arr2[i], map.get(arr2[i])+1);
    		}else map.put(arr2[i], 1);
    	}
    	
    	ArrayList<Integer> ll = new ArrayList<Integer>();
    	for(Entry<Integer, Integer> m1 : map.entrySet()) {
    		if(m1.getValue() > 1) ll.add(m1.getKey());
    	}
    	System.out.println(ll);
    	
    }
    
    // complexity O(N*N),,,,O(N)
    public static void interSectionArray(int[] arr1,int[] arr2,int m,int n) {
    	ArrayList<Integer> ll = new ArrayList<Integer>();
    	int count=0;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			if(count == 1) {
    				count--;
    				continue;
    			}
    			if(arr2[i] == arr1[j]) {
    				ll.add(arr2[i]);
    				count++;
    			}
    		}
    	}
    	System.out.println(ll);
    }
    public static void interSectionArrayIndex(int[] arr1,int[] arr2,int m,int n) {
    	ArrayList<Integer> ll = new ArrayList<Integer>();
    	int i=0,j=0;
    	while(i<m && j<n) {
    		if(arr1[i] < arr2[j]) i++;
    		else if(arr2[j] < arr1[i]) j++;
    		else {
    			ll.add(arr1[i]);
    			i++;
    			j++;
    		}
    	}
    	System.out.println(ll);
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 1, 3,3, 4, 5, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3,3, 5, 6};
        union(arr1,arr1.length,arr2,arr2.length);
        //unionTreeSet(arr1,arr2);
        //unionHashMap(arr1,arr2);
        interSection(arr1,arr2,arr1.length,arr2.length);
        //interSectionArray(arr1,arr2,arr1.length,arr2.length);
       // interSectionArrayIndex(arr1,arr2,arr1.length,arr2.length);

	}

}
