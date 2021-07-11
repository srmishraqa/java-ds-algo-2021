package arrayPrograms;

public class TestABCA {

    public static String convertString(String s) {
        String opString = "";
        for (int i = 0; i < s.length(); i++) {

            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }

            if (count == 1) {
                opString = opString + s.charAt(i) ;
            } else {
                opString = opString + s.charAt(i) + count;
            }

        }
        return opString;
    }

    public static void main(String[] args) {
        System.out.println(convertString("aaabbbcccdddaabbab"));
    }
}
