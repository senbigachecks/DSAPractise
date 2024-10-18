package Stringpractise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "listen";
		String s2 = "silent";
		
		if(s1.length()!=s2.length()) {
			System.out.println("not an anagram");
		}
		
		char[] cr1=s1.toCharArray();
		char[] cr2=s2.toCharArray();
		
		Arrays.sort(cr1);
		Arrays.sort(cr2);
		
		if(Arrays.equals(cr1, cr2)) {
			System.out.println("anagram");
		}else {
			System.out.println("false");
		}
	}

}
