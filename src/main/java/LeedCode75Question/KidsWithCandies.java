package LeedCode75Question;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(check(candies,extraCandies,i)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }

    public static Boolean check(int[] arr, int ex,int ind){
        Boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[ind]+ex >= arr[i]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> res = kidsWithCandies(candies,extraCandies);
		System.out.println(res);
		//Input: candies = [2,3,5,1,3], extraCandies = 3
		//Output: [true,true,true,false,true]
		//Input: candies = [12,1,12], extraCandies = 10
		//Output: [true,false,true]

	}

}
