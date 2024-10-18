package Stringpractise;

import java.util.Stack;

public class stringbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(2+[{4}])";
		
		System.out.println(stringbalanced(s));
	}

	private static boolean stringbalanced(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for (char c: s.toCharArray())
		 {
		if (c == '(' || c == '{' || c == '[') 
		 stack.push(c);
		 
		 if (c == ')' || c == '}' || c == ']')
		 {
		 Character top = (char) stack.pop();
		 if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == 
		'[' && c != ']')) {
		 
		 return false;
		 }
		 }
		 
		}
		return stack.isEmpty();
		}

}
