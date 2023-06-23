package leetCode.easy.array;

import java.util.Arrays;

public class sortSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 7, 3, 12};
        System.out.println(Arrays.toString(sortSubArray(arr,3)));
    }

    static int[] sort(int[] arr, int start, int size) {
        for (int i = start; i < size; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i - 1;
            }
        }
        return arr;
    }

    static int[] sortSubArray(int[] arr, int size) {
        for (int i = 0; i < arr.length-1; i=i+size) {
            sort(arr,i,i+size);
        }
        return arr;
    }
}
