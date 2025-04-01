package recursionBacktracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RecursionBasicProblem {
	
	static ArrayList<Long> factorialNumbers1(long N){
        ArrayList<Long> ds = new ArrayList<>();
        //int temp=0;
        long ans =1;
        for(int i=1;i<=N;i++){
            ans = ans*i;
            if(ans > N){
                break;
            }
            ds.add(ans);
        }
        return ds;
    }

	static ArrayList<Long> factorialNumbers2(long N){
		ArrayList<Long> ds = new ArrayList<Long>();
		for(long i=1; i<=N;i++) {
			long ans = factorialSolution(i);
			if(ans > N) break;
			ds.add(ans);
		}
		return ds;
	}
	static long factorialSolution(long N){
		if(N < 1) return 1;
		return N*factorialSolution(N-1);
        
      }
	
	static int isPalindrome(String S) {
        int n = S.length();
        return solution(S,n,0);
    }
	static int solution(String S,int n, int i) {
		if(i >= n/2) return 1;
		if(S.charAt(i) != S.charAt(n-i-1)) return 0;
		return solution(S,n,i+1);  
	}
	
	static int fibpnacciSolution2(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fibpnacciSolution2(n-2) + fibpnacciSolution2(n-1);
		}
	}
	static void fibpnacciSeries1(int n) {
		for(int i=1;i<n;i++) {
			int ans = fibpnacciSolution2(i);
			System.out.print(ans+" ");
		}
	}
	
	static int fibpnacciSolution22(int n) {
		if(n<=1) return n;
		int last = fibpnacciSolution22(n-1);
		int slast = fibpnacciSolution22(n-2);
		return last + slast;
	}
	static void fibpnacciSeries12(int n) {
		int[] arr = new int[n];
		for(int i=1;i<=n;i++) {
			int ans = fibpnacciSolution22(i);
			arr[i-1] = ans;
			System.out.print(ans+" ");
		}
		System.out.println();
		System.out.println("Array :"+Arrays.toString(arr));
	}
	
	public static void printFibb1(int n) {
		int x = 0, y=1, next =0;
		if(n<1) {
			return;
		}
		System.out.print(x+" ");
		for(int i=1;i<=n;i++) {
			System.out.print(y+" ");
			next = x + y; //1
			x = y;
			y = next;
		}
	}
	
	public static void printFibb2(int n) {
		if(n<1) {
			return;
		}
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		System.out.println("Arrays :"+ Arrays.toString(arr));
	}
	public static void main(String[] args) {
		//System.out.println(factorialNumbers1(100));
		//System.out.println(factorialNumbers2(200));
		//System.out.println(isPalindrome("ABC"));
		//fibpnacciSeries1(10);
		//fibpnacciSeries12(10);
		printFibb1(10);
		System.out.println();
		printFibb2(10);

	}

}
