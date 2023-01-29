package prog2023.easyToMedium;

import java.util.Arrays;

//Write a method that will take an array as an argument and reverse it.
// revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
// revArr({1})             -> {1}
// revArr({1, 2, 3})       -> {3, 2, 1}
public class ReverseAnArray {

    public static int[] reverseArray(int[] arr1) {
        if(arr1.length>0) {
            // we will use two 'pointers'. One pointer will start from the beginning
            // another one from the back , we will swap their values
            // our loop will go till half of our input array
            // 'i' is a pointer that will start from the beginning
            // 'array.length-1-i' is a pointer will start from the end
            for (int i = 0; i < arr1.length / 2; i++) {
                int temp = arr1[i];
                arr1[i] = arr1[arr1.length - 1 - i];
                arr1[arr1.length - 1 - i] = temp;
            }
            return arr1;
        }
        else{
            int arr[] = {};
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] op = reverseArray(ar1);
        System.out.println(Arrays.toString(op));
    }
}
// Time Complexity: O(n/2) but basically we can say O(n)
// Note:
// Array works with references(same objects) so if we will modify argument
// it will have effect on an original array.