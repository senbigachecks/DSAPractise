package Stringpractise;

public class convertfirstlettertouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="i am a strong women";
 System.out.println(convertfirstletter(str));
	}

	private static String convertfirstletter(String str) {
		boolean capital=true;
		StringBuilder build= new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(capital && Character.isLetter(ch)) {
				build.append(Character.toUpperCase(ch));
				capital=false;
			}else {
				build.append(ch);
			}
			if(ch==' ') {
				capital=true;
			}
		}
		 return build.toString();
	}

}
