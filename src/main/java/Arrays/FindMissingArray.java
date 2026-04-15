package Arrays;
import java.util.Arrays;
import java.util.Comparator;

public class FindMissingArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2},{1,2,3,4},{1},{1,2,3,4,5,6}};
		System.out.println(arr.length);
		
		Arrays.sort(arr, Comparator.comparingInt(a -> a.length));
		
		int missingLength = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1].length - arr[i].length > 1) {
				missingLength = arr[i].length + 1;
				break;
			}
		}
		
		System.out.println("Missing Length: "+missingLength);
		int[] misArr = new int[missingLength];
		for(int i=0;i<missingLength;i++) {
			misArr[i] = i+1;
		}
		System.out.println("Missing Array: "+Arrays.toString(misArr));
	}
}