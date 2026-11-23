package Iterator_MultiThreading_Java;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicInteger count = new AtomicInteger(1);
		for(int i=1;i<=10;i++) {
			System.out.println("Atomic Update: "+count.getAndIncrement());
			//count.incrementAndGet();
		}
	}
}