package prog2023.easyToMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an array arr[] = {6, 0, -4, 4, 8}. Irrespective of the signs for the given integers.
// Find the count of unique values. The array may grow further.
public class HowManyUniqueNumbers {
    public static int count(int[] arr) {
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(Math.abs(arr[i]));
        }
        return set.size();
    }


    public static void main(String[] args) {
        int[] arr = {-8, 6, 0, -4, 4, 8};
        int op = count(arr);
        System.out.println(op);
    }
}
