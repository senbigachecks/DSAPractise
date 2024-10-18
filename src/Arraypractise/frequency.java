package Arraypractise;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,5,6,1,8,1,5,1,9};
		findfrequency(arr);
	}

	private static void findfrequency(int[] arr) {
		// TODO Auto-generated method stub
		int[] fr = new int[arr.length];
		int repeat=-1;
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=repeat;
				}
			}
			if(fr[i]!=repeat) {
				fr[i]=count;
			}
		}
		
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=repeat) {
			System.out.println(arr[i]+" "+fr[i]);
		}
		}
	}

}

