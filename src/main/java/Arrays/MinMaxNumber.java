package Arrays;


public class MinMaxNumber {
	
	static void getMinMax(long a[], long n)  
{
    long min = Long.MIN_VALUE;
    long max = Long.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(a[i] > max ){
            max = a[i];
        }
        if( a[i] < min){
            min = a[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
    

}
	static void getMinMaxOne(long a[], long n)  
	{
	    long min = 0, max = 0;
	    
	    if(a[0] > a[1]) {
	    	max = a[0];
	    	min = a[1];
	    }
	    if(a[1] > a[0]) {
	    	max = a[1];
	    	min = a[0];
	    }
	    
	    for(int i=1; i<n; i++){
	        if(a[i] > max ){
	            max = a[i];
	        }
	        if( a[i] < min){
	            min = a[i];
	        }
	    }
	    
	    //System.out.println("Min :"+min);
	    //System.out.println("Max :"+max);
	    

	}

	public static void main(String[] args) {
		 long arr[] = {1000, 11, 445, 1, 330, 3000};
	     long arr_size = 6;
	     getMinMax(arr, arr.length);
	     getMinMaxOne(arr, arr.length);

	}

}
