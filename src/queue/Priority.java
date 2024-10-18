package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> prio = new PriorityQueue<>();
		prio.add(5);
		prio.add(6);
		prio.add(10);
		prio.add(4);
		prio.add(1);
		prio.add(100);
		
		for(int n:prio) {
			System.out.println(n);
		}
	}

}
