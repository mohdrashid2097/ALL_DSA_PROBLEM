package Iterator_Java;

import java.util.HashMap;

public class HashMapThreadExample {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Integer> map = new HashMap<>();
		
		// Task for Thread 1: Add/update 1000 times
		Runnable task1 =()->{
			for(int i=0;i<10;i++) {
				map.put("Java", map.getOrDefault("Java", 0)+1); //not atmoic update
			}
		};
		
		Runnable task2 =()->{
			for(int i=0;i<10;i++) {
				map.put("Java", map.getOrDefault("Java", 0)+1); // not atomic update
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final output: "+map.get("Java"));

	}

}
