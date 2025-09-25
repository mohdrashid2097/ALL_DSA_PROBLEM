package Iterator_MultiThreading_Java;

public class EvenOddUsingTwoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task1 = () ->{
			for(int i=2;i<=10;i+=2) {
				System.out.println("Even: "+i);
			}
		};
		
		Runnable task2 =()->{
			for(int i=1;i<=9;i+=2) {
				System.out.println("Odd: "+i);
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();

	}

}
