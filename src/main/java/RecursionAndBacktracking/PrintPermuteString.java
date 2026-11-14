package RecursionAndBacktracking;

public class PrintPermuteString {
	
	public static void findPermutation(String str,StringBuffer res,boolean[] used) {
		
		//base condition
		if(res.length() == str.length()) {
			System.out.println(res+" ");
			return;
		}
		
		//find every possible way to form permutation of given string
		for(int i=0;i<str.length();i++) {
			if(!used[i]) {
				res.append(str.charAt(i));
				used[i] = true;
				findPermutation(str,res,used);
				
				//this is for backtracking to explore other possibilities
				res.deleteCharAt(res.length()-1);
				used[i] = false;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		StringBuffer res  = new StringBuffer();
		boolean[] used = new boolean[str.length()];
		
		findPermutation(str,res,used);

	}

}
