package Arraypractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicatesinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,6,1,8,1,1,9};
		
		findduplicates(arr);
	}

	private static void findduplicates(int[] arr) {
		 Set<Integer> list = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					list.add(arr[i]);
				}
			}
		}
		
		for(int n:list) {
			System.out.println(n);
		}
		
	}

}
