package DataStructures;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 89, 6, 78, 100, 4 };
		// System.out.println("New sorted array is" + SelectionAlgo(a));
		int newarray[] = InsertionSortAlgo(a);
		System.out.println("New sorted array is :");
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}

	}

	public static int[] InsertionSortAlgo(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}

}
