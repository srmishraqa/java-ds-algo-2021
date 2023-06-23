package acceldata;

import java.util.*;

public class MergeSort {
    static List<Integer> list;

    public static Integer[] mergeArray(int[] arr1, int[] arr2) {
        list = new ArrayList<>();

        for (int ele : arr1) {
            if (!list.contains(ele)) {
                list.add(ele);
            }
        }

        for (int ele : arr2) {
            if (!list.contains(ele)) {
                list.add(ele);
            }
        }

        Collections.sort(list);

        return list.toArray(new Integer[list.size()]);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 40, 50};
        int[] arr2 = {1, 5, 10, 20, 20, 65, 100};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }
}
