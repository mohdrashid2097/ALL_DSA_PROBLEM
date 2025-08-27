package DynamicProgramming;

public class LongestSubstringLenReverseAlphabeticalOrder {
	
	public static void subStringLength(String s) {
	    int l = 0, r = 0;
	    int ans = 0;
	    int n = s.length();

	    while (r < n) {
	        // Check if reverse alphabetical order holds
	        if (r == l || s.charAt(r) <= s.charAt(r - 1)) {
	            ans = Math.max(ans, r - l + 1);
	            r++;
	        } else {
	            // Move left pointer to current position
	            l = r;
	        }
	    }

	    System.out.println("Longest Reverse Alphabetical Substring Length: " + ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subStringLength("dcbaefedc"); // Output: 4

	}

}
