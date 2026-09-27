package RecursionAndBacktracking;

public class CoinsProblemFindWays {
	
	//Coin Change Problem — finding the total number of ways to make a target sum using given coin denominations.
	public static int f1(int[] arr, int t, int n) {
		
		if(t==0) return 1;
		if(n==0) return 0;
		if(t < 0)  return 0;
		
		return f(arr,t-arr[n-1],n) + f(arr,t,n-1);
	}
	
	public static int f(int[] arr, int t, int n) {
		if(t == 0) return 1;
		if(n==0) return 0;
		if(t<0) return 0;
		
		int pickSameCoin = f(arr, t-arr[n-1],n);
		int skipCoin = f(arr, t,n-1);
		return pickSameCoin + skipCoin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int t = 5;
		System.out.println("Total Number of ways: "+f(arr,t,arr.length));
		

	}

}
