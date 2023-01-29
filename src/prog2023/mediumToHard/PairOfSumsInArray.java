package prog2023.mediumToHard;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given an array arr[] = {5, 10, 15, 25, 20, 30, 0}; find the elements where the sum is equal to k = 25.
 * Here you can add pick 25 and say it is equal to k, pick 2 elements to add it
 * and say it is equal to k, or pick 'n' elements from the array and say it is equal to k.
 * immediately find all the array elements that creating the addition to k.
 * {0, 1, 3, 4, 5, 8, 7, 9} -> should be 4 including (4,4)
 * */
public class PairOfSumsInArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5, 8, 7, 9};
        int op = bruteForce(arr, 8);
        System.out.println("Using brute force the sum of pair is : " + op);
//        op = sumPairs(arr, 8);
//        System.out.println(op);
    }

    // It will take the combination as well as opposite combination
    // That's why it might show as mismatching
    public static int bruteForce(int[] arr, int sum) {
        int count = 0;
        Set<Point> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                s.add(new Point(arr[i], arr[j]));
            }
        }

        for (Point p : s
        ) {
            if (p.getX() + p.getY() == sum) {
                System.out.println("Unique Pair is {" + (int) p.getX() + ", " + (int) p.getY() + " }");
                count++;
            }
        }
        return count;
    }

//    public static int sumPairs(int[] input, int sum) {
//        Map<Integer, Integer> frequencies = new HashMap<>();
//        int pairsCount = 0;
//
//        for (int i = 0; i < input.length; i++) {
//            int value = input[i];
//            int complement = sum - input[i];
//
//            if (frequencies.containsKey(complement)) {
//                int freq = frequencies.get(complement) - 1;
//                pairsCount++;
//                //System.out.println(value + ", " + complement);
//                if (freq == 0) {
//                    frequencies.remove(complement);
//                } else {
//                    frequencies.put(complement, freq);
//                }
//            } else {
//                if (frequencies.containsKey(value)) {
//                    frequencies.put(value, frequencies.get(value) + 1);
//                } else {
//                    frequencies.put(value, 1);
//                }
//            }
//        }
//        return pairsCount;
//    }
}
