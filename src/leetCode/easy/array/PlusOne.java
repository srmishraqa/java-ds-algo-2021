package leetCode.easy.array;

import java.util.Arrays;

/*
* Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*
* Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
*
* Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
* */
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {8, 7, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0 && digits[i] == 9) {
            i--;
        }

        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        int[] result = new int[digits.length];

        result[i] = digits[i] + 1;

        for (int j = 0; j < i; j++) {
            result[j] = digits[j];
        }
        
        return result;
    }

}
