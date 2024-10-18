package Arraypractise;

public class maximumsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		int[] arr= {-3,1,2,4,-5,6};
		System.out.println(maximumsubarray(arr));
	}

	private static int maximumsubarray(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				
				}
			max=Math.max(max, sum);
		
			
		}
		return max;
	}

}
