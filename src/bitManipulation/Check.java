package bitManipulation;

public class Check {
	static String armstrongNumber(int n){
        int count = 0;
        int m = n;
        int temp1 = n;
        while(n != 0){
            n = n/10;
            count++;
        }
        System.out.println("Count :"+count);
        int ans =0;
        while(m !=0){
            int singleDigit = m%10;
            ans += findCube(singleDigit,count);
            m = m/10;
        }
        System.out.println("Ans :"+ ans);
        if(ans == temp1){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    
    static int findCube(int singleDigit,int count){
        
        int res = 1;
        for(int i=0;i<count;i++){
            res = res*singleDigit;
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.print(armstrongNumber(153));

	}

}
