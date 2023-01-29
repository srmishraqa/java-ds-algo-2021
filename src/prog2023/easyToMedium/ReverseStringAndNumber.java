package prog2023.easyToMedium;

public class ReverseStringAndNumber {
    // reverseStr("apple")  -> elppa
    // reverseStr("John")   -> nhoJ
    // reverseStr("phone")  -> enohp
    // reverseStr("123456") -> "654321"

    public static String reverseStr(String str) {
        // create variable to store reversed version of str
        StringBuilder reverse = new StringBuilder();
        StringBuilder r1 = new StringBuilder(str);
        System.out.println(r1.reverse());

        // iterate over input string from the back with charAt
        for (int i = str.length() - 1; i >= 0; i--) {
            // add chars to reversed variable
            reverse.append(str.charAt(i));
        }

        // convert to string and return reversed version
        return reverse.toString();
    }

    // Time Complexity: O(n)
    // Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects

    public static void main(String[] args) {
        String op = reverseStr("123456");
        System.out.println();
        System.out.println(op);
    }
}
