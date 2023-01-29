package leetCode.easy.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

* */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int num = 0;
        if (nums.length == 1) {
            num = nums[0];
        } else {
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int ele : nums) {
                if (map.containsKey(ele)) {
                    map.put(ele, map.get(ele) + 1);
                } else {
                    map.put(ele, 1);
                }
            }
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() == 1) {
                    num = e.getKey();
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 6, 7, 1, 1, 2, 2};
        System.out.println(singleNumber(arr1));
    }
}
