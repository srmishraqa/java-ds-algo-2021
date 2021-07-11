package arrayPrograms;

/*

 * If the array is like this
 * {1,2,3,4,5} -> the output should be an array
 * op -> {120,60,40,30,24}

 * */

import java.util.Arrays;

public class MultiplicationOfArrayElementsExcludingTheCurrentElement {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(driverMethod(intArray)));
    }

    public static int[] driverMethod(int[] arr) {
        int length = arr.length;
        int[] tempArr = new int[length];

        for (int i = 0; i < length; i++) {
            int product = 1;
            for (int j = 0; j < length; j++) {
                product *= arr[j];
            }
            product = product / arr[i];
            tempArr[i] = product;

        }
        return tempArr;
    }

}
