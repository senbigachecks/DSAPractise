package queue;

public class javaqueue {

	
		// TODO Auto-generated method stub
		int[]a;
		int rear;
		int front;
		int size;
		
		public javaqueue(int size) {
			rear=-1;
			this.size=size;
			this.a = new int[size];
		}
		
		public void enqueue(int x) {
			rear++;
			a[rear]=x;
		}
		public void prioqueue(int x) {
			
			
			if(rear==-1) {
				rear++;
				a[rear]=x;
			}else {
				int temp;
				for(int i=rear;i>=0;i--) {
					if(a[i]>x) {
						temp=a[i];
						a[i]=x;
						a[i+1]=temp;
						
						
					}
				}
			}
		}
		
		public int dequeue() {
			int ele=a[0];
			for(int i=0;i<rear;i++) {
				a[i]=a[i+1];
			}
			rear--;
			return ele;
		}
		
		public void show() {
			for(int n:a) {
				System.out.println(n);
			}
		}
		
		

}
