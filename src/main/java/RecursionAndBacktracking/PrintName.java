package RecursionAndBacktracking;

public class PrintName {

	void fn(int i, int n) {
		if(i>n)
			return;
		System.out.println("Mohd Rashid");
		fn(i+1,n);
	}
	public static void main(String[] args) {
		
		PrintName pn = new PrintName();
		int n = 3;
		pn.fn(1,n);

	}

}
