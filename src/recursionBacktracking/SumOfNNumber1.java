package recursionBacktracking;

public class SumOfNNumber1 {
	
	 int fn(int n) {
		if(n==0) {
			return 0;
		}
		return n + fn(n-1);		
	}
	public static void main(String[] args) {
		
		int n = 3;
		SumOfNNumber1 sm = new SumOfNNumber1();
		System.out.println(sm.fn(n));
	}
}
