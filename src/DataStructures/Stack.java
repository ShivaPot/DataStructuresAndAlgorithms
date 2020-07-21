package DataStructures;

public class Stack {
	int top = -1;
	char stackarr[];
	int maxsize;

	Stack(int size) {
		this.maxsize = size;
		this.stackarr = new char[size];
		this.top = -1;
	}

	public void push(char a) {
		// Incrementing the top of the stack
		if(isFull()) {
			System.out.println("stack is already full");
		}
		else {
			top = top + 1;
			stackarr[top] = a;
		}
	}

	public char pop() {
		// Decrementing the top of the stack
		if(isEmpty()) {
			System.out.println("Stack is already empty");
			return '0';	
		}else {
			int old_top = top;
			top = top - 1;
			return stackarr[old_top];	
		}
		
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public char currentpeek() {
		return stackarr[top];
	}

	public boolean isFull() {
		return (maxsize - 1 == top);
	}
}
