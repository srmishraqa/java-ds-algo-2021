package prog2023.mediumToHard;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] ar = {1, 2};
        int[] br = {3, 4, 5};
        System.out.println(medianOfTwoSortedArr(ar, br));
    }

    public static float medianOfTwoSortedArr(int[] arr, int[] ar) {
        int i = arr.length;
        int j = ar.length;
        int[] sum = new int[i + j];

        int a = 0;
        int b = 0;
        int c = 0;
        float median = 0.0F;

        while (a < i && b < j) {
            if (arr[a] > ar[b]) {
                sum[c] = ar[b];
                b++;
            } else {
                sum[c] = arr[a];
                a++;
            }
            c++;
        }

        while (a < i) {
            sum[c] = arr[a];
            a++;
            c++;
        }

        while (b < j) {
            sum[c] = ar[b];
            b++;
            c++;

        }
        System.out.println(Arrays.toString(sum));
        if (sum.length % 2 == 0) {
            return (((float) sum[sum.length / 2] + (float) sum[(sum.length / 2) - 1]) / 2);
        } else {
            return sum[sum.length / 2];
        }
    }
}
