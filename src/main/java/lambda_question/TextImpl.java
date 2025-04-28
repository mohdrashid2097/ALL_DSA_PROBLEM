package lambda_question;

public class TextImpl {

	public static void main(String[] args) {
		
		// add two number
		Adder adder =(a,b) -> a+b;
		int result1 = adder.add(5, 10);
		System.out.println("Add two Number: "+result1);
		
		// add three number
		AdderThreeNumber adderThreeNum =(a,b,c) -> a+b+c;
		int result2 = adderThreeNum.addThreeNum(5, 5, 5);
		System.out.println("Add Three Number: "+result2);
		
		// substract two number
		Substractor substract = (a,b) -> a-b;
		int result3 = substract.substract(10, 5);
		System.out.println("Substract Two number: "+result3);

		
		// runnable interface implementation using lambda
		Runnable r =() ->{
			for(int i=0;i<5;i++) {
				System.out.print(i+" ");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		
	}

}
