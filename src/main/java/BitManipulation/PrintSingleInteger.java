package BitManipulation;

public class PrintSingleInteger {
	
	static void singleIntegerValue(int[] arr) {
		
		int xor = 0;
		for(int i=0;i<arr.length;i++) {
			
			xor = xor^arr[i];
		}
		System.out.print("SingleValue:"+xor);
		
	}
	
	static void swaptwoNumber(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print("Swap of 2 Number :"+ a+" "+b);
	}
	
	static void printXOROfAllNumber(int n) {
		if(n%4==0) {System.out.println(n);}
		if(n%4==1) {System.out.println(1);}
		if(n%4==2) {System.out.println(n+1);}
		if(n%4==3) {System.out.println(0);}
		
	}
    
	static int findXOROfAllNumber(int n) {
		if(n%4==0) {return n;}
		if(n%4==1) {return 1;}
		if(n%4==2) {return n+1;}
		if(n%4==3) {return 0;}
		
		return 0;
	}
	static void printRangeXOROfAllNumber(int L, int R) {
		int ans = findXOROfAllNumber(R) ^ findXOROfAllNumber(L-1);
		System.out.println("XOR Range :"+ ans);
	}
	static void evenOdd(int n) {
		if((n&1) == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
	static void iThBitSetOrNot(int n, int ith) {
		int mask = 1<<ith;
		
		if((n&mask) != 0) {
			System.out.println("Yes");
			System.out.println(1);
		}
		else {
			System.out.println("No");
			System.out.println(0);
		}
	}
	static void clearIthBit(int n, int ith) {
		int mask = ~(1<<ith);
		n = n&mask;
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,3,5,5,6,6,9,9};
		//singleIntegerValue(arr);
		//swaptwoNumber(5,7);
		//printXOROfAllNumber(6);
		//printRangeXOROfAllNumber(4,8);
		//evenOdd(13);
		//iThBitSetOrNot(13,3);
		//clearIthBit(13,2);
		System.out.println(60%360==0);

	}

}
