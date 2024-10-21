package Arraypractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class knowfirstandlastocuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,3,4,6,5,7,5,8,5};
		int k=5;
		firstandlast(arr,k);
		int[] ar1= {0,5,0,0,3,1,15,0,12,0,0,0};
		pushzeroesatend(ar1);
	}

	private static void firstandlast(int[] arr, int k) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				list.add(i+1);
			}
		}
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
			System.out.println(list.get(list.size()-1));
		}
		
		
	}
	
	private static void pushzeroesatend(int[] ar1) {
		int n=ar1.length;
		int[] temp= new int[n];
		int j=0;
		
		for(int i=0;i<n;i++) {
			if(ar1[i]!=0) {
				temp[j++]=ar1[i];
			}
		}
		while(j<n) {
			temp[j]=0;
			j++;
		}
		
		for(int i=0;i<n;i++) {
			ar1[i]=temp[i];
		}
		
		for(int m:ar1) {
			System.out.print(m);
		}
	}

}
