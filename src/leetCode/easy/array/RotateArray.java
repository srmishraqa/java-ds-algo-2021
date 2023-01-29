package leetCode.easy.array;

import java.util.Arrays;

/*
* Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
* */
public class RotateArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7};
        rotate(ar, 3);

    }

    public static void rotate(int[] nums, int k) {
        // Logic is first reverse the whole array [6,5,4,3,2,1,7]
        // Reverse the array till k [4,5,6,3,2,1,7]
        // Reverse the array the remaining last (n-k) numbers [4,5,6,7,1,2,3]
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println("After First Whole Reversal : " + Arrays.toString(nums));

        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - i - 1] = temp;
        }

        System.out.println("After 2nd Reversal : " + Arrays.toString(nums));

        for (int i = k; i < (nums.length + k) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length + k - 1 - i];
            nums[nums.length + k - 1 - i] = temp;
        }

        System.out.println("After Final Reversal : " + Arrays.toString(nums));
    }
}
