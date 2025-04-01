package recursionBacktracking;

public class PalindromeProgram {

	boolean fn(int i, String s, int n) {
		if(i >= n/2) {
			return true;
		}
		
		if(s.charAt(i) != s.charAt(n-i-1)) {
			return false;
		}
		
		return fn(i+1, s, n);
	}
	
	public static void main(String[] args) {
		PalindromeProgram ra = new PalindromeProgram();
		String s = "MADAM";
		System.out.println(ra.fn(0, s, s.length()));

	}
}
