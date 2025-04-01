package LeedCode75Question;

import java.util.*;

public class ReverseVowels {
	 
	public static void reverseVowels(String s) {
	       
	       int j=0;
	       char[] str = s.toCharArray();
	       String vowel = "";
	       for(int i=0;i<str.length;i++){
	           if(vowelFn(str[i])){
	               vowel += str[i];
	               j++;
	           }
	       }
	       for(int i=0;i<str.length;i++){
	           if(vowelFn(str[i])){
	               str[i] = vowel.charAt(--j);
	           }
	       }
	        System.out.println(String.valueOf(str));
	    }
	    public static boolean vowelFn(char c){
	        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||
	        c=='u' || c=='U'){
	            return true;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseVowels("hello");
	}

}
