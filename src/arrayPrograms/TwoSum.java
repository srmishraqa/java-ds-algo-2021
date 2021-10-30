package arrayPrograms;

import java.util.HashSet;

public class TwoSum {

    public static void twoSum(int[] arr, int num) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int j : arr) {
            int temp = num - j;
            // checking for condition
            if (hashSet.contains(temp)) {
                System.out.println("Pair with given sum " + num + " is (" + j + ", " + temp + ")");
            }
            hashSet.add(j);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int num = 16;
        twoSum(arr, num);
    }

}
