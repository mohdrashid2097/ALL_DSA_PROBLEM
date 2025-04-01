package Arrays;

public class FindMaxOne {
	
	 static void findZeroes(int arr[], int n, int m) {
	        
	        
	        int maxLength=0;
	        int j=0;
	        for(int i=0;i<n;i++){
	            int count =0;
	        	for(j=i;j<n;j++) {
	        		
	        		if(arr[j] == 0) count++;
	        		if(count > m) break;
	        	}
	        	maxLength = Math.max(maxLength, j-i);
	        	
	        }
	        System.out.println(maxLength);
	    }

	 static void findZeroes1(int arr[], int n, int m) {
		 int one=0,zeros=0;
		 int res =0;
		 int l=0,r=0;
		 while(r<n) {
			 if(arr[r] ==0) zeros++;
			 else one++;
			 while(l<r && zeros > m) {
				 if(arr[l] ==0) zeros--;
				 else one--;
				 l++;
			 }
			 r++;
			 res = Math.max(res, r-l);
		 }
		 
		 System.out.println(res);
		 
	 }
	 public static void main(String[] args) {
		int n = 3;
		int arr[] = {1, 0, 1};
		int m = 1;
		findZeroes1(arr,n,m);
		int n1 = 11;
		int arr1[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int m1 = 2;
		findZeroes1(arr1,n1,m1);

	}

}
