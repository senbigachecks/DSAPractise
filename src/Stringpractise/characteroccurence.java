package Stringpractise;

import java.util.HashMap;
import java.util.Map;

public class characteroccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="character";
		characteroccur(str);
	}

	private static void characteroccur(String str) {
		
		Map<Character,Integer> charmap = new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			charmap.put(ch, charmap.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:charmap.entrySet()) {
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
		
	}

}
