package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayWithoutCollection {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -1, -1, 9, 9, 1, 2, 3, 3, 2, 4, 4, 6};
        int[] op = removeDuplicates(array1);
        System.out.println(Arrays.toString(op));

    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                res[index++] = arr[i];
            }
        }
        res[index] = arr[arr.length - 1];
        return Arrays.copyOf(res, index + 1);
    }

}