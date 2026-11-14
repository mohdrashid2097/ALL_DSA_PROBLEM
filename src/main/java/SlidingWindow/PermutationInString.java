package SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
	
	public static String sortedItPls(String temp) {
		char[] arr = temp.toCharArray();
		Arrays.sort(arr);
		
		String str = new String(arr);
		return str;
	}
	
	public static boolean solution1(String s1, String s2) {
		
		int n = s1.length();
		int m = s2.length();
		
		String sortedS1 = sortedItPls(s1);
		
		for(int i=0;i<=m-n;i++) {
			
			String temp = s2.substring(i,n+i);
			String sortedS2 = sortedItPls(temp);
			
			if(sortedS1.equals(sortedS2)) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ba";
		String s2 = "eidbaooo";
		
		//simple solution
		System.out.println(solution1(s1,s2));;
		
		// TC - O(m-n)*(nlogn)
		// SC - O(n)

	}

}
