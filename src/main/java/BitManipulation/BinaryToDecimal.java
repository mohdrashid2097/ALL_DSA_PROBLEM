package BitManipulation;

public class BinaryToDecimal {
	
	static void evenlyDivides(int n){
      
		int ans = 0;
		int i = 0;
		int num = n;
		int rev=0;
		while(n != 0) {
			int bit = n & 1;
			ans = (int) (bit*Math.pow(10, i) + ans);
			n = n >> 1;
			i++;
		}
		System.out.println("Binary form "+ans);
		
		int j = 0;
		int res = 0;
		while(ans != 0) {
			//int bit = num & 1;
			int digit = ans % 10;
			if(digit == 1) {
				res = res +(int) (Math.pow(2, j));
						
			}
			ans = ans/10;
			j++;
		}
		System.out.println("Result " + res);
		
       
    }

	public static void main(String[] args) {
		evenlyDivides(1);
		evenlyDivides(11);
		evenlyDivides(12);
		evenlyDivides(13);

	}

}
