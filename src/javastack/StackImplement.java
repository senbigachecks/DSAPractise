package javastack;

public class StackImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stackmethods stk = new stackmethods();
		System.out.println(stk.isEmpty());
		stk.push(5);
		stk.push(10);
		System.out.println(stk.peek());
		stk.push(15);
		stk.push(20);
		//stk.show();
		stk.push(25);
		//System.out.println(stk.pop());
		//System.out.println(stk.isEmpty());
		System.out.println("The size is "+stk.size());
		stk.push(30);
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		
	
		
	}
	
	

}
