package queue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaqueue JQ = new javaqueue(5);
		JQ.prioqueue(15);
		JQ.prioqueue(11);
		JQ.prioqueue(4);
		JQ.prioqueue(3);
		
		JQ.show();
		
		
		
	}

}
