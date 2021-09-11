package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 7, 0, 4, 6, 8, 7, 6, 4, 0};
        // PrintDuplicateElements(arr);
        //PrintDuplicateElementsUsingSet(arr);
        printDuplicatesUsingHashMap(arr);
    }

    // Brute Force - It will print those many times the element is present
    public static void PrintDuplicateElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    // using Set - better

    public static void PrintDuplicateElementsUsingSet(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int no : arr) {
            if (!set.add(no)) {
                System.out.println(no);
            }
        }
    }

    // using HashMap - best

    public static void printDuplicatesUsingHashMap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]) == false) {
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}