package LeedCode75Question;

public class CanPlaceFlowers {
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                boolean leftSide = (i==0) || (flowerbed[i-1]==0);
                boolean rightSide = (i == flowerbed.length-1) || (flowerbed[i+1]==0);

                if(leftSide && rightSide){
                    flowerbed[i] = 1;
                    count++;
                }
                if(count >= n){
                    return true;
                }
            }
        }
       return count>=n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1}; 
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed,n));
//		Example 1:
//			Input: flowerbed = [1,0,0,0,1], n = 1
//			Output: true
//		Example 2:
//			Input: flowerbed = [1,0,0,0,1], n = 2
//			Output: false
	}

}
