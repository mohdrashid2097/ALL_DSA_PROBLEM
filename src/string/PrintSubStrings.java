package string;

public class PrintSubStrings {
	
	static void printSubStrings(String str)
	{
	 
	    // First loop for starting index
	    for (int i = 0; i < str.length(); i++) {
	        String subStr="";
	       
	        // Second loop is generating sub-String
	        for (int j = i; j < str.length(); j++) {
	            subStr += str.charAt(j);
	            System.out.print(subStr +"\n");
	        }
	    }
	}

	public static void main(String[] args) {
		String str = "abcd";
		 printSubStrings(str);

	}

}
