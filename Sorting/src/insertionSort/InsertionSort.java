package insertionSort;

public class InsertionSort {

	public void insertionSort(int[] array) {
		for (int index = 1; index < array.length; index++) {
			int key = array[index];
			int i = index - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
}
