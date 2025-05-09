package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
	
	public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return nums.length;
        }
        if(nums.length == 1){
            return nums.length;
        }
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length-1];

        return j;            
    }
	
	//using hashset
	public static void removeDuplicatesHashSet(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		int indx=0;
		for(int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
				arr[indx++] = arr[i];
			}
		}
		System.out.println(hs+" : len -> :"+hs.size());
		System.out.println("Length : "+indx);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,2,2,3,3,3,5};
		int len = removeDuplicates(nums);
		System.out.println("Length of sorted array: "+len);
		int[] arr = {2,2,2,3,3,3,5};
		removeDuplicatesHashSet(arr);
		
		
	}

}
