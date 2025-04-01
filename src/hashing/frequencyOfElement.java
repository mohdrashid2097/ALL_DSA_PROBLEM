package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencyOfElement {

	public static void frequencyCount(int arr[], int n, int P)
    {
	   boolean[] visited = new boolean[n];
	   int[] fre = new int[n];
       for(int i=0;i<n;i++) {
    	   if(visited[i] == true) continue;
    	   int count = 0;
    	   for(int j=0;j<n;j++) {
    		   if(arr[i] == arr[j]) {
    			   visited[j] = true;
    			   count++;
    		   }
    	   }
    	   fre[arr[i]-1] = count;
    	   System.out.println(Arrays.toString(fre));
    	   System.out.println(Arrays.toString(visited));
       }
       //System.out.println(Arrays.toString(fre));
     
    }
	public static void frequencyCount1(int[] arr,int n) {
		int[] hash=new int[n];
		Arrays.fill(hash, 0);
		int i=0;
		while(i<n) {
			hash[ arr[i] -1 ]++;
			i++;
		}
		System.out.println(Arrays.toString(hash));
	}
	
	static void printfrequency(int arr[], int n)
    {
        
        for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;
  
        System.out.println("1st Print :"+ Arrays.toString(arr));
        
        for (int i = 0; i < n; i++) {
        	System.out.println(arr[arr[i] % n]+" "+arr[i]%n +"  "+(arr[arr[i] % n] + n));
        	//System.out.println(arr[arr[i] % n]);
        	
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        }
 
        System.out.println("2st Print :"+ Arrays.toString(arr));
        
        for (int i = 0; i < n; i++)
            System.out.print(i + 1 + "->" + arr[i] / n+" ");
    }
	public static void main(String[] args) {
		int[] arr = {2, 3, 2, 3, 5};
		//frequencyCount(arr,arr.length,5);
		//frequencyCount1(arr,arr.length);
		printfrequency(arr,arr.length);

	}

}
