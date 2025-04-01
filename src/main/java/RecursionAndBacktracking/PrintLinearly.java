package RecursionAndBacktracking;

public class PrintLinearly {

	void fn(int i, int n) {
		if(i>n)
			return;
		System.out.println(i);
		fn(i+1,n);
	}
	public static void main(String[] args) {
		
		PrintLinearly pn = new PrintLinearly();
		int n = 3;
		pn.fn(1,n);

	}

}
