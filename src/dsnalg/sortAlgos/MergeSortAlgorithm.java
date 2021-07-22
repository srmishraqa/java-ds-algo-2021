package dsnalg.sortAlgos;

import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] arr, int start, int end) {

        // start will always be zero and end will be one greater than the last index which is same as the length of the array
        // end index will be one value greater than last index
        //Breaking condition --> when me call this method with on element array
        // Then we return that element as single element is always assumed to be sorted

        if ((end - start) < 2) {
            return;
        }
        // If we have at least 2 elements for an array or more  then we need to perform following steps
        // we have to do logical partitioning
        int mid = (start + end) / 2;
        // Then we are going to put 0 to mid-1 to one array
        // and mid to end to another array
        mergeSort(arr, start, mid); // left partition is handled
        mergeSort(arr, mid, end); // Right Partition is handled
        merge(arr, start, mid, end); // merging Left and right partition and sorting is handled here while merging

    }

    private static void merge(int[] arr, int start, int mid, int end) {

        // 1st Optimization - if mid-1 is less than or equal to mid
        // Then it is already in sorted format so we don't need to perform any sort while merging as it is sorted
        // So we can leave as it is and just return it

        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start; // starting traversing index of left array
        int j = mid; // starting traversing index of right array
        int tempIndex = 0;

        int[] temp = new int[end - start];

        // if i which is traversing index of left array reaches mid-1 we need to drop out
        // if j which is traversing index of right array reaches end-1 we need to drop pout
        while (i < mid && j < end) {

            if (arr[i] <= arr[j]) {
                temp[tempIndex++] = arr[i++];
            } else {
                temp[tempIndex++] = arr[j++];
            }

        }

        // we need to handle the left over elements of one array
        // 2nd Optimization - Anything left over in right array is already sorted
        // Or else we need to copy them to temp array
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
