package StringProgs;

import java.util.Map;
import java.util.TreeMap;

/**
 * Return Maximum Count of the character in a string
 * If there is an tie between 2 characters then return the one comes first alphabetically
 */

public class ReturnMaximumCountOfCharInAString {
    public static void main(String[] args) {

        System.out.println(driverMethod("zigzag"));
    }

    public static char driverMethod(String str) {

        char[] tempArr = str.toCharArray();
        int length = tempArr.length;
        int count = 0;
        int maxCount = 0;
        char op = ' ';
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();

        while (count != length) {
            if (treeMap.containsKey(tempArr[count]) == false) {
                treeMap.put(tempArr[count], 1);
            } else {
                int oldCount = treeMap.get(tempArr[count]);
                treeMap.put(tempArr[count], oldCount + 1);
            }
            count++;
        }

        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }

        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                op = entry.getKey();
                break;
            }
        }

        return op;
    }
}
