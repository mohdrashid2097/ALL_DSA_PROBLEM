package DynamicProgramming;

public class MinPartitionDifference {
	
	static int minDiff = Integer.MAX_VALUE;
	
	public static void findMin(int[] arr,int index ,int currentSum,int totalSum) {
		
		if(index == arr.length) {
			int otherSum = totalSum - currentSum;
			int diff = Math.abs(currentSum - otherSum);
			
			minDiff = Math.min(minDiff, diff);
			
			return;
		}
		
		// take 
		findMin(arr, index+1, currentSum + arr[index], totalSum);
		
		//not take
		findMin(arr,index+1, currentSum, totalSum );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4};
		
		int totalSum = 0;
		for(int el:arr) {
			totalSum +=el;
		}
		
		findMin(arr,0,0,totalSum);
		System.out.println("Minimum Difference = " + minDiff);

	}

}
