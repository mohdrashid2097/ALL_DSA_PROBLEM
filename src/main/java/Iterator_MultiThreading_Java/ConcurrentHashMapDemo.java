package Iterator_MultiThreading_Java;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		
		// Task for Thread 1: Add/update 1000 times
				Runnable task1 =()->{
					for(int i=0;i<10;i++) {
						map.merge("Java", 1, Integer::sum);
					}
				};
				
				Runnable task2 =()->{
					for(int i=0;i<10;i++) {
						map.merge("Java", 1, Integer::sum);
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
