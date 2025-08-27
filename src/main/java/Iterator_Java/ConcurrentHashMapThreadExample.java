package Iterator_Java;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThreadExample {

	public static void main(String[] args) throws InterruptedException {
		//a very simple example of ConcurrentHashMap where two threads update the map at the same time safely.
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		
		// Task for Thread 1: Add/update 1000 times
		Runnable task1 = () ->{
			for(int i=0;i<10;i++) {
				map.merge("Java", 1, Integer::sum);
			}
		};
		
		// Task for Thread 1: Add/update 1000 times
		Runnable task2 = () ->{
			for(int i=0;i<10;i++) {
				map.merge("Java", 1, Integer::sum);
			}
		};
		
		// Start both threads
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		// Both threads safely updated the map
		System.out.println("Final Count: "+map.get("Java"));
		
		
		

	}

}
