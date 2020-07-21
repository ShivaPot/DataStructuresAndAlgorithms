package DataStructures;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(
//				"Found the key at index " + BinarySearchAlgo(new int[] { 44, 67, 78, 98, 100, 130, 200 }, 100));
		System.out.println(
				"Found the key at index " + RecursiveBinarySearchAlgo(new int[] { 44, 67, 78, 98, 100, 130, 200 },100,0,6));

	}

	public static int BinarySearchAlgo(int[] a, int key) {
		int mid;
		int low = 0;
		int high = a.length;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int RecursiveBinarySearchAlgo(int[] a, int key, int low, int high) {
		int mid;
		if (low > high) {
			return -1;
		} else {
			mid = (low + high) / 2;
			if(a[mid]==key) {
				return mid;
			}
			else if (a[mid] < key) {
				return RecursiveBinarySearchAlgo(a, key, mid+1,high);
			} 
			else {
				return RecursiveBinarySearchAlgo(a, key, low,mid-1);
			} 
		}

	}

}
