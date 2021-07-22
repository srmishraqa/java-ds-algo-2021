package dsnalg.sortAlgos;

import java.util.Arrays;

public class InsertionSortInDescendingOrder {
    public static void insertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] < newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}

