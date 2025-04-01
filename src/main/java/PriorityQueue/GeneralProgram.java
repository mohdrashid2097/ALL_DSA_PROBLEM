package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.*;

public class GeneralProgram {
	

	public static void main(String[] args) {
		
		
		Map<String,Integer> m= new HashMap<>();
		m.put("a", 4);
		m.put("c", 6);
		m.put("e", 10);
		System.out.println(m);
		
		Map<String, Integer> res = m.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap:: new));
		
		//System.out.println("Based On Value: "+res);
		
		Map<String, Integer> res1 = m.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap:: new));
		
		//System.out.println("Based On key: "+res1);
		
		
        
             
             
             
	}

}
