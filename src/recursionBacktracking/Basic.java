package recursionBacktracking;

public class Basic {
	
	static int count = 0;
	 static void fn() {
		if(count == 4)
			return;
		System.out.println(count);
		count++;
		fn();
	}

	public static void main(String[] args) {
		
		fn();
		//System.out.println(fn());

	}

}
