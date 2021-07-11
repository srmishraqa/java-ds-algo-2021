package StringProgs;

public class ReverseAStringUsingSwapMechanism {

    static void swap(char[] arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static String reverse(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return reversedString(arr);
    }

    static String reversedString(char[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i];
        }
        return output;

    }

    public static void main(String[] args) {
        String ip = "abcdefghij";
        System.out.println(reverse(ip.toCharArray()));
    }
}
