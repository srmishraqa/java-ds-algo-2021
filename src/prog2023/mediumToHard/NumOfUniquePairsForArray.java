package prog2023.mediumToHard;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/*
* Given an array of N elements,
* the task is to find all the unique pairs that can be formed using the elements of a given array.

Input: arr[] = {1, 1, 2}
Output: 4
(1, 1), (1, 2), (2, 1), (2, 2) are the only possible pairs.

Input: arr[] = {1, 2, 3}
Output: 9

 * */
public class NumOfUniquePairsForArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {1, 1, 2};
        int op = noOfUnqCombination(arr2);
        int op2 = noOfUnqCombinationOptimized(arr);
        System.out.println("Using Non-optimized Way:");
        System.out.println(op);
        System.out.println("Using Optimized Way:");
        System.out.println(op2);
    }

    // Non - optimized brute force solution
    //Time Complexity: O(n2)
    public static int noOfUnqCombination(int[] arr) {
        Set<Point> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                set.add(new Point(arr[i], arr[j]));
            }
        }
        return set.size();
    }

    //Optimized Way
    //Time Complexity: O(n)
    //Auxiliary Space: O(n)
    public static int noOfUnqCombinationOptimized(int[] arr) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return (int) Math.pow(set.size(), 2);
    }
}
