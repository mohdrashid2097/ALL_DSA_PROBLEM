package Iterator_MultiThreading_Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IdemotencyServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdempotencyService service = new IdempotencyService();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task = ()->{
			String result = service.execute(
					"Payment123", 
					()-> {
						System.out.println("Payment Processing...");
						try {
							Thread.sleep(3000);
						}
						catch (InterruptedException e) {
							Thread.currentThread().interrupt();
							throw new RuntimeException(e);
						}
						return "Payment Successful";
					}
					);
			
			System.out.println(Thread.currentThread().getName()+" : "+result);
		
		};
		executorService.submit(task);
		executorService.submit(task);
		
		executorService.shutdown();

	}

}
