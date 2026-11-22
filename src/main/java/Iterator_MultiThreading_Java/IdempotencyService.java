package Iterator_MultiThreading_Java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class IdempotencyService {
	
	private final ConcurrentHashMap<String, CompletableFuture<String>> requestMap = new ConcurrentHashMap<>();
	
	public String execute(String idempotencyKey, Supplier<String> operation) {
		CompletableFuture<String> newFuture = new CompletableFuture<String>();
		
		CompletableFuture<String> existingFuture = requestMap.putIfAbsent(idempotencyKey, newFuture);
		
		// Another request is already processing this key
		if(existingFuture != null) {
			return existingFuture.join();
		}
		
		try {
			String result = operation.get();
			newFuture.complete(result);
			
			return result;
			
		} catch (Exception e) {
			// TODO: handle exception
			newFuture.completeExceptionally(e);
			
			throw e;
		}
		
	}
	
	//Two requests with the same idempotency key can arrive simultaneously. Implement a thread-safe component that ensures the operation 
	//executes only once and both callers receive the same result
	//This is a very common Java concurrency + idempotency interview question, especially in payment systems and e-commerce applications.
//	We need to ensure that:
//		1. Two requests arrive simultaneously with the same idempotency key.
//		2. Only one request executes the actual business operation.
//		3. The second request waits for the first request to complete.
//		4. Both requests receive exactly the same result.
//		5. If the first request fails, both callers receive the same failure.

}
