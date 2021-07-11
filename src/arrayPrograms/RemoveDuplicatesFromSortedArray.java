package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 4, 4 };
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];

            }
        }
        temp[j] = arr[arr.length - 1];
        System.out.println(Arrays.toString(temp));
    }
}
