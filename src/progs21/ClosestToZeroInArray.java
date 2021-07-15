package progs21;

/**
 * find the closest number to zero in an array
 * Given Array A of size N
 * 1<= N <=100
 * Any element of the array should have an absolute value between 1 & 100 - not considered here
 */

public class ClosestToZeroInArray {
    public static void main(String[] args) {
        int arr[] = {7,5,6,0,1,2,10,4};
        int arr1[] ={100};
        int arr2[] ={};
        System.out.println(test(8,arr));
        System.out.println(test(1,arr1));
        System.out.println(test(0,arr2));
    }

    public static int test(int N, int A[]) {
        if (N < 1 || N > 100) {
            return 0;
        } else if (N == 1) {
            return A[0];
        } else {
            int closestToZeroIndex = 0;
            for (int i = 1; i < A.length; i++) {
                if (Math.abs(A[i]) < Math.abs(A[closestToZeroIndex])) {
                    closestToZeroIndex = i;
                }
            }
            return A[closestToZeroIndex];
        }
    }
}
