package Iterator_MultiThreading_Java;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemoWithAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		
		map.put("A", 20);
		Integer result = map.putIfAbsent("Java", 30);  // return null
		//System.out.println(result);  // return null 
		//System.out.println(map.get("A"));
		
		map.putIfAbsent("Spring", 10);
		//System.out.println(map.get("Spring"));
		
		map.put("sum", 10);
		map.merge("sum", 20, Integer::sum);
		//System.out.println("Sum: "+map.get("sum"));

		
		ConcurrentHashMap<String, Integer> employees = new ConcurrentHashMap<>();
		

        // 1. putIfAbsent()
        employees.putIfAbsent("Rashid", 50000);
        employees.putIfAbsent("Rashid", 60000);

        System.out.println("1. putIfAbsent: " + employees);


        // 2. computeIfAbsent()
        employees.computeIfAbsent("Amit", key -> 40000);

        System.out.println("2. computeIfAbsent: " + employees);


        // 3. computeIfPresent()
        employees.computeIfPresent(
                "Rashid",
                (key, salary) -> salary + 10000
        );

        System.out.println("3. computeIfPresent: " + employees);


        // 4. compute()
        employees.compute(
                "Rashid",
                (key, salary) -> salary + 5000
        );

        System.out.println("4. compute: " + employees);


        // 5. merge()
        employees.merge(
                "Rashid",
                5000,
                (oldSalary, newSalary) -> oldSalary + newSalary
        );

        System.out.println("5. merge: " + employees);


        // 6. replace()
        employees.replace("Rashid", 80000, 90000);

        System.out.println("6. replace: " + employees);
	
	}
	
//	Summary of atomic methods
//	Method						When does it execute?				Main purpose
//	putIfAbsent()				Key absent							Insert only once
//	replace(key, value)			Key present							Replace existing value
//	replace(key, old, new)		Key and old value match				Conditional update
//	remove(key, value)			Key and value match					Conditional deletion
//	computeIfAbsent()			Key absent							Create value
//	computeIfPresent()			Key present							Update existing value
//	compute()					Always evaluates mapping			Insert/update/remove
//	merge()						Key exists or doesn't exist			Combine values
	
	
	 
	 
	 

}
