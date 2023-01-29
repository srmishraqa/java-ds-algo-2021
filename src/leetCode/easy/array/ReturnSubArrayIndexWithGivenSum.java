package leetCode.easy.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices
2 and 4 is 20 + 3 + 10 = 33

Input: arr[] = {10, 2, -2, -20, 10}, sum = -10
Output: Sum found between indexes 0 to 3
Explanation: Sum of elements between indices
0 and 3 is 10 + 2 – 2 – 20 = -10

Input: arr[] = {-10, 0, 2, -2, -20, 10}, sum = 20
Output: No subarray with given sum exists
Explanation: There is no subarray with the given sum
* */
public class ReturnSubArrayIndexWithGivenSum {

    public static void test(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == sum) { // if it starts from index 0
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum);
                end = i;
                break;
            }

            map.put(currentSum, i);
            System.out.println(map);
        }

        if (end == -1) {
            System.out.println("No SUM FOUND");
        } else {
            System.out.println("start and end index are " + start + " " + end + " respectively");
        }

    }

    public static int sum(int[] arr, int index) {
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        test(arr, -10);
    }
}
