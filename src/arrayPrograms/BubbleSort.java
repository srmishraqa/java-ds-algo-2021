package arrayPrograms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {100,90,30,80,70,60,50,40,30,30,10};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    public static void sort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
