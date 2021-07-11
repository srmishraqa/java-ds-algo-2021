package StringProgs;
/*
We have to print count of the consecutive Character occurrence
for Example if the string is like "aaabbbcccddabcd"
then the output should be "a3b3c3d2abcd"
 */

public class PrintCountWithCharacterInAString {
    public static void main(String[] args) {
        System.out.println(driverMethod("aaabbbcccddabcd"));
    }
    public static String driverMethod(String str) {
        String output = "";

        for (int i = 0; i < str.length() ; i++) {

            int count = 1;
            while (i+1<str.length() && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }

            if (count == 1) {
                output = output + str.charAt(i);
            } else {
                output = output + str.charAt(i) + count;
            }
        }


        return output;
    }
}
