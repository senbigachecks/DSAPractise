package javastack;

import java.util.Stack;

public class Findmininumelement {
	static Stack<Integer> stk = new Stack<Integer>();
	static Stack<Integer> temp = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		custompush(12);
		custompush(20);
		custompush(15);
		custompush(6);
		custompush(2);
		custompop();
		System.out.println("The minimum value is "+temp.peek());
		
	}
	
	public static  void custompush(int n) {
		stk.push(n);
		if(temp.isEmpty()) {
			temp.push(n);
		}else if(temp.peek()>n) {
			temp.push(n);
		}
		
	}
	
	public static void custompop() {
		int value=stk.peek();
		stk.pop();
		if(value==temp.peek()) {
			stk.pop();
			temp.pop();
		}
	}

}
