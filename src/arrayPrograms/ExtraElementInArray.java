package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class ExtraElementInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 4, 3, 5, 6, 2};
        printDuplicateElements(arr1,arr2);
    }

    public static void printDuplicateElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        for (int element : arr1
        ) {
            set.add(element);
        }
        for (int element : arr2
        ) {
            set.add(element);
        }

        for(int element:set1){
            if(!set.contains(element)){
                System.out.println(element);
            }
        }
    }
}
