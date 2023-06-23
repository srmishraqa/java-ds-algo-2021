package acceldata;

public class StringCompression {

    // aabbbccddeeeffaa -> abcdefa

    public static String firstCompression(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(firstCompression("aabbbccddeeeffaa"));
        System.out.println(toFormat("aaabbccdeeaaa"));
    }

    // aaabbccdeeaaa -> a3b2c2de2a3

    public static String toFormat(String input) {
        char inChar[] = input.toCharArray();
        String output = "";
        int i;
        for (i = 0; i < input.length(); i++) {
            int count = 1;
            while (i + 1 < input.length() && inChar[i] == inChar[i + 1]) {
                count ++;
                i ++;
            }
            output += inChar[i] + String.valueOf(count);
        }
        return output;
    }
}
