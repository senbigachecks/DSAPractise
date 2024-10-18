package javastack;

import java.util.Stack;

public class sortedorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(9);
		s.push(11);
		s.push(3);
		s.push(1);
		s.push(20);
		System.out.println(s);
		System.out.println("#############");
		System.out.println(sortstack(s));
	}
	
	public static Stack<Integer> sortstack(Stack<Integer> s) {
		Stack<Integer> tempstk = new Stack<Integer>();
		while(!s.isEmpty()) {
			int val =s.pop();
			
			
			while(!tempstk.isEmpty() &&tempstk.peek()>val) {
				int tt=tempstk.pop();
				s.push(tt);
			}
			tempstk.push(val);
			
		}
		return tempstk;
	}

}
