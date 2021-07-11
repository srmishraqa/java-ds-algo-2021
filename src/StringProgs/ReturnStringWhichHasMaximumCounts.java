package StringProgs;
/*

There is a String sentence as Input
Return the word which is present most of the times
In case a tie return which comes first in descending Order

* */

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReturnStringWhichHasMaximumCounts {

    public static String driverMethod(String inputSentence) {

        String[] strArray = inputSentence.split(" ");
        int length = strArray.length;
        int count = 0;
        int maxCount = 0;
        String output = null;

        TreeMap<String, Integer> tMap = new TreeMap<String, Integer>(Collections.reverseOrder());
        while (count != length) {
            if (tMap.containsKey(strArray[count]) == false) {
                tMap.put(strArray[count], 1);
            } else {
                int oldCount = tMap.get(strArray[count]);
                tMap.put(strArray[count], oldCount + 1);
            }
            count++;
        }

        for (Map.Entry<String, Integer> entry : tMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : tMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                output = entry.getKey();
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(driverMethod("My dear jumbo zet My dear jumbo zet jumbo"));
    }
}
