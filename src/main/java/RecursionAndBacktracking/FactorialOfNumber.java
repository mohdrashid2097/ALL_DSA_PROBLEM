package RecursionAndBacktracking;

public class FactorialOfNumber {
	
	 int fn(int n) {
			if(n==1) {
				return 1;
			}
			return n*fn(n-1);		
		}
		public static void main(String[] args) {
			
			int n = 5;
			FactorialOfNumber sm = new FactorialOfNumber();
			System.out.println(sm.fn(n));
		}

}
