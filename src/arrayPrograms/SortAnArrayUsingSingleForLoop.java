package arrayPrograms;

import java.util.Arrays;

public class SortAnArrayUsingSingleForLoop {

    public static int[] driverMethod(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                int temp = intArray[i + 1];
                intArray[i + 1] = intArray[i];
                intArray[i] = temp;
                i = -1;
            }
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] inputArray = { 90, 80, 70, 60, 50, 50, 40 };
        System.out.println(Arrays.toString(driverMethod(inputArray)));
    }
}
