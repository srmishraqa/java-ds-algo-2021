package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SumOfPairs {
    public static void main(String args[]) {
        int[] numbers = {7, 2, 4, 3, 5, 8, 9, 5, -2, 2, -7, 14};
        // printPairs(numbers, 7);
       // printSumOfPairs(numbers, 7);
        sumOfTwo(numbers,7);

    }

    public static <a> void sumOfTwo(int[] array1, int a) {
        int length = array1.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (array1[i] + array1[j] == a) {
                    System.out.println(array1[i] + "," + array1[j]);
                }
            }
        }
    }

    public static void printSumOfPairs(int arr[], int sum) {
        Arrays.sort(arr);
        int[] tempArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArr[j++] = arr[i];

            }
        }
        tempArr[j] = arr[arr.length - 1];
        System.out.println(Arrays.toString(tempArr));

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < tempArr.length; i++) {
            int temp = sum - tempArr[i];
            if (hashSet.contains(temp)) {
                System.out.println("{" + tempArr[i] + "," + temp + "}");
            }
            hashSet.add(tempArr[i]);
        }
    }

}
