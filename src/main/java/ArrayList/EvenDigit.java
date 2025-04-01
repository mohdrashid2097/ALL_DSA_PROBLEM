package ArrayList;

public class EvenDigit {

	public static void main(String[] args) {
		
		int[] nums = {12,345,4,6,7896,123456};
		
		System.out.println(evenDigit(nums));
	}

	private static int evenDigit(int[] nums) {
		int count = 0;
		for(int n : nums) {
			if(even(n)) {
				count++;
			}
		}		
		return count;
	}

	private static boolean even(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		if(count%2 == 0) {
			return true;
		}
		
		return false;
	}

}
