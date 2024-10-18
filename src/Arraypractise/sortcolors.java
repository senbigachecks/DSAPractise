package Arraypractise;

public class sortcolors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,0,2,1,1,0};
		
		sortcolors(num);
	}

	private static void sortcolors(int[] num) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<num.length;i++) {
			int temp;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int n:num) {
			System.out.println(n);
		}
	}

}
