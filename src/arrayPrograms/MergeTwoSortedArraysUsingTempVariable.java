package arrayPrograms;

import java.util.Arrays;

public class MergeTwoSortedArraysUsingTempVariable {
    public static void main(String[] args) {
        int[] arr1 = {1,9,10,15,90,99};
        int[] arr2 = {2,7,8,14,80,89};
        System.out.println(Arrays.toString(driverMethod(arr1,arr2)));

        int[] arr3 = {9,15,21,27,33,35};
        int[] arr4 = {1,4,7,8,10,12,14,19,20,25,26};

        System.out.println(Arrays.toString(driverMethod(arr3,arr4)));
    }

    public static int[] driverMethod(int[] firstArray, int[] secondArray) {
        int s1 = firstArray.length;
        int s2 = secondArray.length;
        int s = s1 + s2;
        int[] resultantArray = new int[s];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < s1 && j < s2) {
            if (firstArray[i] < secondArray[j]) {
                resultantArray[k] = firstArray[i];
                i++;
            } else {
                resultantArray[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while (i < s1) {
            resultantArray[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < s2) {
            resultantArray[k] = secondArray[j];
            j++;
            k++;
        }
        return resultantArray;
    }
}
