package RecursionAndBacktracking;

public class FibonacciSeries {

	int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		
		int last = fibo(n-1);
		int slast = fibo(n-2);
		
		return last + slast;
		
	}
	public static void main(String[] args) {
		
		int n = 4;
		FibonacciSeries fb = new FibonacciSeries();
		System.out.println(fb.fibo(n));

	}

}
