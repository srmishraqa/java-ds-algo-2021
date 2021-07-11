package StringProgs;
/*
 * Input String = My dear deer is very dear to me
 * dear -> returns count as 2
 * there -> returns count as -1 as it is not present
 *
 * */

import java.util.Arrays;
import java.util.HashMap;

public class VerifyElementPresentAndReturnCount {
    public static int returnCount(String inputSentence, String desiredString) {
        String[] convertedStringArray = inputSentence.split(" ");
        if (Arrays.asList(convertedStringArray).contains(desiredString)) {
            int tempCount = 0;
            int length = convertedStringArray.length;
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            while (tempCount != length) {
                if (hashMap.containsKey(convertedStringArray[tempCount]) == false) {
                    hashMap.put(convertedStringArray[tempCount], 1);
                } else {
                    int oldCount = hashMap.get(convertedStringArray[tempCount]);
                    hashMap.put(convertedStringArray[tempCount], oldCount + 1);
                }
                tempCount++;
            }
            return hashMap.get(desiredString);

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        //System.out.println(returnCount("My dear deer is very dear to me","dear"));
        //System.out.println(returnCount("My dear deer is very dear to me","there"));
        System.out.println(returnCount("My dear deer is very dear to me", "deer"));
    }
}
