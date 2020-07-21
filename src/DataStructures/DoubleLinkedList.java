package DataStructures;

public class DoubleLinkedList {
	private Node first;
	private Node last;

	public DoubleLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void InsertFirst(int data) {
		Node node = new Node();
		node.data = data;

		if (isEmpty()) {
			last = node; // if empty last will refer to the new node created
		} else {
			first.previous = node;
		}
		node.next = first;
		this.first = node;
	}

	public void InsertLast(int data) {
		Node node = new Node();
		node.data = data;
		if (isEmpty()) {
			first = node; // if empty first will refer to the new node created
		} else {
			last.next = node;
			node.previous = last;
		}
		last = node;
	}

	public Node DeleteFirst() {
		Node temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Node DeleteLast() {
		Node temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean InsertAfter(int key, int data) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		Node node = new Node();
		node.data = data;
		if (current == last) {
			current.next = null;
			last = node;
		} else {
			node.next = current.next;
			current.next.previous = node;
		}
		node.previous = current;
		current.next = node;
		
		return true;
	}

	public Node deleteKey(int key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;

	}

	public void DisplayForward() {
		System.out.print("List(First -----> Last): ");
		Node temp = first;
		while (temp != null) {
			temp.displayNode();
			temp = temp.next;
		}
		System.out.println();
	}

	public void DisplayBackward() {
		System.out.print("List(Last-----> First): ");
		Node temp = last;
		while (temp != null) {
			temp.displayNode();
			temp = temp.previous;
		}
		System.out.println();
	}
}