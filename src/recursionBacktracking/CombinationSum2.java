package recursionBacktracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

void combination(int ind, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
		
		if(target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i = ind;i<arr.length;i++) {
			if(i>ind && arr[i] == arr[i-1]) continue;
			if(arr[i] > target) break;
			
			ds.add(arr[i]);
			combination(i +1,arr,target - arr[i], ans, ds );
			ds.remove(ds.size()-1);
		}
		
	}
	
	List<List<Integer>> findCombination(int ind, int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		
		combination(ind,arr,target,ans,new ArrayList<>());
		return ans;
		
	}

	public static void main(String[] args) {
		
		CombinationSum2 cs = new CombinationSum2();
		//int[] arr = {10,1,2,7,6,1,5};
		//int target = 8;
		int[] arr = {1,1,2,3};
		int target = 5;
		System.out.println(cs.findCombination(0,arr,target));

	}
}
