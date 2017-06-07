package mergeSort;

public class MergeSort {

	int[] array;
	int[] tempMergeArray;
	int arrayLength;

	public void sort(int[] array) {
		this.array = array;
		this.arrayLength = array.length;
		this.tempMergeArray = new int[arrayLength];
		mergeSort(0, arrayLength - 1);
	}

	public void mergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// int[] leftArr = new int[middle];
			// int[] rightArr = new int[arrayLength - middle];
			// for (int i = 0; i <= middle - 1; i++) {
			// leftArr[i] = array[i];
			// }
			// for (int i = middle; i <= arrayLength - 1; i++) {
			// rightArr[i - middle] = array[i];
			// }
			mergeSort(lowerIndex, middle);
			mergeSort(middle + 1, higherIndex);
			merge(lowerIndex, middle, higherIndex);
		}
	}

	private void merge(int lowerIndex, int middle, int higherIndex) {

		for (int index = lowerIndex; index <= higherIndex; index++) {
			tempMergeArray[index] = array[index];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
		// while (j < rightArrayLength) {
		// array[k] = rightArr[j];
		// j++;
		// k++;
		// }
	}
}
