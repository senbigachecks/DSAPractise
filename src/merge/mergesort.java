package merge;






import java.util.Arrays;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,2,7,9};
		//System.out.println(arr.length);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int arr[]) {
		if(arr.length<2)
			return;
		int medium=arr.length/2;
		//System.out.println(medium);
		int left[] = new int[medium];
		int right[]=new int[arr.length-medium];
		
		for(int i=0;i<medium;i++) {
			left[i]=arr[i];
		}
		
		
		for(int i=medium;i<arr.length;i++) {
			right[i-medium]=arr[i];
		}
		
		sort(left);
		//printArray(left);
		sort(right);
		//printArray(right);
		merge(left,right,arr);
		 
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		// TODO Auto-generated method stub
		int i=0; int k=0; int j=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
				
				
			}else {
				arr[k]=right[j];
				j++;
				
				
			}
			k++;
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
		
		
		
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

}
