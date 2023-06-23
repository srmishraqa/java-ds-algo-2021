package test;


public class ABCD {
    static int a;
    int b;

    public static int master(String str) {
        System.out.println("Print " + str);
        return 10 * 10;
    }

    static {
        int a = master("Soumya");
        System.out.println(a);

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        ABCD ab = new ABCD();
        ab.test();
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(a);

    }

    private void test() {
        System.out.println("private");
    }
}
