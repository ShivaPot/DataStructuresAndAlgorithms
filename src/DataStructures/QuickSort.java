package DataStructures;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] inputArray = { 89, 6, 78, 100, 4 };
		Quicksort(inputArray, 0, inputArray.length - 1);
		System.out.println(Arrays.toString(inputArray));
	}

	public static void Quicksort(int inputArray[], int start, int end) {
		if (start < end) {
			int pp = partition(inputArray, start, end);
			Quicksort(inputArray, start, pp - 1); // left half of pp
			Quicksort(inputArray, pp + 1, end); // right half of pp
		}
	}

	public static int partition(int inputArray[], int start, int end) {
		int pivot = inputArray[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (inputArray[j] <= pivot) {
				i++;
				// we are swapping below with i and j values
				int ival = inputArray[i];
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}

		// put the pivot value in correct position slot next
		int ival = inputArray[i + 1];
		inputArray[end] = ival;
		inputArray[i + 1] = pivot;
		return i + 1;
	}

}
