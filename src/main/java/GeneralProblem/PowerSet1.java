package GeneralProblem;

import java.util.ArrayList;
import java.util.List;

public class PowerSet1 {

	public static void powerSet(int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> ds;
		int n = arr.length;
		for(int num=0;num<= (1<<n)-1;num++) {
			ds = new ArrayList<Integer>();
			
			for(int bit = 0;bit<=n-1;bit++) {
				if((num & (1<<bit)) > 0) {
					ds.add(arr[bit]);
				}
			}
			ans.add(ds);
			System.out.println(ds);
		}
		System.out.println("Answer :"+ans);
	}
	public static void AllPossibleStrings(String s)
    {
        List<String> a = new ArrayList<>();
        int n = s.length();
        
        for(int num =1; num<=(1<<n)-1; num++){
            String ans =" ";
            
            for(int bit = 0 ; bit <= n-1 ; bit++){
                
                if(( num & (1<<bit) ) > 0){
                    ans +=s.charAt(bit);
                }
            }
            a.add(ans);
        }
        System.out.println(a);
    }
	public static int findXOR(int n) {
		int res =0;
		if(n%4 == 0) res = n;
		if(n%4 == 1) res = 1;
		if(n%4 == 2) res = n+1;
		if(n%4 == 3) res = 0;
		return res;
	}
	public static int findXOR1(int l, int r) {
        int ans = findXOR(r)^findXOR(l-1);
        return ans;
    }
	public static void twoOddNum(int arr[], int n)
    {
		List<Integer> ds = new ArrayList<Integer>();
       for(int i=0;i<n;i++) {
    	   int count=0;
    	   for(int j=0;j<n;j++) {
    		   
    		   if(arr[i] == arr[j]) {
    			   count++;
    		   }
    	   }
    	   if(count == 1) {
			   ds.add(arr[i]);
		   }
       }
       System.out.println(ds);
    }

	public static void twoOddNum1(int arr[], int n)
    {
		List<Integer> ds = new ArrayList<Integer>();
       int xor =0;
       for(int i=0;i<n;i++) {
    	   xor = xor^arr[i];
       }
       
       int count =0;
       while(xor != 0) {
    	   
    	   if((xor&1) != 0) {
    		   break;
    	   }
    	   count++;
    	   xor = xor >> 1;
       }
       System.out.println("Count :"+ count);
       int xor1 = 0,xor2=0;
       for(int i=0;i<n;i++) {
    	   if((arr[i]&(1<<count)) != 0) {
    		   xor1 = xor1^arr[i];
    	   }
    	   else {
    		   xor2 = xor2^arr[i];
    	   }
       }
       System.out.println("xor1 :"+xor1);
       System.out.println("xor2 :"+xor2);
    }
	
public static void countBitsFlip(int a, int b){
        
        int count=0;
        for(int i=0;i<32;i++){
 
            if((a&1) != (b&1)){
                count++;
            }
            if(a == 0 && b==0) break;
            a = a>>1;
            b = b>>1;
        }
        
        System.out.println(count);
    }
	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int[] arr1 = {2,1,2,5,4,1,4,7,3,3};
		//powerSet(arr);
		//AllPossibleStrings("abc");
		//System.out.println(findXOR1(4,8));
		//twoOddNum(arr1,arr1.length);
		//twoOddNum1(arr1,arr1.length);
		countBitsFlip(10,20);

	}

}
