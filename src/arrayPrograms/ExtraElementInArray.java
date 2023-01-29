package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class ExtraElementInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7};
        int[] arr2 = {1, 4, 3, 5, 2};
        printDuplicateElements(arr1, arr2);
    }

    public static void printDuplicateElements(int[] arr1, int[] arr2) {
        int firstArraySum = arrSum(arr1);
        int secondArraySum = arrSum(arr2);
        int diff = secondArraySum - firstArraySum;
        System.out.println(diff);
        System.out.println(Math.abs(diff));
    }

    public static int arrSum(int[] arr1) {
        int res = 0;
        for (int element : arr1
        ) {
            res = res + element;
        }
        System.out.println(res);
        return res;
    }
}
