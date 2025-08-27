package String;

import java.util.*;

public class CommonSubString1 {
	
	public static void commonSubString(String[] arr) {
		Map<String,Integer> map = new HashMap();
		
		for(String word:arr) {
			int len = word.length();
			for(int i=0;i<len;i++) {
				for(int j=i+1;j<=len;j++) {
					String sub = word.substring(i,j);
					map.put(sub, map.getOrDefault(sub, 0)+1);
				}
			}
		}
		
		int countMax = 0;
		String res ="";
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()>countMax || (entry.getValue()==countMax && entry.getKey().length() > res.length())) {
				res = entry.getKey();
				countMax = entry.getValue();
			}
		}
		System.out.println(map);
		System.out.println("SubString: "+res);
		
	}
	
	public static void commonSubStringOptimized(String[] arr) {
		
		if(arr ==null || arr.length ==0) return ;
		
		String smallest = Arrays.stream(arr).min(Comparator.comparingInt(String::length)).get();
		int l=0; int r=smallest.length();
		String result="";
		while(l<=r) {
			int mid = (l+r)/2;
			String common = hasCommonString(arr,mid);
			if(common != null) {
				result = common;
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		
		System.out.println(result);
		
	}
	
	public static String hasCommonString(String[] arr, int mid) {
		Set<String> subString = new HashSet<>();
		String first = arr[0];
		for(int i=0;i<=first.length()-mid;i++) {
			subString.add(first.substring(i,i+mid));
		}
		
		for(int i=1;i<arr.length;i++) {
			String word = arr[i];
			Set<String> temp = new HashSet<String>();
			for(int j=0;j<=word.length()-mid;j++) {
				String sub = word.substring(j,j+mid);
				if(subString.contains(sub)) {
					temp.add(sub);
				}
			}
			subString = temp;
			if(subString.isEmpty()) return null;
		}
		
		return subString.iterator().next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"grace","graceful", "disgraceful", "gracefully"};
		String[] arr1 = {"sadness" ,"sad" ,"sadly"};
		String[] arr2 = {"flower" ,"flowrance" ,"flow"};
		String[] arr3 = {"flower" ,"flowrance" ,"flant"};
		String[] arr4 = {"ab" ,"a"};

		//commonSubString(arr1);
		
		commonSubStringOptimized(arr4);
	}

}
