package progs21;

/*
Question asked by - Opentext

int[] arr = { 2, 3, 6, 5, 1, 3, 4, 2, 2, 6,3 };
3 is 3 times --> so 3

int[] arr = {2, 3, 6, 5, 1,1, 3, 4, 2, 2, 6, 3,3};
No number is repeated those many times
so the result will be zero
 */

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReturnHighestNumberWIthMatchingHighestFrequency {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 5, 1, 3, 4, 2, 2, 6, 3};
        //int[] arr = {2, 3, 6, 5, 1,1, 3, 4, 2, 2, 6, 3,3};
        System.out.println(returnLargestNumber(arr));
    }

    public static int returnLargestNumber(int[] array) {
        int i = 0;
        int output = 0;

        Map<Integer, Integer> hashMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        while (i < array.length) {
            if (!hashMap.containsKey(array[i])) {
                hashMap.put(array[i], 1);
            } else {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
            i++;
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                output = entry.getKey();
                break;
            } else {
                output = 0;
            }
        }
        return output;
    }

}
