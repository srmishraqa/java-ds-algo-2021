package test;

import java.util.Arrays;

public class StackInArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        push(arr, 9);
        System.out.println(Arrays.toString(arr));
        push(arr,8);
        System.out.println(Arrays.toString(arr));
        pop(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void push(int[] arr,int a){
        for(int i=arr.length -1;i>=0;i--){
            if(arr[i] == 0){
                arr[i] = a;
                break;
            }
        }
    }

    public static  void pop(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != 0){
                arr[i] = 0;
            }
        }
    }
}
