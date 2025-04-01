package BitManipulation;

public class ReverseNum {
	
	static void reverse(long n) {
		long res = 0;
		long i=31;
		long ans = 0;
		while(n !=0) {
			long bit = n&1;
			res = (long) (bit*Math.pow(10, i) + res);
			ans = ans*10 + bit;
			n = n>>1;
			i--;
		}
		System.out.println(res);
		System.out.println(ans);
		System.out.println("After Reverse the answer");
		
		long rem =0;
		long res1 =0;
		while(ans != 0) {
			rem = ans%10;
			res1 = (long) (rem*Math.pow(2, i) + res1);
			ans = ans/10;
		}
		System.out.println(res1);
		//System.out.println(ans);
	}

	static void reverse1(long n) {
		long res =0;
		for(int i=0;i<32;i++) {
			long bit = n & 1;
			long addbit = bit << (31 - i);
			res = res | addbit;
			
			n = n>>1;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		
		reverse1(1);

	}

}
