package javastack;

import java.util.Stack;

public class StackInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(5);
		stk.push(10);
		stk.push(15);
		stk.push(20);
		stk.push(25);
		stk.push(30);
		//AtBottom(100,stk);
		
		int n=stk.size();
		//System.out.println(n);
		
		Stack<Integer> stknew = new Stack<Integer>();
		while(!stk.isEmpty()) {
			int val=stk.pop();
			stknew.push(val);
			
		}
		
		for(int num:stknew) {
			System.out.println(num);
		}
		
		
	}
	
	public static void insertInTheMiddle(int index, int value,Stack<Integer> s){
		Stack<Integer> temp = new Stack<Integer>();
		for(int i =1; i<= s.size()-index+1;i++){
			int item = s.peek();
			temp.push(item);
			s.pop();
	}
	s.push(value);
	while(!temp.empty())
	{
	int item =temp.peek();
	s.push(item);
	temp.pop();
	}
	}
		
	public static void AtBottom(int value,Stack<Integer> s) {
		Stack<Integer> temp = new Stack<Integer>();
		while(!s.isEmpty()) {
			int val=s.peek();
			temp.push(val);
			s.pop();
			}
		s.push(value);
		while(!temp.isEmpty()) {
			s.push(temp.peek());
			temp.pop();
		}
		while (!s.empty())
	    {
	        System.out.print(s.peek() + " ");
	        s.pop();
	    }
		
	}
}


