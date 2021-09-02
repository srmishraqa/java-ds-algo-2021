package java21.collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Take a input string and find out the characters which are repeated more than
 * once
 */

public class SampleProgram {
    public static void main(String[] args) {
        String str = "starting";
        testMethod(str);
    }

    public static void testMethod(String str) {
        char[] temp = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : temp) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey());
            }
        }
    }

}
