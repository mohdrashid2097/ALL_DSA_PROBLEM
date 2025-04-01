package coins;

public class CoinsProblemFindWays {
	
	public static int f(int[] arr, int t, int n) {
		
		if(t==0) return 1;
		if(n==0) return 0;
		if(t < 0)  return 0;
		
		return f(arr,t-arr[n-1],n) + f(arr,t,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int t = 5;
		System.out.println("Total Number of ways: "+f(arr,t,arr.length));
		

	}

}
