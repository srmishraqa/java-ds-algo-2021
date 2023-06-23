package arrayPrograms;

import java.util.Arrays;

public class FindAMissingNumberInArray {

    public static int missingNum(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 9, 8, 10, 7, 12, 11};
        System.out.println(missingNum(arr));
    }
}
