package StringProgs;

import java.util.HashSet;

public class LongestSubstringLengthWithoutRepeatingChars {

    public static int longestSubStr(String str) {
        int ptr_a = 0;
        int ptr_b = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (ptr_b < str.length()) {
            if (!hashSet.contains(str.charAt(ptr_b))) {
                hashSet.add(str.charAt(ptr_b));
                ptr_b++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(str.charAt(ptr_a));
                ptr_a++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestSubStr("abcdebcd"));
        //System.out.println(longestSameLetteredSubStr("abcbcabb"));
    }

//    public static int longestSameLetteredSubStr(String s) {
//        int ans = 1, temp = 1;
//
//        // Traverse the string
//        for (int i = 1; i < s.length(); i++) {
//            // If character is same as
//            // previous increment temp value
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                ++temp;
//            } else {
//                ans = Math.max(ans, temp);
//                temp = 1;
//            }
//        }
//        ans = Math.max(ans, temp);
//
//        // Return the required answer
//        return ans;
//    }
}
