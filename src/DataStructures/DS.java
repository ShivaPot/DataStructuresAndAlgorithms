package DataStructures;

public class DS {

	public static void main(String[] args) {
		
		
		int[] a = { 9, 26, 78, 100, 4 };
		MergeSort Merge =new MergeSort();
		Merge.sort(a);
		System.out.println("New sorted array is :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
//		
//		DoubleLinkedList ls = new DoubleLinkedList();
//		ls.InsertFirst(22);
//		ls.InsertFirst(44);
//		ls.InsertFirst(66);
//	    ls.InsertLast(11);
//	    ls.InsertLast(33);
//	    ls.InsertLast(55);
//	    ls.DisplayForward();
//	    ls.DisplayBackward();
//	    ls.DeleteFirst();
//	    ls.DeleteLast();
//	    ls.deleteKey(11);
//	    ls.DisplayForward();
//        ls.InsertAfter(22,77);
//        ls.InsertAfter(33,88);
//	    ls.DisplayForward();

		
//		SingleLinkedList ls = new SingleLinkedList();
//	    ls.InsertAtFirst(34);
//	    ls.InsertAtFirst(44);
//	    ls.InsertAtLast2(23);
//	    ls.InsertAtLast(43);
//	    ls.InsertAtLast(89);
//	    ls.InsertAtLast(67);
//	    ls.InsertAtFirst(54);
//	    ls.InsertAtIndex(45,3);
//	    ls.DeleteAtIndex(4);
//	    ls.ShowList();
//		Queue q = new Queue(3);
//		 q.InsertintoQueue(30);
//		 q.InsertintoQueue(40);
//		 q.InsertintoQueue(70);
//		 q.InsertintoQueue(90);
//		 q.View();

//		while (!q.isEmpty()) {
//			int value = q.DeletefromQueue();
//			System.out.println(value);
//		}
		// String reversed =reverse("LION");
		// System.out.println(reversed);
	}

	// public static String reverse(String word) {
	// int length = word.length();
	// Stack s = new Stack(length);
	// for (int i = 0; i < length; i++) {
	// char s1 = word.charAt(i);
	// s.push(s1);
	// }
	// String result = " ";
	// while (!s.isEmpty()) {
	// char value = s.pop();
	// result =result + value;
	// //System.out.println(result);
	// }
	// return result;
	// }

}
