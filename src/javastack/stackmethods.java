package javastack;

public class stackmethods {

	int[] stack = new int[5];
	 int top=0;
	 
	 public  void push(int data) {
		 if(top==5) {
			 System.out.println("Stack is full");
		 }
		 else {
		 stack[top]=data;
		 top++;
		 }
		 
	 }
	 
	 public void show() {
		 for(int n:stack) {
			 System.out.println(n);
		 }
	 }
	 
	 public int peek() {
		 int data;
		 data=stack[top-1];
		 return data;
	 }
	 
	 public int pop() {
		 int data = 0;
		 if(top==0) {
			 System.out.println("Stack is empty");
		 }else {
		 top--;
		 data=stack[top];
		 stack[top]=0;
		
		 }
		 return data;
	 }
	 
	 public boolean isEmpty() {
			return top <= 0;
		}
	 
	 public int size() {
		 return top;
	 }
	
	
}
