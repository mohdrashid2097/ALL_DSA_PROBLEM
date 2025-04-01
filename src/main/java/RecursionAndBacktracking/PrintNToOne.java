package RecursionAndBacktracking;

public class PrintNToOne {

	void fn(int i, int n) {
		if(i<1)
			return;
		System.out.println(i);
		fn(i-1,n);
	}
	public static void main(String[] args) {
		
		PrintNToOne pn = new PrintNToOne();
		int n = 3;
		pn.fn(n,n);

	}

}
