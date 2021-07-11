package progs21;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * input string -> "MICROFOCUS"
 * So only C and O are repeated twice
 * In case any letter repeated maximum times then return that letter
 * In case two letter have same maximum Frequency then return the letter which come alphabetically last
 * So the Output should be 'O'
 * if input is -> "MICROFOCUSS" then output is 'S'
 */

public class HighestFrequencyOfRepeatedCharacters {

    public static char returnMostRepeatedLetter(String str) {
        char output = ' ';
        //convert String to char Array
        char[] arr = str.toCharArray();

        //Convert Char Array to TreeMap in reverse Order
        Map<Character, Integer> map = new TreeMap<Character, Integer>(Collections.reverseOrder());
        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            i++;
        }

        // Traversing the map using entry set and storing the max frequency
        int maxFreq = 1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }

        //again traversing to find the most repeated character and reverse order will be handled by Treemap and break statement inside if loop
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                output = entry.getKey();
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "MICROFOCUSS";
        char c = returnMostRepeatedLetter(input);
        System.out.println(c);
    }

}
