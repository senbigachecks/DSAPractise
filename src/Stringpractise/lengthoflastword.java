package Stringpractise;

public class lengthoflastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="I am happy woman";
		
		System.out.println(lastwordlength(word));
	}

	private static int lastwordlength(String word) {
		String[] wordlist=word.split(" ");
		int n=wordlist.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(i==(n-1)) {
				
				for(char a:wordlist[i].toCharArray()) {
					
					count++;
				}
				
			}
	}
		return count;
		
		

}
}
