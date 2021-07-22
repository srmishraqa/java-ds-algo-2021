package dsnalg.sortAlgos;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray1 = {-76, 20, 35, -15, 7, 55, 1, -22};
        int[] intArray2 = {-76, 20, 35, -15, 7, 55, 1, -22};

        // Bubble Sort Algorithm - Sort in ascending Order

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swapElements(intArray, i, i + 1);
                }
            }
        }

        // Bubble Sort - In descending Order
        for (int lastIndexOfUnsortedArray = intArray1.length - 1; lastIndexOfUnsortedArray > 0; lastIndexOfUnsortedArray--) {
            for (int i = 0; i < lastIndexOfUnsortedArray; i++) {
                if (intArray1[i] < intArray1[i + 1]) {
                    swapElements(intArray1, i, i + 1);
                }
            }
        }

        // 2nd way to bubble sort -> ascending order
        for (int i = 0; i < intArray2.length - 1; i++) {
            if (intArray2[i] > intArray2[i + 1]) {
                swapElements(intArray2, i, i + 1);
                i = -1;
            }

        }

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));

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
