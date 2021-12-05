package java8;

/**
 * Print hello world without using main() or static block
 */
public class PrintWithoutMainAndStatic {
    public static int printHello(){
        System.out.println("Hello World!!");
        return 1;
    }

    static int num = printHello();

    public static void main(String[] args) {

    }
}
