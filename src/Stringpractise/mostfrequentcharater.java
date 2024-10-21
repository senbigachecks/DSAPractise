package Stringpractise;

import java.util.HashMap;
import java.util.Map;

public class mostfrequentcharater {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="neeolove";
		
		System.out.println(frequentcharacter(str));
	}

	private static char frequentcharacter(String str) {
		Map<Character,Integer> charmap = new HashMap<>();
		int maxcount=0;
		char freq='a';
				
		 for(char ch:str.toCharArray()) {
			int count =charmap.getOrDefault(ch,0)+1;
			charmap.put(ch, count);
			
			if(count>maxcount) {
				maxcount=count;
				freq=ch;
			}
		 }
		
		return freq;
	}

}
