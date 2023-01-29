package prog2023.mediumToHard;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeSubString {
    public static boolean isPalindrome(String str) {
        boolean isPal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPal = false;
            }
        }
        return isPal;
    }

    /*
     * Brute Force
     * Create all possible Substrings by 2 for loops
     * Put that inside ArrayList
     * We are using Arraylist to avoid length constraint
     * Again Try to traverse through the array list and see if the element is palindrome or not
     * If yes , we need to check the current element length is greater than the actual length or not
     * If yes we need to replace and that's the output for the length
     * now again traverse through the array list and if palindrome
     * */
    public static void bForce(String str) {
        int length = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        System.out.println(list);
        for (String s : list
        ) {
            if (isPalindrome(s) && s.length() > length) {
                length = s.length();
            }
        }
        for (String s : list
        ) {
            if (isPalindrome(s) && s.length() == length) {
                System.out.println("LONGEST PALINDROMIC SUBSTRING : " + s);
            }
        }
        System.out.println("LENGTH : " + length);

    }

    public static void main(String[] args) {
        String s = "tenet";
        System.out.println(isPalindrome(s));
        s = "acacacb";
        bForce(s);
    }
}
