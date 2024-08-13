package org.example;

import java.util.Arrays;

public class QuickSort {
    int[] intArray = new int[]{ 2, 1, 6, 10, 4, 1, 3, 9, 7 };

    public int partition(int low, int high) {
        int pivot = intArray[high]; // Choose the last element as the pivot
        int i = low - 1; // Initialize the index

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (intArray[j] <= pivot) {
                i++; // Increment the index
                // Swap the elements at i and j
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;

        return i + 1; // Return the new pivot index
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            // pivot
            int pivotIndex = partition(low, high);
            // Quick sort left
            quickSort(low, pivotIndex - 1);
            // Quick sort right
            quickSort(pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        double num1 = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(0, quickSort.intArray.length - 1);
        System.out.println(Arrays.toString(quickSort.intArray));
        System.out.println("Time: " + (System.currentTimeMillis() - num1) + "ms");
    }

}
