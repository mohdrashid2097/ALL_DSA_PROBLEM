package RecursionAndBacktracking;

public class PrintnNToOneBacktracking {
	
	void fn(int i, int n) {
		if(i>n)
			return;
		
		fn(i+1,n);
		
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int n= 3;
		PrintnNToOneBacktracking pno = new PrintnNToOneBacktracking();
		pno.fn(1,n);
	}


}
