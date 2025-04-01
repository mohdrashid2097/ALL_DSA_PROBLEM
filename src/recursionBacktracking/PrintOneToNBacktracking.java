package recursionBacktracking;

public class PrintOneToNBacktracking {
	
	void fn(int i, int n) {
		if(i<1)
			return;
		fn(i-1,n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int n= 3;
		PrintOneToNBacktracking pno = new PrintOneToNBacktracking();
		pno.fn(3,3);
	}

}
