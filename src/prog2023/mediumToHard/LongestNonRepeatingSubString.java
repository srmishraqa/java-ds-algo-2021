package prog2023.mediumToHard;

import java.util.*;

public class LongestNonRepeatingSubString {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        bForce(str);
        System.out.println(optimized(str));
    }

    /*
     * Brute Force
     * Create all possible Substrings
     * Put that inside ArrayList provided the substring has only unique elements
     * We are using Arraylist to avoid length constraint
     * Again Try to traverse and put the entire array to set
     * Now traverse the entire set , store the max length and the element and return both
     * If length is asked return length
     * If substring is asked return the substring
     * */

    public static void bForce(String str) {
        int length = 0;
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (unique(str.substring(i, j))) {
                    set.add(str.substring(i, j));
                }
            }
        }
        System.out.println(set);
        //here the all possible sub strings are stored in the list

        for (String s : set
        ) {
            if (s.length() > length) {
                length = s.length();
            }

        }
        for (String s : set
        ) {
            if (s.length() == length) {
                System.out.println("LONGEST SUBSTRING : " + s);
            }

        }
        System.out.println("LENGTH : " + length);

    }

    public static boolean unique(String str) {
        boolean flag = false;
        Set<Character> set = new HashSet<>();
        for (char a : str.toCharArray()) {
            set.add(a);
        }
        if (str.toCharArray().length == set.size()) {
            flag = true;
        }

        return flag;
    }

    // Optimized Solution
    public static int optimized(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, right = 0;
        int n = str.length();
        int len = 0;
        while (right < n) {
            if (hashMap.containsKey(str.charAt(right))) {
                left = Math.max(hashMap.get(str.charAt(right)) + 1, left);
            }
            hashMap.put(str.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right ++;
        }
        return len;
    }
}
