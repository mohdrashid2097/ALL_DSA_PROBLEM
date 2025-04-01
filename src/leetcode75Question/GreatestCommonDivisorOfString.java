package leetcode75Question;

public class GreatestCommonDivisorOfString {
	
	 public static String gcdOfStrings(String str1, String str2) {
	        String bigger = str1.length()<str2.length()?str2:str1;
	        String smaller = str1.length()<str2.length()?str1:str2;

	        if(bigger.equals(smaller)){
	            return smaller;
	        }
	        if(!bigger.startsWith(smaller)){
	            return "";
	        }

	        return gcdOfStrings(bigger.substring(smaller.length()), smaller);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABAB";
		String str2 = "AB";
		System.out.println(gcdOfStrings(str1,str2));

	}

}
