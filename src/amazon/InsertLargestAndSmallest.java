package amazon;

import java.util.Arrays;

/**
 * given an input of array of numbers , we need to give an output of same array type
 * where it returns like 1st largest, then first smallest,2nd largest,2nd smallest like that ...
 * example input - {-5, 1, -3, -2, 0, -4, 2, 3, -1}
 * output --> {3,-5,2,-4,1,-3,0,-2,-1}
 */

public class InsertLargestAndSmallest {

    public static void main(String[] args) {
        int[] inputArray = {-5, 1, -3, -2, 0, -4, 2, 3};
        System.out.println(Arrays.toString(sortArray(inputArray)));
        System.out.println(Arrays.toString(driverMethod(inputArray)));

        int[] inputArray1 = {-5, 1, -3, -2, 0, -4, 2, 3, -1};
        System.out.println(Arrays.toString(sortArray(inputArray1)));
        System.out.println(Arrays.toString(driverMethod(inputArray1)));

    }

    public static void swap(int[] arr, int index, int endIndex) {
        int temp = arr[index];
        arr[index] = arr[endIndex];
        arr[endIndex] = temp;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                i = -1;
            }
        }
        return arr;
    }

    public static int[] driverMethod(int[] arr) {
        int[] output = new int[arr.length];
        int[] temp = sortArray(arr);
        int j = 0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                output[j] = temp[arr.length - i - 1];
                output[j + 1] = temp[i];
                j += 2;

            }
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                output[j] = temp[arr.length - i - 1];
                output[j + 1] = temp[i];
                j += 2;
            }
            output[j] = temp[arr.length / 2];

        }
        return output;
    }
}
