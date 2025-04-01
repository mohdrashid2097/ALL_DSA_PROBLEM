package Iterator_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FastFail_Iteratos {

	public static void main(String[] args) {
		// This is a example of fast fail iterator in java
		Map<String, Integer> map = new HashMap();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
			// adding content
			map.put("d", 40);  //now we will get concurrentModificationException.
			
		}

	}

}
