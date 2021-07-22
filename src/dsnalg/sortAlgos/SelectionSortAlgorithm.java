package dsnalg.sortAlgos;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //Selection Sort Algorithm
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swapElements(intArray, largest, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swapElements(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
