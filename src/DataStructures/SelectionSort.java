package DataStructures;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = new int[] { 89, 6, 78, 100, 4 };
		// System.out.println("New sorted array is" + SelectionAlgo(a));
		int newarray[] = SelectionAlgo(a);
		System.out.println("New sorted array is :");
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}
	}

	public static int[] SelectionAlgo(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
