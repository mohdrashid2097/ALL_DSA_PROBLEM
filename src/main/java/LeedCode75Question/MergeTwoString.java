package LeedCode75Question;

public class MergeTwoString {
	
	 public static String mergeAlternately(String word1, String word2) {
	        String ans = "";
	        int i=0;
	        int j=0;
	        for(i=0;i<word1.length() && i< word2.length();i++){
	            ans = ans+word1.charAt(i)+word2.charAt(i);
	            j++;
	        }
	        while(i<word1.length()) {
	        	ans += word1.charAt(i);
	        	i++;
	        }
	        while(j<word2.length()) {
	        	ans += word2.charAt(j);
	        	j++;
	        }
	        
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String res = mergeAlternately("ab","pqrs");
		System.out.println("Merge String: "+res);

	}

}
