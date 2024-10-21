package Stringpractise;

import java.util.Arrays;

public class longestcommonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] name= {"flower", "flow", "flight"};
 System.out.println(commonletters(name));
	}

	private static String commonletters(String[] name) {
		// TODO Auto-generated method stub
		int n=name.length;
		Arrays.sort(name);
	String first =name[0];
	String last =name[name.length-1];
	
	int index=0;
	while(index<first.length()){
		if(first.charAt(index)==last.charAt(index)) {
			index++;
		}else {
			break;
		}
	}
	
	return index==0?null:first.substring(0, index);	
	}
	

}
