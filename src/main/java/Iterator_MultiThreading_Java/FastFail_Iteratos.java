package Iterator_MultiThreading_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FastFail_Iteratos {

	public static void main(String[] args) {
		// This is a example of fast fail iterator in java
		//Map<String, Integer> map = new HashMap();
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		Runnable r1 =()->{
			
				for(Map.Entry<String, Integer> entry : map.entrySet()) {
					System.out.println(entry.getKey()+" : "+entry.getValue());
				}
		};
		
		Runnable r2 =()->{
			map.put("D", 40);
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
//		// This is the example of ConcurrentHashMap
//		ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<String, Integer>();
//		cmap.put("A", 1);
//		cmap.put("B", 2);
//		cmap.put("C", 3);
//		Iterator<Map.Entry<String, Integer>> itr = cmap.entrySet().iterator();
//		while(itr.hasNext()) {
//			Map.Entry<String, Integer> entry = itr.next();
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//			cmap.put("D", 4);
//		}
//		System.out.println(cmap);

	}

}
