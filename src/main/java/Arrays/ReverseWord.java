package Arrays;

public class ReverseWord {
	
	
	//Function to reverse words in a given string.
    public static String reverseWords(String S)
    {
        String ans= "";
        int i=S.length()-1;
        
        while( i >= 0 ){
            while(i>=0 && (S.charAt(i) == '.')) i--;
            int j = i;
        
	        if(i<0) break;
	        
	        while(i>=0 && (S.charAt(i) != '.')) i--;
	        
	        if(ans.isEmpty()){
	            ans = ans.concat(S.substring(i+1,j+1));
	        }
	        else{
	            ans = ans.concat("." + S.substring(i+1,j+1));
	        }
        
      }
        
        return ans;
    }
    
    public static void reversefn() {
    	String s = "I like Kichha";
    		
    }

	public static void main(String[] args) {
		System.out.println(reverseWords("i.like.this.program.very.much"));
		
		reversefn();
	}

}
