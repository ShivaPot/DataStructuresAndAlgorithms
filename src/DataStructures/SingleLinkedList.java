package DataStructures;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	
	SingleLinkedList(){
		this.head=null;
		this.tail=null;
	}
	

	public void InsertAtLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void InsertAtLast2(int data) {
		Node node = new Node();
		node.data = data;
		if(isEmpty()) {
			head =node;
		}else {
			tail.next=node;
			tail = node;
		}
		
	}

	public void InsertAtFirst(int data) {
		Node node = new Node();
		if(isEmpty()) {
			tail= node;
		}
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	private boolean isEmpty() {
		return (head==null);
	}


	public void InsertAtIndex(int data, int index) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			InsertAtFirst(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void DeleteAtIndex(int index) {
		if (index == 0) {
			head= head.next;
		}
		{
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
			//System.out.println("Deleted Node is"+n1.data);
		}
	}

	public void ShowList() {
		System.out.println("Values Present in List are");
		Node temp1 = head;
		while (temp1.next != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
		System.out.println(temp1.data);
	}

}
