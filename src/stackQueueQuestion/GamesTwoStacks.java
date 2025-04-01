package stackQueueQuestion;

import java.util.Arrays;

public class GamesTwoStacks {

	public static void twoStack(int[] a,int[] b,int x) {
		System.out.println(helper(a,b,x,0,0)-1);
	}
	public static int helper(int[] a,int[] b,int x,int sum,int count) {
		if(sum > x) {
			return count;
		}
		if(a.length == 0 || b.length == 0) {
			return count;
		}
		
		int firstArray = helper(Arrays.copyOfRange(a, 1, a.length),b,x,sum + a[0],count +1);
		int secondArray = helper(a,Arrays.copyOfRange(b, 1, b.length),x,sum + a[0],count+1);
		
		return Math.max(firstArray, secondArray);
	}
	public static void main(String[] args) {
		int[] a = {4,2,4,6,1};
		int[] b = {2,1,8,5};
		int x = 10;
		twoStack(a,b,x);

	}

}
