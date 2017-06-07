package selectionSort;

import utilities.SortUtil;

public class SelectionSort {

	public void selectionSort(int[] array) {

		for (int index = 0; index < array.length - 1; index++) {
			int smallestIndex = index;
			smallestIndex = findSmallestIndex(array, index, smallestIndex);
			SortUtil.swap(array, index, smallestIndex);
		}
	}

	private int findSmallestIndex(int[] array, int index, int smallestIndex) {
		for (int j = index + 1; j < array.length; j++) {
			// Compare with smallest element
			if (array[j] < array[smallestIndex]) {
				smallestIndex = j;// searching for lowest index
			}
		}
		return smallestIndex;
	}

}
