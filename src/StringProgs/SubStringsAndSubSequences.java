package StringProgs;

public class SubStringsAndSubSequences {

    public static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }

        }
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        subString(str1);
        System.out.println("*************");
        subSequence(str1);
    }

    public static void subSequence(String str, String subSequence) {
        if (str.equals("")) {
            System.out.println(subSequence);
            return;
        }
        subSequence(str.substring(1), subSequence + str.charAt(0));
        subSequence(str.substring(1), subSequence);
    }

    public static void subSequence(String str) {
        subSequence(str, "");
    }
}
