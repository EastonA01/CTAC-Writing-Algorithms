package org.example;

public class BubbleSort {
    double num1 = System.currentTimeMillis();
    // Declaring array literal
    int[] intArray = new int[]{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    public int[] bubbleSort() {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Time to complete: " + (System.currentTimeMillis() - num1) + " ms");
        return intArray;
    }

}
