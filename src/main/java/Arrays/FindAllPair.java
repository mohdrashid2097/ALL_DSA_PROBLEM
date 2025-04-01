package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
public class FindAllPair {

	public static void allPairs( long a[], long b[], long n, long m, long x) {
        ArrayList<pair> ll = new ArrayList<pair>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i] + b[j] == x) {
					//System.out.println(a[i]+" "+b[j]);
					ll.add(new pair(a[i], b[j]));
				}
			}
		}
		pair[] arr = new pair[ll.size()];
		System.out.println(arr.length);
		System.out.println(ll.toArray(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].first+" "+arr[i].second);
		}
    }
	public static void allPairsOne( long a[], long b[], long n, long m, long x) {
     	
		HashSet<Long> map = new HashSet<Long>();
		for(int i=0;i<n;i++) {
			map.add(a[i]);
		}
		
		for(int i=0;i<m;i++) {
			if(map.contains(x-b[i])) {
				System.out.println((x-b[i])+" "+ b[i]);
			}
		}
		
    }
	
	public static void allPairsTwo( long a[], long b[], long n, long m, long x) {
        ArrayList<pair> ll = new ArrayList<pair>();
		HashSet<Long> ss = new HashSet<Long>();
        for(long i:b) {
        	ss.add(i);
        }
        Arrays.sort(a);
        for(long i:a) {
        	if(ss.contains(x-i)) {
        		ll.add(new pair(i,x-i));
        	}
        }
			
		pair[] arr = new pair[ll.size()];
		System.out.println(arr.length);
		System.out.println(ll.toArray(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].first+" "+arr[i].second);
		}
    }
	public static void main(String[] args) {
		//FindAllPair ob = new FindAllPair();
		long a[] = {1, 2, 4, 5, 7};
		long b[] = {5, 6, 3, 4, 8}; 
		long x = 9;
		//allPairs(a,b,a.length,b.length,x);
		allPairsTwo(a,b,a.length,b.length,x);

	}

}
