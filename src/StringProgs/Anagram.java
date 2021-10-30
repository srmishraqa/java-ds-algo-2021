package StringProgs;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        boolean isAnagram = true;
        if (s1.length() != 0 &&
                s2.length() != 0 &&
                s1.length() == s2.length()
        ) {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("heart", "earth"));
    }
}
