package utilities;

public class SortUtil {

	public static void swap(int[] array, int sourceIndex, int destIndex) {
		int temp = array[destIndex];
		array[destIndex] = array[sourceIndex];
		array[sourceIndex] = temp;
	}
}
