package Stringpractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class firstnonrepeataingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="text";
		
		firstnonrepeatingcharacter(s);
	}

	private static void firstnonrepeatingcharacter(String s) {
		// TODO Auto-generated method stub
		char[] word=s.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		for(char c:word) {
			set.add(c);
		}
		
		List<Character> arr = new ArrayList<>(set);
	     System.out.println(arr);
	     System.out.println(arr.get(0));
	}

}
