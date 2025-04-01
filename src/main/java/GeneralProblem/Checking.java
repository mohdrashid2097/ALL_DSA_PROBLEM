package GeneralProblem;

public class Checking {
	/*
	 * static void setBit(int a,int b){ int sign = ((a<0)^(b<0))?-1:1; int dividend
	 * = Math.abs(a); int divisor = Math.abs(b); //long res = (long)
	 * (Math.exp((Math.log(dividend) - Math.log(divisor))) +0.0000000001); long res
	 * = (long) Math.exp((Math.log(dividend) - Math.log(divisor)));
	 * 
	 * if(sign == -1) { res = -res; }
	 * 
	 * System.out.println("Result :"+ res); }
	 */
	public static long divide(long a, long b)
    {
        long sign = ((a<0)^(b<0))?-1:1;
		long dividend = Math.abs(a);
		long divisor = Math.abs(b);
		long quotient=0,temp =0;
		for (int i = 31; i >=0; --i)
{
 
    if (temp + (divisor << i) <= dividend)
    {
        temp += divisor << i;
        quotient |= 1L << i;
    }
}
		
		if(sign == -1) {
			quotient = -quotient;
		}
        return quotient;
    }

	/*
	 * public static void check1(int a, int b) { int q=0; while(a>=b) { q++; a -= b;
	 * } System.out.println(q); }
	 */
	public static void main(String[] args) {

		//check(10,3);
		//System.out.println(divide(10,3));;
		//check(43,8);
		//check(43,8);
		String a =" ";
		a += "b";
		a += "c";
		System.out.println(a);

	}

}
