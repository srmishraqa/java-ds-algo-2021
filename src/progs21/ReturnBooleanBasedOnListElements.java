package progs21;

import java.util.*;

/**
 * Return true if it contains 0,0,7 in the same sequence in any list of integers
 * Note : Return true also any no of elements between 0,0 & 7
 * Example 1 -> [1,2,3,0,0,7,3,4,77]
 * Example 2 -> [4,5,0,35,11,99,0,100,200,7,88]
 * Returns true for example 1 and 2
 * <p>
 * Example 3 -> [1,2,3,4,5,6,7,0,0,100]
 * Example 4 -> [1,2,3]
 * Returns false for example 3 & 4
 */

public class ReturnBooleanBasedOnListElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0, 0, 100};
        for (int ele : arr) {
            list.add(ele);
        }
        System.out.println(list);
        boolean flag = test(list);
        System.out.println(flag);
    }

    public static boolean test(List<Integer> list) {
        if ((list.contains(0) && list.contains(7)) != false) {
            int ptr_a = list.indexOf(0);
            int ptr_b = 0;
            for (int i = ptr_a + 1; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    ptr_b = i;
                    break;
                }
            }
            for (int j = ptr_a + 1; j < ptr_b; j++) {
                if (list.get(j) == 7) {
                    return false;
                } else {
                    for (int k = ptr_b + 1; k < list.size(); k++) {
                        if (list.get(k) == 7) {
                            return true;
                        }

                    }
                }
            }
        }
        return false;
    }
}
