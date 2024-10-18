package Arraypractise;

public class sumequalsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = effecientbrute(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
	}

	private static int findAllSubarraysWithGivenSum(int[] arr, int k) {
		int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            for (int j = i; j < n; j++) { // ending index j

                // calculate the sum of subarray [i...j]
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
	}
	
	
	private static int effecientbrute(int[] arr,int k) {
		int cnt=0;
		for (int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					cnt++;
				}
			}
			
		}
		
		return cnt;
	}
	
	

}
