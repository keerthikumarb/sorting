package main;

import mergeSort.MergeSort;
import quicksort.QuickSort;

public class SortMain {

	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};  
		MergeSort insertionSort = new MergeSort();
        System.out.println("Before Insertion Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        insertionSort.sort(arr1);//sorting array using selection sort  
         
        System.out.println("After Insertion Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
	}
}
