package DataStructures;

public class MergeSort {
	public static void main(String[] args) {

		int[] a = { 89, 6, 78, 100, 4 };
		int[] b=sort(a);
		System.out.println("New sorted array is :");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static int[] sort(int a[]) {
		int b[]=sort(a, 0, a.length - 1);
		return b;
	}

	public static int[] sort(int a[], int p, int r) {
		int b[] = null;
		if (r <= p) {
			return b; // we are done traversing the array
		}
		int q = (p + r) / 2;
		sort(a, p, q); // sort left half
		sort(a, q + 1, r); // sort right half
		b=mergesortalgo(a, p, q, r); // merge the sorted results in input array
		return b;
	}

	public static int[] mergesortalgo(int a[], int p, int q, int r) {
		int temparr[] = new int[r - p + 1];

		// index for left side of array
		int leftslot = p;
		// index for right side of array
		int rightslot = q + 1;
		int k = 0;

		while (leftslot <= q && rightslot <= r) {
			if (a[leftslot] < a[rightslot]) {
				temparr[k] = a[leftslot];
				leftslot++;
			} else {
				temparr[k] = a[rightslot];
				rightslot++;
			}
			k++;
		}

		// When it gets here that means the above loop has completed so both left and
		// right side of sub arrays can be considered sorted

		if (leftslot <= q) { // consider the right side done being sorted.left must be sorted already
			while (leftslot <= q) {
				temparr[k] = a[leftslot];
				leftslot++;
				k++;
			}
		} else if (rightslot <= r) {
			while (rightslot <= r) {
				temparr[k] = a[rightslot];
				rightslot++;
				k++;
			}
		}

		// copy over the temp array into appropriate slots of the input array
		for (int i = 0; i < temparr.length; i++) {
			a[p + i] = temparr[i];
		}
		
		return a;

	}

}
