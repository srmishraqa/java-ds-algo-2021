package amazon;

/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The relative order of the elements may be changed.
	Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: nums = [0,1,4,0,3,_,_,_]

 */

import java.util.*;

public class Test {

    public static String[] driver(int[] arr, int num) {
        String temp[] = new String[arr.length];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int counter = 0;

//        if (Arrays.asList(arr).indexOf(num) == -1) {
//            return arr;
//        }


        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> e : entries) {
            int temp1 = e.getKey();
            for (int i = 0; i < e.getValue(); i++) {
                if (temp1 != num) {
                    temp[counter++] = temp1 + "";
                }
            }
        }

        for (int i = counter; i < arr.length; i++) {
            temp[i] = "_";
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        //driver(nums,val);
        System.out.println(Arrays.toString(driver(nums, val)));
        //System.out.println(Arrays.toString(driver(nums,5)));
    }

    public static String[] driver2(int[] arr, int num) {
        String[] temp = new String[arr.length];
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                start = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == num) {
                        end = j;
                    }
                }
            }

        }

        return temp;
    }

}
