package ArrayArrayList;

public class SimpleProgram {
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6};
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
			
		}
		System.out.println();
		for(int element:num) {
			System.out.print(element+" ");
		}
		
	}

}