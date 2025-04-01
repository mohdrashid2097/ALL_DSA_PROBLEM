package recursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {
	
	void printsubsequence(int ind, ArrayList<Integer> ll, int[] arr, int n) {
		
		if(ind == n) {
			System.out.println(ll);
			return;
		}
		
		// take or pick the particular index into the subsequence
		ll.add(arr[ind]);
		
		printsubsequence(ind + 1, ll, arr, n);
		
		ll.remove(ll.size()-1);
		
		//not pick or not take , this element is not added to the subsequence
		printsubsequence(ind + 1, ll, arr, n);
		
		
	}

	
	// this is to for to add all subset in arraylist
	//============================================================================
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  res = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        generateSubsets(0,ll,res,nums,nums.length);
        return res;
    }

    public void generateSubsets(
        int ind,List<Integer> ll,List<List<Integer>> res,int[] nums,int n){

            if(ind == n){
                res.add(new ArrayList(ll));
                return;
            }

            ll.add(nums[ind]);
            generateSubsets(ind+1,ll,res,nums,n);
            ll.remove(ll.size() - 1);
            generateSubsets(ind+1,ll,res,nums,n);

    }
    
    //=============================================================================
	public static void main(String[] args) {
	
		ArrayList<Integer> ll = new ArrayList<Integer>();
		PrintAllSubsequence ps = new PrintAllSubsequence();
		int[] arr = {3,1,2};
		//System.out.println(arr.length);
		ps.printsubsequence(0,ll,arr,3);
		

	}

}
