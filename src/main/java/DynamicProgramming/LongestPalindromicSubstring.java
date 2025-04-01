package DynamicProgramming;

public class LongestPalindromicSubstring {
	
	public static boolean isPalindrome(String s, int i,int j){
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void longestPalindrome(String s) {
        int maxlength = 0;
        int start=0;
        int end =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1) > maxlength){
                        maxlength = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        //return s.substring(start,end + 1);
        System.out.println("Longest Palindromic Substring: "+s.substring(start,end + 1));
        System.out.println("lenth: "+maxlength);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestPalindrome("babad");

	}

}
