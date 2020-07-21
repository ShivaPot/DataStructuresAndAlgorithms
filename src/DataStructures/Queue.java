package DataStructures;

public class Queue {
	int items;
	int Queuearr[];
	int front;
	int rear;
	int maxsize;

	Queue(int size) {
		this.maxsize = size;
		this.Queuearr = new int[size];
		this.front = 0;
		this.rear = -1;
		this.items = 0;
	}

	public void InsertintoQueue(int n) {
		if (rear == maxsize - 1) {
			rear = -1;
		}
		rear = rear + 1;
		Queuearr[rear] = n;
		items = items + 1;
	}

	public void View() {
		System.out.println("Values Present in Queue are");
		System.out.print("[ ");
		for (int i = 0; i < Queuearr.length; i++) {
			System.out.print(Queuearr[i] + " ");
		}
		System.out.print("]");
	}

	public int DeletefromQueue() {
		if (isEmpty()) {
			System.out.println("Queue is already Empty");
			return -1;
		} else {
			int newfront = front;
			items = items - 1;
			front = front + 1;
			return Queuearr[newfront];
		}

	}

	public boolean isEmpty() {
		return (items == 0);
	}

	public boolean isFull() {
		return (maxsize == items);
	}

}
