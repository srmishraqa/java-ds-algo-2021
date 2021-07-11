package test;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "abc defgh";
        System.out.println(Arrays.toString(reverseAString(str)));
    }

    public static char[] reverseAString(String str) {
        char[] testArray = str.toCharArray();
        String output = "";
        for (int i = 0; i <= str.length() / 2; i++) {
            testArray = swap(testArray, i, str.length() - 1 - i);

        }
//        for (int j = 0; j < str.length(); j++) {
//            output = output + testArray[j];
//        }
//        return output;
        return testArray;
    }

    public static char[] swap(char[] arr, int index, int sec) {
        char temp = arr[index];
        arr[index] = arr[sec];
        arr[sec] = temp;
        return arr;
    }


}
