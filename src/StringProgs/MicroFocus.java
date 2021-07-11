package StringProgs;

public class MicroFocus {
    public static void main(String[] args) {
        String str = "MMMIIICCROOOOFFFFFOOOOCCCUUUSSSSS";
        System.out.println(microFocus(str));
    }

    public static String microFocus(String str) {
        String op = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                op = op + str.charAt(i);
            }

        }
        op = op + str.charAt(str.length() - 1);
        return op;
    }
}
