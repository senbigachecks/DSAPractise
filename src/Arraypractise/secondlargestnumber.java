package Arraypractise;

public class secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,9,22,8,9,1};
		int pos=2;
		secondlargest(arr,pos);
	}

	private static void secondlargest(int[] arr, int pos) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int temp;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i==pos)
				System.out.println(arr[pos]);
			}
		}
	}


