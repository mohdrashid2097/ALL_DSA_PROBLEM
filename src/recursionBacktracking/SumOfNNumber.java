package recursionBacktracking;

public class SumOfNNumber {

	void fn(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		fn(i-1,sum+i);
	}
	public static void main(String[] args) {
		
		int n = 3;
		SumOfNNumber sm = new SumOfNNumber();
		sm.fn(n,0);

	}

}
