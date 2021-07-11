package StringProgs;

public class ReverseBasedOnT {
    public static String driver(String str) {
        if ((str.indexOf('t') % 2) == 0) {
            return reverse(str);
        } else {
            return str;
        }

    }

    public static String reverse(String s) {
        String output = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            output = output + s.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        //System.out.println(driver("test"));
        System.out.println(reverse("test"));
        System.out.println("text".indexOf('t'));
    }
}
