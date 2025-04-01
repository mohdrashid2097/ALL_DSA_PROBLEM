package bitManipulation;

public class CountBitAndPetrNCobinationLock {
	
	public static void countBit(int n) {
		int count1=0;
		int count2=0;
		int m = n;
		while(n!=0) {
			n=n&(n-1);
			count1++;
		}
		System.out.println("Count1 :"+count1);
		//2nd approach
		while(m!=0) {
			if((m&1)==1) {
				count2++;
			}
			m =m>>1;
		}
		System.out.println("Count2 :"+count2);
	}

	public static void checKCombinationOfLock(int[] arr) {
		int flag = 0;
		int n = arr.length;
		for(int num=0;num<(1<<n)-1;num++) {
			int sum =0;
			for(int bit = 0; bit<=n-1;bit++) {
				if((num&(1<<bit)) != 0) {
					sum += arr[bit];
					//System.out.println("If Sum1 :"+sum);
				}
				else {
					//System.out.println("Else Sum1 :"+sum);
					sum -= arr[bit];
				}
				//System.out.println("Last Bit");
			}
			System.out.println("Sum :"+sum);
			if(sum%360 == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) System.out.println("Yes");
		else System.out.println("No");
	}
	public static void main(String[] args) {
		//countBit(13);
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,10,10};
		int[] arr3 = {120,120,120};
		//checKCombinationOfLock(arr1);
		//checKCombinationOfLock(arr2);
		//checKCombinationOfLock(arr3);
		System.out.println(0%360);
		System.out.println(-360%360);
		
		
		

	}

}
