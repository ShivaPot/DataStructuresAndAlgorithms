package DataStructures;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Found the key at index "+LinearserachAlgo(new
		// int[]{44,95,67,88,78,17},80));
		System.out.println(
				"Found the key at index " + RecursiveLinearserach(new int[] { 44, 95, 67, 88, 78, 17 }, 78, 0));

	}

	public static int LinearserachAlgo(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int RecursiveLinearserach(int[] a, int key, int i) {
		if (i >= a.length) {
			return -1;
		} else if (a[i] == key) {
			return i;
		} else {
			return RecursiveLinearserach(a, key, i + 1);
		}
	}

}
