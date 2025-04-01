package StreamQuestion;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	private static void commonElements(int[] a, int[] b, int[] c, int n1, int n2, int n3) {
		List<Integer> ll = new ArrayList<>();
		int i=0;
		int j=0;
		int k=0;
		while(i<n1 && j<n2 && k<n3) {
			if(a[i] < b[j]) {
				i++;
			}
			if(b[j] < c[k]) {
				j++;
			}
			else {
				k++;
			}
			if(a[i] ==b[j] && b[j] ==c[k]) {
				ll.add(a[i]);
				i++;
				j++;
				k++;
			}
		}
		System.out.println(ll);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 5, 10, 20, 40, 80};
		int[] b = {6, 7, 20, 80, 100};
		int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;
		commonElements(a,b,c,n1,n2,n3);

	}

}
