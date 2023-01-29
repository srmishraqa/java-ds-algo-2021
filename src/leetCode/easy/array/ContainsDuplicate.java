package leetCode.easy.array;

/*
* Input: nums = [1,2,3,4]
Output: false
* */

import java.util.HashSet;
import java.util.Set;

/*
* Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr2));

        System.out.println(containsDuplicateOptimized(arr));
        System.out.println(containsDuplicateOptimized(arr2));
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    b = true;
                    break;
                }

            }
        }

        return b;
    }

    public static boolean containsDuplicateOptimized(int[] nums) {
        boolean b = false;
        Set<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if (!set.add(ele)) {
                b = true;
                break;
            }
        }
        return b;
    }
}
