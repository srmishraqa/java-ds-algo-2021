package prog2023.easyToMedium;

public class PalindromeNum {
    public static void main(String[] args) {
        int a = 121;
        boolean k = isPal(a);
        System.out.println(k);

    }

    public static boolean isPal(int num) {
        int init = num;
        int op = 0;
        while (num > 0) {
            int rem = num % 10;
            op = op * 10 + rem;
            num = num / 10;
        }
        System.out.println(op);
        if (op == init) {
            return true;
        } else {
            return false;
        }
    }
}
