package quicksort;

import utilities.SortUtil;

public class QuickSort {

	public void quickSort(int[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pIndex = partition(array, startIndex, endIndex);
			quickSort(array, startIndex, pIndex - 1);
			quickSort(array, pIndex + 1, endIndex);
		}
	}

	private int partition(int[] array, int startIndex, int endIndex) {
		int pIndex = startIndex;
		int pivot = array[endIndex] ;
		
		for(int index = startIndex; index<endIndex; index++) {
			if(array[index]<=pivot) {
				SortUtil.swap(array, index, pIndex);
				pIndex++;
			}
		}
		SortUtil.swap(array, pIndex, endIndex);
		return pIndex;
	}
}
