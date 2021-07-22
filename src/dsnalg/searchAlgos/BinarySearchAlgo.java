package dsnalg.searchAlgos;

import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, -9, -89, 456, 29};
        // {-89,-9,23,29,45,67,456}
        System.out.println(binarySearchIterative(arr, 456));
//        System.out.println(binarySearchIterative(arr,-9));
//        System.out.println(binarySearchIterative(arr,10));
        System.out.println(recursiveBinarySearch(arr, -89));
    }

    public static int binarySearchIterative(int[] arr, int element) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int midPoint = (start + end) / 2;
            System.out.println("-->" + midPoint);
            if (arr[midPoint] == element) {

                return midPoint;
            } else if (arr[midPoint] < element) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int element) {
        return recursiveBinarySearch(arr, 0, arr.length, element);
    }

    private static int recursiveBinarySearch(int[] arr, int start, int end, int element) {
        if (start >= end) {
            return -1;
        }

        int midPoint = (start + end) / 2;
        System.out.println("====>>" + midPoint);
        if (arr[midPoint] == element) {
            return midPoint;
        } else if (arr[midPoint] < element) {
            return recursiveBinarySearch(arr, midPoint + 1, end, element);
        } else {
            return recursiveBinarySearch(arr, 0, midPoint, element);
        }
    }

}
