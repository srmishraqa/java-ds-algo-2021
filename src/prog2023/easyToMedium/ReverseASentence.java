package prog2023.easyToMedium;

import java.util.Arrays;

public class ReverseASentence {
    // revWords("apple banana kiwi") -> "kiwi banana apple"
    // revWords("I am John Doe")     -> "Doe John am I"
    // revWords("orange")            -> "orange"

    public static String reverseSentence(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] temp = sentence.split(" ");
        for (int i = temp.length - 1; i >= 0; i--) {
            sb = sb.append(temp[i] + " ");
        }
        // loop over the array from back
        // add words to string builder obj with space
        // trim needed to remove last space in the end
        System.out.println(sb);
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "apple banana kiwi that a though can be";
        input = reverseSentence(input);
        System.out.println(input);
    }

    // Time Complexity: O(n)
    // Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects
}
