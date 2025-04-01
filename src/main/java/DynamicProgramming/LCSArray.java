package DynamicProgramming;

public class LCSArray {
	
	public static int f(int ind,int prev_ind, int[] arr, int n) {
		if(ind == n) return 0; //base condition
		int len = 0 + f(ind+1,prev_ind,arr,n); // not pick condition
		if(prev_ind == -1 || arr[ind] > arr[prev_ind]) {  // pick condition
			len = Math.max(len,1+ f(ind+1,ind,arr,n));
		}
		return len;
	}
	
	public static int fMemoization(int ind, int prev_ind,int[] arr,int n,int[][] dp) {
		if(ind == n) return 0;
		if(dp[ind][prev_ind+1] != -1) {
			return dp[ind][prev_ind+1];
		}
		int len = 0 + fMemoization(ind+1, prev_ind,arr,n,dp);  // not pick condition
		if(prev_ind == -1 || arr[ind] > arr[prev_ind]) {      // take
			len = Math.max(len, 1+ fMemoization(ind+1,ind,arr,n,dp));
		}
		return dp[ind][prev_ind+1] = len;
		
	}
	
	public static void fTabulation(int[] arr,int n) {
		int[][] dp = new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j] = 0;
			}
		}
		
		for(int ind=n-1;ind>=0;ind--) {
			for(int prev = ind-1;prev>=-1;prev--) {
				int len = 0 + dp[ind+1][prev+1];  //not take
				if(prev == -1 || arr[ind] > arr[prev]) {   // take 
					len = Math.max(len, 1+ dp[ind+1][ind+1]);
				}
				dp[ind][prev+1] = len;
			}
		}
		System.out.println("fTabulation :"+dp[0][-1+1]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,11,1,6,8};
		int n= arr.length;
		int lenRes = f(0,-1,arr,n);
		System.out.println(lenRes);
		
		//Using Memoization technique
		int[][] dp = new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j] = -1;
			}
		}
		int lenResMemo = fMemoization(0,-1,arr,n,dp);
		System.out.println(lenResMemo);
		
		// tabulation way
		fTabulation(arr,n);
		
	}

}
