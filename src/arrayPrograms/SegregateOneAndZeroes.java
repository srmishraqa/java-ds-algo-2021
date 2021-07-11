package arrayPrograms;

import java.util.Arrays;

/*
if an array = {1,0,1,0,0,1,1,1,0,0};
Then Segregate all 1 to right hand side and all zeroes to the left hand side
or vice versa
op -> {1,1,1,1,1,0,0,0,0,0}

 */
public class SegregateOneAndZeroes {

    public static void main(String[] args) {
        int[] testArray = {1, 0, 1, 0, 0, 1, 1, 1, 0, 0};
        System.out.println(Arrays.toString(driverMethod(testArray)));
        System.out.println(Arrays.toString(driverMethod2(testArray)));
    }

    public static int[] driverMethod(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 1;
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static int[] driverMethod2(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }
}
