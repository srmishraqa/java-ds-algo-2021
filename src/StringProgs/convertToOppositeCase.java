package StringProgs;
/*
 * Input : geeksForgEeks
   Output : GEEKSfORGeEKS
 */

public class convertToOppositeCase {
    public static StringBuffer convertToOppositeCase(StringBuffer str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                str.replace(i, i + 1, Character.toUpperCase(str.charAt(i)) + "");
            } else {
                str.replace(i, i + 1, Character.toLowerCase(str.charAt(i)) + "");
            }
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(convertToOppositeCase(new StringBuffer("geeksForgEeks")));
        String str = "ab";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
