package Stringpractise;

public class countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="yellow is";
		
		countvoowels(str);
	}

	private static void countvoowels(String str) {
		// TODO Auto-generated method stub
		str = str.replaceAll("\\s", "");
		char[] cr =str.toCharArray();
		int vow=0;
		int cons=0;
		for(char c:cr) {
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
				vow++;
			}else {
				cons++;
			}
		}
		System.out.println("vowels count"+vow);
		System.out.println("consonant count"+cons);
	}

}
