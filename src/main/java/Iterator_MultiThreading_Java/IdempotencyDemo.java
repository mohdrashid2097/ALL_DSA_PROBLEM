package Iterator_MultiThreading_Java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class IdempotencyDemo {
	
	private static final ConcurrentHashMap<String, CompletableFuture<String>> requestMap = new ConcurrentHashMap<>();
	
	public static String paymentProcess(String idempotencyKey) {
		CompletableFuture<String> newFuture = new CompletableFuture<String>();
		CompletableFuture<String> existFuture = requestMap.putIfAbsent(idempotencyKey, newFuture);
		
		// Duplicate request
		if(existFuture != null) {
			System.out.println("Duplicate request.. waiting....");
			return existFuture.join();
		}
		// First request
		try {
			System.out.println("Payment processing...");
			Thread.sleep(3000);
			
			String result = "Payment Done Successfully...";
			newFuture.complete(result);
			return result;
		}
		catch (Exception e) {
			newFuture.completeExceptionally(e);
			throw new RuntimeException(e);
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task = ()->{
			String result = paymentProcess("Payment123");
			System.out.println(Thread.currentThread().getName()+" : "+result);
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();

	}
	
	
//			4. What have we learned?
//			Concept	     			Purpose
//			ConcurrentHashMap		Thread-safe storage
//			putIfAbsent()			Allows only one thread to register the request
//			CompletableFuture		Holds the result
//			join()					Makes duplicate requests wait
//			complete()				Publishes the result to waiting threads

}
