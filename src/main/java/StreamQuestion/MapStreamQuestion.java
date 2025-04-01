package StreamQuestion;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamQuestion {

	public static void main(String[] args) {
		
		//Question-1
		Map<String,Integer> m= new HashMap<>();
		m.put("a", 4);
		m.put("c", 6);
		m.put("e", 10);
		
		Map<String, Integer> res = m.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap:: new));
		
		//System.out.println("Based On Value: "+res);
		
		Map<String, Integer> res1 = m.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap:: new));
		
		//System.out.println("Based On key: "+res1);
		
		//Question-2
		Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 30);
        map2.put("Bob", 25);
        map2.put("Charlie", 35);
        map2.put("Diana", 20);
        // Filter entries where the value is greater than 25
        
        Map<String,Integer> res2 =map2.entrySet().stream()
        		.filter(entry->entry.getValue() > 25).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
       // System.out.println("Res2: "+res2);
		
		
		//Question-3
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Bob", 2);
        map3.put("Alice", 5);
        map3.put("Diana", 1);
        map3.put("Charlie", 3);
        
        //sort map based on the key
        Map<String, Integer> res3 = map3.entrySet().stream().sorted((a,b)-> a.getKey().compareTo(b.getKey()))
        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
        
        //System.out.println("Res3: "+res3);
       // res3.forEach((key,value)->System.out.println("key: "+key+" : "+"Value: "+value));
      
		//Question-4
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Alice", 30);
        m1.put("Bob", 20);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("Charlie", 25);
        m2.put("Bob", 15); // Duplicate key
        // Merge two maps
        Map<String,Integer> mergeMap = Stream.concat(m1.entrySet().stream(), m2.entrySet().stream()).collect(Collectors
        		.toMap(Map.Entry::getKey, Map.Entry::getValue,Integer::sum));
        
        
		//Question-5
        Map<String, Integer> max = new HashMap<>();
        max.put("Alice", 30);
        max.put("Bob", 20);
        max.put("Charlie", 50);
        max.put("Diana", 40);

        // Find the max entry by value
        Entry<String,Integer> maxEntry = max.entrySet().stream()
        		.max(Map.Entry.comparingByValue()).orElseThrow(()-> new NoSuchElementException("map is empty:"));
        
        //System.out.println("Max Key: "+maxEntry.getKey()+" "+"Max value: "+maxEntry.getValue());
        
        //find min value
        Entry<String, Integer> minEntry = max.entrySet().stream()
        		.min(Map.Entry.comparingByValue()).orElseThrow(()-> new NoSuchElementException("map is empty:"));
        
        //System.out.println(minEntry);
		
        //Question-6
        Map<String, Integer> map6 = new HashMap<>();
        map6.put("Alice", 30);
        map6.put("Bob", 20);
        map6.put("Charlie", 50);

        // Convert to list of keys
        List<Integer> listOfValue = map6.values().stream().collect(Collectors.toList());
        List<String> listOfKeys = map6.keySet().stream().collect(Collectors.toList());
        //System.out.println(listOfValue);
        //System.out.println(listOfKeys);
        
        //Question-7
        Map<String, Integer> map7 = new HashMap<>();
        map7.put("Alice", 30);
        map7.put("Bob", 30);
        map7.put("Charlie", 50);
        map7.put("Diana", 50);

        // Group by values
        Map<Integer,List<String>> groupByValue = map7.entrySet().stream().collect(Collectors.
        		groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        //System.out.println("Grouping of values: "+ groupByValue);
        //groupByValue.forEach((value,key)-> System.out.println("Value: "+value+" : "+"key: "+key));
        
        //Question-8
         String input = "hello world";
        // Count frequency of each character using hashmap
         Map<Character,Long> freqOfChar = input.chars().mapToObj(c->(char)c).filter((c)->!Character.isWhitespace(c))  //exclude white space
        		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         //System.out.println(freqOfChar);
        
		//Question-9
		//Partition HashMap entries into two groups (e.g., odd and even values)
         Map<String, Integer> map9 = new HashMap<>();
         map9.put("Alice", 30);
         map9.put("Bob", 25);
         map9.put("Charlie", 40);
         map9.put("Diana", 35);

         // Partition the map into even and odd values
         Map<Boolean,List<Map.Entry<String, Integer>>> partitioned = map9.entrySet().stream().
        		 collect(Collectors.partitioningBy(entry -> entry.getValue()%2==0));
         //System.out.println(partitioned.get(true));
         //System.out.println(partitioned.get(false));
         
        //Question-10
         Map<String, Integer> map10 = new HashMap<>();
         map10.put("Alice", 30);
         map10.put("Bob", 50);
         map10.put("Charlie", 40);
         map10.put("Diana", 60);

         // Get top 2 entries by value from map or any datastructure
         Map<String,Integer> topEntry = map10.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue())
        		 .limit(2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap::new));
         //System.out.println(topEntry);
		
         //Question-11
         //Find the first key-value pair that satisfies a condition
         Map<String, Integer> map11 = new HashMap<>();
         map11.put("Alice", 30);
         map11.put("Bob", 20);
         map11.put("Charlie", 50);
         map11.put("Diana", 10);

         // Find the first entry where value > 25
         Entry<String, Integer> firstEntry = map11.entrySet().stream().filter(entry->entry.getValue() > 25).findFirst().orElse(null);
         //System.out.println(firstEntry);
         
         //Calculate the sum or average of values in a HashMap
         int sum = map11.values().stream().mapToInt(Integer::intValue).sum();
         //System.out.println("Sum Of value: "+sum);
         
         Double average = map11.values().stream().mapToInt(Integer::intValue).average().orElse(0);
         //System.out.println("Avarage: "+average);
		
         //Question-13 merger two hashmap into one hashmap
         HashMap<String, Integer> mp1 = new HashMap<>();
         HashMap<String, Integer> mp2 = new HashMap<>();
         mp1.put("A", 10);
         mp1.put("B", 20);
         mp1.put("C", 30);
         mp2.put("B", 40);
         mp2.put("C", 50);
         mp2.put("D", 60);
         Map<String,Integer> resultMergeredMap = Stream.concat(mp1.entrySet().stream(), mp2.entrySet().stream()).
        		 collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,Integer::sum));
         System.out.println("Mergered Two Hashmap into one Map: "+resultMergeredMap);
         
         
		//Question-14
		//Question-15
		

	}

}
