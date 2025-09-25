package Iterator_MultiThreading_Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Thread Pool with 3 thread
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// Defines 3 simple task
		Runnable task1 = () -> System.out.println("Task 1 is running by: "+Thread.currentThread().getName());
		Runnable task2 = () -> System.out.println("Task 2 is running by: "+Thread.currentThread().getName());
		Runnable task3 = () -> System.out.println("Task 3 is running by: "+Thread.currentThread().getName());
		
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		
		executor.shutdown();

	}

}
