package recursionBacktracking;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {
	
	void helper(int ind,int[] arr,int sum,ArrayList<Integer> ans) {
		
		if(ind == arr.length) {
			ans.add(sum);
			return;
		}
		
		//pick the element
		helper(ind + 1,arr,sum + arr[ind],ans);
		
		//not pick the element
		helper(ind +1,arr,sum,ans);
		
	}
	
	ArrayList<Integer> subsetSum(int[] arr){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		helper(0,arr,0,ans);
		Collections.sort(ans);
		return ans;
	}

	public static void main(String[] args) {
		
		SubsetSum1 ss = new SubsetSum1();
		int[] arr = {3,1,2};
		System.out.println(ss.subsetSum(arr));

	}

}
