package StringProgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacters {
    /**
     * Uses brute force For Solution
     * @param input in String format
     * @return the first non-repeated character of a string
     */
    public static char test(String str) {
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            boolean seenDup = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j)) {
                    seenDup = true;
                    break;
                }
            }
            if (!seenDup)
                return str.charAt(i);
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(test("aaaaab"));
    }

    /**
     * Uses Hashmap For Solution
     * @param input in String format
     * @return the first non-repeated character of a string
     */
    public static char test2(String str) {
        char c = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(hashMap);
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }
        return c;
    }
}
