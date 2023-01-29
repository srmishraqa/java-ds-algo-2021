package leetCode.easy.array;

import java.util.Arrays;

/*
* Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
* */
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 0, 12, 13, 15, 18, 0, 17};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    public static int[] moveZeros(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[temp] = arr[i];
                temp++;
            }
        }
        for (int i = temp; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
