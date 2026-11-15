package SlidingWindow;

public class LongestNiceSubarray {
	
	// TC - O(n2) SC - O(1)
	public static int longestNiceSubarrayN2(int[] arr) {
        int result = 0;
        int n = arr.length;
        		
        for(int i=0;i<n;i++) {
        	int mask = 0;
        	for(int j=i;j<n;j++) {
        		if((mask & arr[j]) != 0) {  //doing  AND operation
        			break;
        		}
        		
        		mask |= arr[j];  // doing OR operation
        		result = Math.max(result, j-i+1);
        	}
        }
        return result;
    }
	
	// TC - O(n)
	public static int longestNiceSubarray(int[] arr) {
		int n=arr.length;
		int result = 1;
		int i=0;
		int j=0;
		int mask=0;
		while(j<n) {
			// keep shrinking window
			while( (mask & arr[j]) != 0 ) {
				mask = ( mask ^ arr[i]);
				i++;
			}
			
			result = Math.max(result, j-i+1);
			mask = ( mask | arr[j]);
			j++;
		}
		
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,8,48,10};
		System.out.println("longestNiceSubarrayN2: "+longestNiceSubarrayN2(arr));
		
		System.out.println("longestNiceSubarrayN: "+longestNiceSubarray(arr));

	}

}
