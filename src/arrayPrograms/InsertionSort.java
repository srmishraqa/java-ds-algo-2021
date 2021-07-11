package arrayPrograms;

import java.util.Arrays;

public class InsertionSort {
    public static final String str=" ";
    public static void sort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;

        }
    }
    public static void main(String[] args) {
        int[] intArray = {100,90,30,80,70,60,50,40,30,30,10};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

}
