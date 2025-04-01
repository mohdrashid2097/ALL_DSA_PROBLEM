package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	
	static void majorityElement(int a[], int size)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])) {
            	map.put(a[i], map.get(a[i])+1);
            }
            else{
            	map.put(a[i], 1);
            }
        }
        
        for(Entry<Integer, Integer> m:map.entrySet()) {
        	if(m.getValue() > size/2) {
        		System.out.println(m.getKey());
        	}
        }
    }

	public static void main(String[] args) {
		
		int a[] = {3,1,3,3,2}; 
		majorityElement(a,a.length);

	}

}
