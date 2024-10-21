package Stringpractise;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chocolate";
		System.out.println(checkpalindrome(s));
	}

	private static boolean checkpalindrome(String s) {
		
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

}
