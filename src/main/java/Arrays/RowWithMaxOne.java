package Arrays;

public class RowWithMaxOne {
	
	static void rowWithMax1s(int arr[][], int n, int m) {
        // code here
		int maxOne = 0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<m;j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
			
			if(maxOne < count) {
				maxOne = count;
			}
		}
		System.out.println(maxOne);
    }

	public static void main(String[] args) {
		int n = 4 , m = 4;
		int arr[][] = {{0, 1, 1, 1},
				       {0, 0, 1, 1},
				       {1, 1, 1, 1},
				       {0, 0, 0, 0}};
		rowWithMax1s(arr,n,m);

	}

}
