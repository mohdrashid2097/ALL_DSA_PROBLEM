package Arrays;


public class MinMaxNumber {
	
	static void getMinMax(int[] arr, int n)  
{
		int min =Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		int secMin = Integer.MIN_VALUE;
		int secMax = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}
			else if(max != secMax && arr[i] > secMax) {
				secMax = arr[i];
			}
			
			if(arr[i] < min) {
				secMin = min;
				min = arr[i];
			}
			else if( min != secMin && arr[i] < secMin) {
				secMin = arr[i];
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("SecMin: "+secMin);
		System.out.println("SecMax: "+secMax);

}
	
	public static void main(String[] args) {
		 int[] arr = {10,12,8,9,11};
	     getMinMax(arr, arr.length);

	}

}
