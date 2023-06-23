package leetCode.easy.array;

import java.util.*;

/*
* Input: nums1 = [1,2,2,1], nums2 = [2,2]
  Output: [2,2]
*
* Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
  Output: [4,9]
  Explanation: [9,4] is also accepted.
*
* */
public class IntersectionOfTwoArrays {

    public static int[] union(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int countTracker = 0;
        for (int ele : nums1) {
            set.add(ele);
        }
        for (int ele : nums2) {
            set.add(ele);
        }
        System.out.println(set.size());
        int[] temp = new int[set.size()];
        for (int ele : set) {
            if (countTracker < set.size()) {
                temp[countTracker++] = ele;

            }
        }

        return temp;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int countTracker = 0;
        for (int ele : nums1) {
            set.add(ele);
        }
        for (int ele : nums2) {
            set2.add(ele);
        }

        for (int ele : set2) {
            if (set.contains(ele)) {
                temp[countTracker++] = ele;
            }
        }

        // System.out.println(set);
        // System.out.println(set2);
        return Arrays.copyOf(temp, countTracker);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 5, 6, 11 };
        int[] arr2 = { 9, 4, 9, 8, 4, 6, 10 };
        System.out.println(Arrays.toString(union(arr, arr2)));
        System.out.println(Arrays.toString(intersection(arr, arr2)));
    }
}
