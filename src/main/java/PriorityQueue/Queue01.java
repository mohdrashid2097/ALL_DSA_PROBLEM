 package PriorityQueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class Queue01 {
	
	public static void validate(String num) {
		if(num.length()>10) {
			throw new IllegalArgumentException("Number length greater than 10");
		}
		if(num.length()<10) {
			throw new IllegalArgumentException("Number less than 10");
		}
		
		for(int i=0;i<num.length();i++) {
			if(Character.isLetter(num.charAt(i))){
				throw new IllegalArgumentException("mobile number contain chracatter");
			}
		}
		
		System.out.println("Mobile number is valid: "+num);
	}

	public static void main(String[] args) {
		
		try {
			//validate("12345678900");
			//validate("12345678");
			validate("123456asfdd");
			validate("1234567890");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());;
		}
	}

}
