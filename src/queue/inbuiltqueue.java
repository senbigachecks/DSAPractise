package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class inbuiltqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> que= new ArrayDeque<Integer>();
		que.add(5);
		que.add(15);
		que.add(25);
		que.add(35);
		que.add(45);
		

		Stack<Integer> stk = new Stack<Integer>();
		
		while(!que.isEmpty()) {
			stk.push(que.remove());
		}
		
		while(!stk.isEmpty()) {
			que.add(stk.pop());
		}
		
		for(int n:que) {
			System.out.println("Reversed list "+ n);
		}
	}

}
