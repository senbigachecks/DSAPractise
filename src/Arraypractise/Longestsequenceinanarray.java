package Arraypractise;

import java.util.HashSet;
import java.util.Set;

public class Longestsequenceinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a = {100, 200, 1, 2, 3, 4};
	        int ans = longestSuccessiveElements(a);
	        System.out.println("The longest consecutive sequence is " + ans);
	}

	private static int longestSuccessiveElements(int[] a) {
		
		int n =a.length;
		if(n==0)
			return 0;
		int longest=1;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++){
		set.add(a[i]);	
		}
		for(int it:set) {
			if(!set.contains(it-1)) {
				int cnt=1;
				int x=it;
				while(set.contains(x+1)) {
					x=x+1;
					cnt=cnt+1;
				}
				longest=Math.max(cnt, longest);
				
			}
		}
		return longest;
	}

}
